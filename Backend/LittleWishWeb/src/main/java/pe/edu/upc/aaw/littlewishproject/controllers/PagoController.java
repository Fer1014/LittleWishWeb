package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.PagoDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Pago;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IPagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pagos")
public class PagoController {
    @Autowired
    private IPagoService pS;

    @PostMapping
    @PreAuthorize("hasAuthority('EMPRESARIO')")
    public void Registrar(@RequestBody PagoDTO dto){
        ModelMapper mp=new ModelMapper();
        Pago pago=mp.map(dto,Pago.class);
        pS.insert(pago);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('EMPRESARIO')")
    public List<PagoDTO> Listar(){

        return pS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PagoDTO.class);
        }).collect(Collectors.toList());

    }
}

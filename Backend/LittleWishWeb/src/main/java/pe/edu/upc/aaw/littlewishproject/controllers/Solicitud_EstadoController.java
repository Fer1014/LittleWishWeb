package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.Solicitud_EstadoDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Solicitud_Estado;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.ISolicitud_EstadoService;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Solicitudes Estado")
public class Solicitud_EstadoController {

    @Autowired
    private ISolicitud_EstadoService sS;
    @PostMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void Insertar(@RequestBody Solicitud_EstadoDTO dto){
        ModelMapper m = new ModelMapper();
        Solicitud_Estado s=m.map(dto,Solicitud_Estado.class);
        sS.insert(s);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<Solicitud_EstadoDTO> listar() {
        return sS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, Solicitud_EstadoDTO.class);
        }).collect(Collectors.toList());
    }

}

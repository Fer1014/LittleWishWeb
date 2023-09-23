package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.SolicitudDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Solicitud;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.ISolicitudService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Solicitudes")
public class SolicitudController {
    @Autowired
    private ISolicitudService soS;
    @PostMapping
    public void Insertar(@RequestBody SolicitudDTO dto){
        ModelMapper m=new ModelMapper();
        Solicitud s=m.map(dto,Solicitud.class);
        soS.insert(s);
    }

    @GetMapping//obtener
    public List<SolicitudDTO> listar(){
        //Usamos get para obtener los
        return  soS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,SolicitudDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void Eliminar(@PathVariable("id")Integer id){
        soS.eliminar(id);
    }
}

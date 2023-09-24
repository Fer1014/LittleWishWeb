package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.ProyectoDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Proyecto;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IProyectoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/proyectos")
public class ProyectoController {
    @Autowired
    private IProyectoService poS;

    @PostMapping
    @PreAuthorize("hasAuthority('EMPRESARIO')")
    public void Registrar(@RequestBody ProyectoDTO dto) {
        ModelMapper m = new ModelMapper();
        Proyecto t = m.map(dto, Proyecto.class);
        poS.insert(t);
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR')")
    public List<ProyectoDTO> listar() {
        return poS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ProyectoDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR')")
    public void modificar(@RequestBody ProyectoDTO dto) {
        ModelMapper m = new ModelMapper();
        Proyecto p = m.map(dto, Proyecto.class);
        poS.insert(p);
    }

    
}

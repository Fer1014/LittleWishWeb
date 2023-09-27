package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.ProyectosDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Proyectos;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IProyectosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/proyectos")

public class ProyectosController {
    @Autowired
    private IProyectosService pS;

    @PostMapping
    @PreAuthorize("hasAuthority('EMPRESARIO')")
    public void Registrar(@RequestBody ProyectosDTO dto) {
        ModelMapper m = new ModelMapper();
        Proyectos t = m.map(dto, Proyectos.class);
        pS.insert(t);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('DESARROLLADOR')")
    public List<ProyectosDTO> listar() {
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ProyectosDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR') or hasAuthority('EMPRESARIO')")
    public void modificar(@RequestBody ProyectosDTO dto) {
        ModelMapper m = new ModelMapper();
        Proyectos p = m.map(dto, Proyectos.class);
        pS.insert(p);
    }

    @GetMapping("/descripcion")
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('EMPRESARIO') or hasAuthority('DESARROLLADOR') ")
    public ProyectosDTO BuscarNombreProyecto(@RequestParam("descripcion") String descripcion) {
        Proyectos proyecto = pS.buscarProyecto(descripcion);
        if (proyecto != null) {
            ModelMapper m = new ModelMapper();
            return m.map(proyecto, ProyectosDTO.class);
        } else {
            return null;
        }
    }
}

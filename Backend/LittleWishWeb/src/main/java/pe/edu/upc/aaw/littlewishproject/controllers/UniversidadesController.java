package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.UniversidadesDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Universidades;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IUniversidadesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/universidad")
public class UniversidadesController {
    @Autowired
    private IUniversidadesService uS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void registrar(@RequestBody UniversidadesDTO dto) {
        ModelMapper m = new ModelMapper();
        Universidades u = m.map(dto, Universidades.class);
        uS.insert(u);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<UniversidadesDTO> listar() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UniversidadesDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void eliminar(@RequestParam("id") Integer id) {
        uS.delete(id);
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void modificar(@RequestBody UniversidadesDTO dto) {
        ModelMapper m = new ModelMapper();
        Universidades u = m.map(dto, Universidades.class);
        uS.insert(u);
    }
}

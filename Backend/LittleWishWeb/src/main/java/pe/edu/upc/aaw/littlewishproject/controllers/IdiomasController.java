package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.IdiomasDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Idiomas;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IIdiomasService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/idiomas")
public class IdiomasController {
    @Autowired
    private IIdiomasService iS;

    @PostMapping
    @PreAuthorize("hasAuthority('DESARROLLADOR')")
    public void registrar(@RequestBody IdiomasDTO dto) {
        ModelMapper m = new ModelMapper();
        Idiomas u = m.map(dto, Idiomas.class);
        iS.insert(u);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('DESARROLLADOR')")
    public List<IdiomasDTO> listar() {
        return iS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, IdiomasDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping
    @PreAuthorize("hasAuthority('DESARROLLADOR')")
    public void eliminar(@RequestParam("id") Integer id) {
        iS.delete(id);
    }
    @PutMapping
    @PreAuthorize("hasAuthority('DESARROLLADOR')")
    public void modificar(@RequestBody IdiomasDTO dto) {
        ModelMapper m = new ModelMapper();
        Idiomas i = m.map(dto, Idiomas.class);
        iS.insert(i);
    }
}



package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.Formacion_AcademicaDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Formacion_Academica;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IFormacion_AcademicaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/formacion_academica")
public class Formacion_AcademicaController {
    @Autowired
    private IFormacion_AcademicaService faS;

    @PostMapping
    public void registrar(@RequestBody Formacion_AcademicaDTO dto) {
        ModelMapper m = new ModelMapper();
        Formacion_Academica fa = m.map(dto, Formacion_Academica.class);
        faS.insert(fa);
    }

    @GetMapping
    public List<Formacion_AcademicaDTO> listar() {
        return faS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, Formacion_AcademicaDTO.class);
        }).collect(Collectors.toList());
    }
}

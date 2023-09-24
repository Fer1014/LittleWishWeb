package pe.edu.upc.aaw.littlewishproject.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.littlewishproject.dtos.CertificacionesDTO;
import pe.edu.upc.aaw.littlewishproject.entities.Certificaciones;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.ICertificacionesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/certificaciones")
public class CertificacionesController {
    @Autowired
    private ICertificacionesService cS;

    @PostMapping
    @PreAuthorize("hasAuthority('DESARROLLADOR')")
    public void registrar(@RequestBody CertificacionesDTO dto) {
        ModelMapper m = new ModelMapper();
        Certificaciones c = m.map(dto, Certificaciones.class);
        cS.insert(c);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('DESARROLLADOR')")
    public List<CertificacionesDTO> listar() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CertificacionesDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping
    @PreAuthorize("hasAuthority('DESARROLLADOR')")
    public void eliminar(@RequestParam("id") Integer id) {
        cS.delete(id);
    }

    @PutMapping
    @PreAuthorize("hasAuthority('DESARROLLADOR')")
    public void modificar(@RequestBody CertificacionesDTO dto) {
        ModelMapper m = new ModelMapper();
        Certificaciones c = m.map(dto, Certificaciones.class);
        cS.insert(c);
    }
}
package pe.edu.upc.aaw.demo2_sv64.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demo2_sv64.Dtos.CertificationsDTO;
import pe.edu.upc.aaw.demo2_sv64.Entities.Certifications;
import pe.edu.upc.aaw.demo2_sv64.ServiceInterfaces.CertificationsServiceInterfaces;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/certifications")

public class CertificationsController {
    @Autowired
    private CertificationsServiceInterfaces cS;

    @PostMapping
    public void registrar(@RequestBody CertificationsDTO dto) {
        ModelMapper m = new ModelMapper();
         Certifications c = m.map(dto, Certifications.class);
        cS.insert(c);
    }

    @GetMapping
    public List<CertificationsDTO> listar() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x,CertificationsDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping
    public void eliminar(@RequestParam("id") Integer id) {
        cS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody CertificationsDTO dto) {
        ModelMapper m = new ModelMapper();
        Certifications c = m.map(dto, Certifications.class);
        cS.insert(c);
    }


}
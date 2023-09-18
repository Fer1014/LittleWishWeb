package pe.edu.upc.aaw.demo2_sv64.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demo2_sv64.Dtos.CertificationsDTO;
import pe.edu.upc.aaw.demo2_sv64.Dtos.LanguajesDTO;

import pe.edu.upc.aaw.demo2_sv64.Entities.Languages;

import pe.edu.upc.aaw.demo2_sv64.ServiceInterfaces.LanguagesServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/languajes")
public class LanguajesController {

    @Autowired
    private LanguagesServiceInterface lS;

    @PostMapping
    public void registrar(@RequestBody CertificationsDTO dto) {
        ModelMapper m = new ModelMapper();
        Languages l = m.map(dto, Languages.class);
        lS.insert(l);
    }

    @GetMapping
    public List<LanguajesDTO> listar() {
        return lS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x,LanguajesDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping
    public void eliminar(@RequestParam("id") Integer id) {
        lS.delete(id);
    }


    @PutMapping
    public void modificar(@RequestBody CertificationsDTO dto) {
        ModelMapper m = new ModelMapper();
        Languages l = m.map(dto, Languages.class);
        lS.insert(l);
    }
}


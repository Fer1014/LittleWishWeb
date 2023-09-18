package pe.edu.upc.aaw.demo2_sv64.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.aaw.demo2_sv64.Dtos.WorkExperienceDTO;

import pe.edu.upc.aaw.demo2_sv64.Entities.WorkExperience;
import pe.edu.upc.aaw.demo2_sv64.ServiceInterfaces.WorkExperienceServiceInterfaces;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/WorkExperience")
public class WorkExperienceController {
    @Autowired
    private WorkExperienceServiceInterfaces wE;

    @PostMapping
    public void registrar(@RequestBody WorkExperienceDTO dto) {
        ModelMapper m = new ModelMapper();
        WorkExperience w = m.map(dto, WorkExperience.class);
        wE.insert(w);
    }

    @GetMapping
    public List<WorkExperienceDTO> listar() {
        return wE.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, WorkExperienceDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping
    public void eliminar(@RequestParam("id") Integer id) {
        wE.delete(id);
    }


    @PutMapping
    public void modificar(@RequestBody WorkExperienceDTO dto) {
        ModelMapper m = new ModelMapper();
        WorkExperience w = m.map(dto, WorkExperience.class);
        wE.insert(w);
    }
}

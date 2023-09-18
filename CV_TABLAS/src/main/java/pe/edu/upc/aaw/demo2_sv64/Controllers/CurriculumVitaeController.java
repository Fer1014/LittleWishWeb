package pe.edu.upc.aaw.demo2_sv64.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demo2_sv64.Dtos.CurriculumVitaeDTO;
import pe.edu.upc.aaw.demo2_sv64.Entities.CurriculumVitae;
import pe.edu.upc.aaw.demo2_sv64.ServiceInterfaces.CurriculumVitaeServiceInterface;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/CurriculumVitae")
public class CurriculumVitaeController{
    @Autowired
    private CurriculumVitaeServiceInterface cS;

    @PostMapping
    public void registrar(@RequestBody CurriculumVitaeDTO dto) {
        ModelMapper m = new ModelMapper();
        CurriculumVitae cv = m.map(dto, CurriculumVitae.class);
        cS.insert(cv);
    }

    @GetMapping
    public List<CurriculumVitaeDTO> listar() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CurriculumVitaeDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping
    public void eliminar(@RequestParam("id") Integer id) {
        cS.delete(id);
    }


    @PutMapping
    public void modificar(@RequestBody CurriculumVitaeDTO dto) {
        ModelMapper m = new ModelMapper();
        CurriculumVitae cv = m.map(dto, CurriculumVitae.class);
        cS.insert(cv);
    }
}

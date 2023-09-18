package pe.edu.upc.aaw.demo2_sv64.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo2_sv64.Entities.CurriculumVitae;
import pe.edu.upc.aaw.demo2_sv64.Repositories.CurriculumVitaeRepository;
import pe.edu.upc.aaw.demo2_sv64.ServiceInterfaces.CurriculumVitaeServiceInterface;

import java.util.List;

@Service
public class CurriculumVitaeServiceImplement implements CurriculumVitaeServiceInterface {
    @Autowired
    private CurriculumVitaeRepository curriculumVitaeRepository;

    @Override
    public void insert(CurriculumVitae curriculumVitae) {
        curriculumVitaeRepository.save(curriculumVitae);
    }

    @Override
    public List<CurriculumVitae> list() {
        return curriculumVitaeRepository.findAll();
    }

    @Override
    public void delete(int id_CV) {
        curriculumVitaeRepository.deleteById(id_CV);
    }
}

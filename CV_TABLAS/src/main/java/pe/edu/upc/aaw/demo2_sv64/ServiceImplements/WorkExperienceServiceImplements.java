package pe.edu.upc.aaw.demo2_sv64.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo2_sv64.Entities.WorkExperience;
import pe.edu.upc.aaw.demo2_sv64.Repositories.WorkExperienceRepository;
import pe.edu.upc.aaw.demo2_sv64.ServiceInterfaces.WorkExperienceServiceInterfaces;

import java.util.List;
@Service
public class WorkExperienceServiceImplements implements WorkExperienceServiceInterfaces {
    @Autowired

    private WorkExperienceRepository wE;
    @Override
    public void insert(WorkExperience workExperience){
        wE.save(workExperience);
    }

    @Override
    public List<WorkExperience> list() {
        return wE.findAll();
    }

    @Override
    public void delete(int idExperienciaLaboral) {
        wE.deleteById(idExperienciaLaboral);
    }
}

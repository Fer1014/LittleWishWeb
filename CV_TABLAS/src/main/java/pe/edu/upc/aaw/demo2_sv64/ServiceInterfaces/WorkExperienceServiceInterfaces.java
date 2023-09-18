package pe.edu.upc.aaw.demo2_sv64.ServiceInterfaces;

import pe.edu.upc.aaw.demo2_sv64.Entities.WorkExperience;

import java.util.List;

public interface WorkExperienceServiceInterfaces {
    public  void insert(WorkExperience workExperience);
    public List<WorkExperience> list();
    public void delete(int idExperienciaLaboral);
}

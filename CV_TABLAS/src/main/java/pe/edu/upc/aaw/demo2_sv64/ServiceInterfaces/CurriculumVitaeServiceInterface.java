package pe.edu.upc.aaw.demo2_sv64.ServiceInterfaces;

import pe.edu.upc.aaw.demo2_sv64.Entities.CurriculumVitae;

import java.util.List;

public interface CurriculumVitaeServiceInterface {
    void insert(CurriculumVitae curriculumVitae);

    List<CurriculumVitae> list();

    void delete(int id_CV);
}

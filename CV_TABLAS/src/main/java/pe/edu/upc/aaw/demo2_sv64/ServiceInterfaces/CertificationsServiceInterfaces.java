package pe.edu.upc.aaw.demo2_sv64.ServiceInterfaces;

import pe.edu.upc.aaw.demo2_sv64.Entities.Certifications;

import java.util.List;

public interface CertificationsServiceInterfaces {

    public  void insert(Certifications certifications);
    public List<Certifications> list();
    public void delete(int idExperienciaLaboral);
}

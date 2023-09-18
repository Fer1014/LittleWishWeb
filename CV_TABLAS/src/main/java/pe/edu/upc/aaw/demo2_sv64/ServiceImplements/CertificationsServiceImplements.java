package pe.edu.upc.aaw.demo2_sv64.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo2_sv64.Entities.Certifications;
import pe.edu.upc.aaw.demo2_sv64.Repositories.CertificationsRepository;
import pe.edu.upc.aaw.demo2_sv64.ServiceInterfaces.CertificationsServiceInterfaces;

import java.util.List;

@Service
public class CertificationsServiceImplements implements CertificationsServiceInterfaces {
    @Autowired

    private CertificationsRepository cR;
    @Override
    public void insert(Certifications certifications){
        cR.save(certifications);
    }

    @Override
    public List<Certifications> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int idCertifications) {
        cR.deleteById(idCertifications);
    }
}

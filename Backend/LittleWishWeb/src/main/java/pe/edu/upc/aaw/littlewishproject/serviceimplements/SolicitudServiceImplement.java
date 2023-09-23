package pe.edu.upc.aaw.littlewishproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishproject.entities.Solicitud;
import pe.edu.upc.aaw.littlewishproject.repositories.ISolicitudRepository;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.ISolicitudService;

import java.util.List;

@Service
public class SolicitudServiceImplement implements ISolicitudService {
    @Autowired
    private ISolicitudRepository sR;
    @Override
    public void insert(Solicitud s) {
        sR.save(s);
    }

    @Override
    public void eliminar(int idSoli) {
        sR.deleteById(idSoli);
    }

    @Override
    public List<Solicitud> list() {
        return sR.findAll();
    }
}

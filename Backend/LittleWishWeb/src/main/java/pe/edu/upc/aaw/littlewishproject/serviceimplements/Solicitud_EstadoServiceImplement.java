package pe.edu.upc.aaw.littlewishproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishproject.entities.Solicitud_Estado;
import pe.edu.upc.aaw.littlewishproject.repositories.ISolicitud_EstadoRepository;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.ISolicitud_EstadoService;

import java.util.List;

@Service
public class Solicitud_EstadoServiceImplement implements ISolicitud_EstadoService {
    @Autowired
    private ISolicitud_EstadoRepository sR;

    @Override
    public void insert(Solicitud_Estado sol) {
        sR.save(sol);
    }

    @Override
    public List<Solicitud_Estado> list() {
        return sR.findAll();
    }
}

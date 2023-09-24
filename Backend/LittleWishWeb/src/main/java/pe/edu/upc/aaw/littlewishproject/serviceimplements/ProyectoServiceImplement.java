package pe.edu.upc.aaw.littlewishproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishproject.entities.Proyecto;
import pe.edu.upc.aaw.littlewishproject.repositories.IProyectoRepository;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IProyectoService;

import java.util.List;

@Service
public class ProyectoServiceImplement implements IProyectoService {

    @Autowired
    private IProyectoRepository poR;
    @Override
    public void insert(Proyecto pago) {
        poR.save(pago);
    }

    @Override
    public List<Proyecto> list() {
        return poR.findAll();
    }

    @Override
    public Proyecto buscarProyecto(String descripcion) {
        return poR.buscarProyecto(descripcion);
    }
}

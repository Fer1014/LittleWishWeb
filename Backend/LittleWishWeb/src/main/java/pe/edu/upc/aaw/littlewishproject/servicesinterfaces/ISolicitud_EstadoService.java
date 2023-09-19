package pe.edu.upc.aaw.littlewishproject.servicesinterfaces;

import pe.edu.upc.aaw.littlewishproject.entities.Solicitud_Estado;

import java.util.List;

public interface ISolicitud_EstadoService {
    public void insert(Solicitud_Estado sol);
    public List<Solicitud_Estado> list();
}

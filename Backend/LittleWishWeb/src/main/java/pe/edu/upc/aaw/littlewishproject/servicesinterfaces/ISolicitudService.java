package pe.edu.upc.aaw.littlewishproject.servicesinterfaces;

import pe.edu.upc.aaw.littlewishproject.entities.Solicitud;

import java.util.List;

public interface ISolicitudService {
    public void insert(Solicitud s);
    public List<Solicitud> list();

}

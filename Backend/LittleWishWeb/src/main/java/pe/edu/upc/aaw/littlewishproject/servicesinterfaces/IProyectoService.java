package pe.edu.upc.aaw.littlewishproject.servicesinterfaces;

import pe.edu.upc.aaw.littlewishproject.entities.Proyecto;

import java.util.List;

public interface IProyectoService {
    public void insert(Proyecto pago);
    public List<Proyecto> list();
}

package pe.edu.upc.aaw.littlewishproject.servicesinterfaces;

import pe.edu.upc.aaw.littlewishproject.entities.Idiomas;

import java.util.List;

public interface IIdiomasService {
    public void insert(Idiomas idiomas);
    public List<Idiomas> list();
}

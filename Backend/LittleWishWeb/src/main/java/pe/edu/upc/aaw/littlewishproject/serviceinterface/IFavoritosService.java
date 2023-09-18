package pe.edu.upc.aaw.littlewishproject.serviceinterface;

import pe.edu.upc.aaw.littlewishproject.entities.Favoritos;
import pe.edu.upc.aaw.littlewishproject.entities.Puntuacion;

import java.util.List;

public interface IFavoritosService {

    void insert(Favoritos favoritos);

    public List<Favoritos> list();

    public void delete(int idFavoritos);

}

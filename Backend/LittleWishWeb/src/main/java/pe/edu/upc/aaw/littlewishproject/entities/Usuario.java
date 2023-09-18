package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFavoritos;

    public Usuario(){}

    public Usuario(int idFavoritos) {
        this.idFavoritos = idFavoritos;
    }

    public int getIdFavoritos() {
        return idFavoritos;
    }

    public void setIdFavoritos(int idFavoritos) {
        this.idFavoritos = idFavoritos;
    }
}

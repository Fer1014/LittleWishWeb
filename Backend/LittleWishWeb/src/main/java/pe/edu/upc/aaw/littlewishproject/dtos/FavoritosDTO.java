package pe.edu.upc.aaw.littlewishproject.dtos;

import pe.edu.upc.aaw.littlewishproject.entities.Usuario;


public class FavoritosDTO {
    private int idFavoritos;

    private Usuario usuario;

    public int getIdFavoritos() {
        return idFavoritos;
    }

    public void setIdFavoritos(int idFavoritos) {
        this.idFavoritos = idFavoritos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

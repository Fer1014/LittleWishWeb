package pe.edu.upc.aaw.littlewishproject.dtos;

import pe.edu.upc.aaw.littlewishproject.entities.Users;
public class PuntuacionDTO {

    private int idPuntuacion;

    private int puntos;

    private Users users;

    public int getIdPuntuacion() {
        return idPuntuacion;
    }

    public void setIdPuntuacion(int idPuntuacion) {
        this.idPuntuacion = idPuntuacion;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}

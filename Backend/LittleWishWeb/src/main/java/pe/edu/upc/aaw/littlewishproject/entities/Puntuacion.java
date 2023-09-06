package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "Puntuacion")
public class Puntuacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPuntuacion;
    @Column(name = "Puntos", nullable = false, length = 35)
    private int puntos;
    @ManyToOne
    @JoinColumn(name = "Id_Usuario")
    private Usuario usuario;

    public Puntuacion(){}

    public Puntuacion(int idPuntuacion, int puntos, Usuario usuario) {
        this.idPuntuacion = idPuntuacion;
        this.puntos = puntos;
        this.usuario = usuario;
    }

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

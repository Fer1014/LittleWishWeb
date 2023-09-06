package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "Comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComentario;
    @Column(name = "Puntos", nullable = false, length = 35)
    private String comentario;
    @ManyToOne
    @JoinColumn(name = "Id_Usuario")
    private Usuario usuario;

    public Comentario() {
    }

    public Comentario(int idComentario, String comentario, Usuario usuario) {
        this.idComentario = idComentario;
        this.comentario = comentario;
        this.usuario = usuario;
    }

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

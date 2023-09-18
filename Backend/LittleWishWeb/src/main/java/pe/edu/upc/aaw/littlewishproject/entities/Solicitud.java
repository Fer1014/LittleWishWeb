package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "Solicitud")
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "descripcion",nullable = false,length = 50)
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "solicitudEstado")
    private Solicitud_Estado solicitudEstado;

    public Solicitud() {
    }

    public Solicitud(int id, String descripcion, Solicitud_Estado solicitudEstado) {
        this.id = id;
        this.descripcion = descripcion;
        this.solicitudEstado = solicitudEstado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Solicitud_Estado getSolicitudEstado() {
        return solicitudEstado;
    }

    public void setSolicitudEstado(Solicitud_Estado solicitudEstado) {
        this.solicitudEstado = solicitudEstado;
    }
}

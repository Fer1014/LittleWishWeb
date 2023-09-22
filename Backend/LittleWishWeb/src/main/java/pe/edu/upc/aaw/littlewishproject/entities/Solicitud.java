package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "Solicitud")
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_Solicitud;
    @Column(name = "descripcion",length = 50, nullable = false)
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "ID_solicitudEstado")
    private Solicitud_Estado solicitudEstado;

    public Solicitud() {
    }

    public Solicitud(int ID_Solicitud, String descripcion, Solicitud_Estado solicitudEstado) {
        this.ID_Solicitud = ID_Solicitud;
        this.descripcion = descripcion;
        this.solicitudEstado = solicitudEstado;
    }

    public int getID_Solicitud() {
        return ID_Solicitud;
    }

    public void setID_Solicitud(int ID_Solicitud) {
        this.ID_Solicitud = ID_Solicitud;
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
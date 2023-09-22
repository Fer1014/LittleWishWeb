package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "Solicitud_Estado")
public class Solicitud_Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_solicitudEstado;
    @Column(name ="campo_estado",length = 50,nullable = false)
    private String campo_estado;

    public Solicitud_Estado() {
    }

    public Solicitud_Estado(int ID_solicitudEstado, String campo_estado) {
        this.ID_solicitudEstado = ID_solicitudEstado;
        this.campo_estado = campo_estado;
    }

    public int getID_solicitudEstado() {
        return ID_solicitudEstado;
    }

    public void setID_solicitudEstado(int ID_solicitudEstado) {
        this.ID_solicitudEstado = ID_solicitudEstado;
    }

    public String getCampo_estado() {
        return campo_estado;
    }

    public void setCampo_estado(String campo_estado) {
        this.campo_estado = campo_estado;
    }
}
package pe.edu.upc.aaw.littlewishproject.dtos;

import pe.edu.upc.aaw.littlewishproject.entities.Solicitud_Estado;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class SolicitudDTO {
    private int id;
    private String descripcion;

    private Solicitud_Estado solicitudEstado;

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

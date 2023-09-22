package pe.edu.upc.aaw.littlewishproject.dtos;

import pe.edu.upc.aaw.littlewishproject.entities.Solicitud_Estado;

public class SolicitudDTO {
    private int ID_Solicitud;
    private String descripcion;
    private Solicitud_Estado solicitudEstado;

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

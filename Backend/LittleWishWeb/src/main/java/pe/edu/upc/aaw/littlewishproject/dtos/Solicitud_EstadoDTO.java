package pe.edu.upc.aaw.littlewishproject.dtos;

public class Solicitud_EstadoDTO {
    private int ID_solicitudEstado;
    private String campo_estado;

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

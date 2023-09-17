package pe.edu.upc.aaw.littlewishproject.dtos;

import javax.persistence.Column;

public class Solicitud_EstadoDTO {
    private int id;
    private String campo_estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCampo_estado() {
        return campo_estado;
    }

    public void setCampo_estado(String campo_estado) {
        this.campo_estado = campo_estado;
    }
}

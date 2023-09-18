package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "Solicitud_Estado")
public class Solicitud_Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name ="campo_estado",nullable = false,length = 50)
    private String campo_estado;
    public Solicitud_Estado(){

    }
    public Solicitud_Estado(int id, String campo_estado) {
        this.id = id;
        this.campo_estado = campo_estado;
    }

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

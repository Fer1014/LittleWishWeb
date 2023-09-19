package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "Formacion_Academica")
public class Formacion_Academica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_Formacion_academica;
    @Column(name = "Nombre_Secundaria", length = 45, nullable = false)
    private String Nombre_Secundaria;

    public Formacion_Academica() {
    }

    public Formacion_Academica(int ID_Formacion_academica, String nombre_Secundaria) {
        this.ID_Formacion_academica = ID_Formacion_academica;
        Nombre_Secundaria = nombre_Secundaria;
    }

    public int getID_Formacion_academica() {
        return ID_Formacion_academica;
    }

    public void setID_Formacion_academica(int ID_Formacion_academica) {
        this.ID_Formacion_academica = ID_Formacion_academica;
    }

    public String getNombre_Secundaria() {
        return Nombre_Secundaria;
    }

    public void setNombre_Secundaria(String nombre_Secundaria) {
        Nombre_Secundaria = nombre_Secundaria;
    }
}
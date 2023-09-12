package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "Carreras")
public class Carreras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_Carrera;
    @Column(name = "nameCarreras", length = 45, nullable = false)
    private String nameCarreras;
    @ManyToOne
    @JoinColumn(name = "ID_Formacion_academica")
    private Formacion_Academica formacion_academica;

    public Carreras() {
    }

    public Carreras(int ID_Carrera, String nameCarreras, Formacion_Academica formacion_academica) {
        this.ID_Carrera = ID_Carrera;
        this.nameCarreras = nameCarreras;
        this.formacion_academica = formacion_academica;
    }

    public int getID_Carrera() {
        return ID_Carrera;
    }

    public void setID_Carrera(int ID_Carrera) {
        this.ID_Carrera = ID_Carrera;
    }

    public String getNameCarreras() {
        return nameCarreras;
    }

    public void setNameCarreras(String nameCarreras) {
        this.nameCarreras = nameCarreras;
    }

    public Formacion_Academica getFormacion_academica() {
        return formacion_academica;
    }

    public void setFormacion_academica(Formacion_Academica formacion_academica) {
        this.formacion_academica = formacion_academica;
    }
}

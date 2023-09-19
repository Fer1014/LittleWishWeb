package pe.edu.upc.aaw.littlewishproject.dtos;

import pe.edu.upc.aaw.littlewishproject.entities.Formacion_Academica;

public class CarrerasDTO {
    private int ID_Carrera;
    private String nameCarreras;
    private Formacion_Academica formacion_academica;

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

package pe.edu.upc.aaw.littlewishproject.dtos;


import pe.edu.upc.aaw.littlewishproject.entities.Formacion_Academica;

import java.time.LocalDate;

public class UniversidadesDTO {
    private int ID_Universidad;
    private String nameUniversidades;
    private LocalDate FechaIngreso;
    private LocalDate FechaEgreso;
    private Formacion_Academica formacion_academica;

    public void setID_Universidad(int ID_Universidad) {
        this.ID_Universidad = ID_Universidad;
    }

    public void setNameUniversidades(String nameUniversidades) {
        this.nameUniversidades = nameUniversidades;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        FechaIngreso = fechaIngreso;
    }

    public void setFechaEgreso(LocalDate fechaEgreso) {
        FechaEgreso = fechaEgreso;
    }

    public void setFormacion_academica(Formacion_Academica formacion_academica) {
        this.formacion_academica = formacion_academica;
    }

    public int getID_Universidad() {
        return ID_Universidad;
    }

    public String getNameUniversidades() {
        return nameUniversidades;
    }

    public LocalDate getFechaIngreso() {
        return FechaIngreso;
    }

    public LocalDate getFechaEgreso() {
        return FechaEgreso;
    }

    public Formacion_Academica getFormacion_academica() {
        return formacion_academica;
    }
}

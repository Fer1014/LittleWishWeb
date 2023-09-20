package pe.edu.upc.aaw.littlewishproject.dtos;

import pe.edu.upc.aaw.littlewishproject.entities.Certificaciones;
import pe.edu.upc.aaw.littlewishproject.entities.Experiencia_Laboral;
import pe.edu.upc.aaw.littlewishproject.entities.Formacion_Academica;
import pe.edu.upc.aaw.littlewishproject.entities.Idiomas;

public class CurriculumVitaeDTO {
    private int ID_CV;
    private Idiomas idiomas;
    private Certificaciones certificaciones;
    private Experiencia_Laboral experiencia_laboral;
    private Formacion_Academica formacion_academica;

    public int getID_CV() {
        return ID_CV;
    }

    public void setID_CV(int ID_CV) {
        this.ID_CV = ID_CV;
    }

    public Idiomas getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(Idiomas idiomas) {
        this.idiomas = idiomas;
    }

    public Certificaciones getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(Certificaciones certificaciones) {
        this.certificaciones = certificaciones;
    }

    public Experiencia_Laboral getExperiencia_laboral() {
        return experiencia_laboral;
    }

    public void setExperiencia_laboral(Experiencia_Laboral experiencia_laboral) {
        this.experiencia_laboral = experiencia_laboral;
    }

    public Formacion_Academica getFormacion_academica() {
        return formacion_academica;
    }

    public void setFormacion_academica(Formacion_Academica formacion_academica) {
        this.formacion_academica = formacion_academica;
    }
}
package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "CurriculumVitae")
public class CurriculumVitae {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CV")
    private int ID_CV;
    @ManyToOne
    @JoinColumn(name = "ID_Idiomas")
    private Idiomas idiomas;
    @ManyToOne
    @JoinColumn(name = "ID_Certifaciones")
    private Certificaciones certificaciones;
    @ManyToOne
    @JoinColumn(name = "ID_Experiencia_Laboral")
    private Experiencia_Laboral experiencia_laboral;
    @ManyToOne
    @JoinColumn(name = "ID_Formacion_academica")
    private Formacion_Academica formacion_academica;

    public CurriculumVitae() {
    }

    public CurriculumVitae(int ID_CV, Idiomas idiomas, Certificaciones certificaciones, Experiencia_Laboral experiencia_laboral, Formacion_Academica formacion_academica) {
        this.ID_CV = ID_CV;
        this.idiomas = idiomas;
        this.certificaciones = certificaciones;
        this.experiencia_laboral = experiencia_laboral;
        this.formacion_academica = formacion_academica;
    }

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
package pe.edu.upc.aaw.demo2_sv64.Entities;

import javax.persistence.*;

@Entity
@Table(name = "Languages")
public class Languages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIdiomas;

    @Column(name = "idiomas", length = 45, nullable = false)
    private String idiomas;

    @Column(name = "nivelEscrito", length = 50, nullable = false)
    private String nivelEscrito;

    @Column(name = "nivelOral", nullable = false)
    private String nivelOral;

    @ManyToOne
    @JoinColumn(name = "Idiomas_Id")
    private CurriculumVitae curriculumVitae;

    // Constructor, Getters y Setters


    public Languages() {
    }

    public Languages(int idIdiomas, String idiomas, String nivelEscrito, String nivelOral, CurriculumVitae curriculumVitae) {
        this.idIdiomas = idIdiomas;
        this.idiomas = idiomas;
        this.nivelEscrito = nivelEscrito;
        this.nivelOral = nivelOral;
        this.curriculumVitae = curriculumVitae;
    }

    public int getIdIdiomas() {
        return idIdiomas;
    }

    public void setIdIdiomas(int idIdiomas) {
        this.idIdiomas = idIdiomas;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public String getNivelEscrito() {
        return nivelEscrito;
    }

    public void setNivelEscrito(String nivelEscrito) {
        this.nivelEscrito = nivelEscrito;
    }

    public String getNivelOral() {
        return nivelOral;
    }

    public void setNivelOral(String nivelOral) {
        this.nivelOral = nivelOral;
    }

    public CurriculumVitae getCurriculumVitae() {
        return curriculumVitae;
    }

    public void setCurriculumVitae(CurriculumVitae curriculumVitae) {
        this.curriculumVitae = curriculumVitae;
    }
}
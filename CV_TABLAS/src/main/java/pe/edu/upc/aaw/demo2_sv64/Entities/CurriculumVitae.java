package pe.edu.upc.aaw.demo2_sv64.Entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "CurriculumVitae")
public class CurriculumVitae {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_CV")
    private int id_CV;

    @Column(name = "Idiomas_Id", length = 45, nullable = false)
    private String Idiomas_Id;

    @Column(name = "ExperienciaLaboral_Id", length = 50, nullable = false)
    private String ExperienciaLaboral_Id;

    @Column(name = "Certificaciones_Id", nullable = false)
    private LocalDate Certificaciones_Id;

    public CurriculumVitae() {
    }

    public CurriculumVitae(int id_CV, String idiomas_Id, String experienciaLaboral_Id, LocalDate certificaciones_Id) {
        this.id_CV = id_CV;
        Idiomas_Id = idiomas_Id;
        ExperienciaLaboral_Id = experienciaLaboral_Id;
        Certificaciones_Id = certificaciones_Id;
    }

    public int getId_CV() {
        return id_CV;
    }

    public void setId_CV(int id_CV) {
        this.id_CV = id_CV;
    }

    public String getIdiomas_Id() {
        return Idiomas_Id;
    }

    public void setIdiomas_Id(String idiomas_Id) {
        Idiomas_Id = idiomas_Id;
    }

    public String getExperienciaLaboral_Id() {
        return ExperienciaLaboral_Id;
    }

    public void setExperienciaLaboral_Id(String experienciaLaboral_Id) {
        ExperienciaLaboral_Id = experienciaLaboral_Id;
    }

    public LocalDate getCertificaciones_Id() {
        return Certificaciones_Id;
    }

    public void setCertificaciones_Id(LocalDate certificaciones_Id) {
        Certificaciones_Id = certificaciones_Id;
    }
}

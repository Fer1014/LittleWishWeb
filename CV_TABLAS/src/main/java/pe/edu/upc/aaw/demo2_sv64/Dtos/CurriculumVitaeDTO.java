package pe.edu.upc.aaw.demo2_sv64.Dtos;

import java.time.LocalDate;

public class CurriculumVitaeDTO {

    private int id_CV;
    private String Idiomas_Id;
    private String ExperienciaLaboral_Id;
    private LocalDate Certificaciones_Id;

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

package pe.edu.upc.aaw.littlewishproject.dtos;

import pe.edu.upc.aaw.littlewishproject.entities.CurriculumVitae;

import java.time.LocalDate;

public class Experiencia_LaboralDTO {
    private int ID_Experiencia_laboral;
    private String Empresa;
    private String Cargo;
    private LocalDate FechaInicio;
    private LocalDate FechaFinalizado;
    private CurriculumVitae curriculumVitae;

    public int getID_Experiencia_laboral() {
        return ID_Experiencia_laboral;
    }

    public void setID_Experiencia_laboral(int ID_Experiencia_laboral) {
        this.ID_Experiencia_laboral = ID_Experiencia_laboral;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public LocalDate getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinalizado() {
        return FechaFinalizado;
    }

    public void setFechaFinalizado(LocalDate fechaFinalizado) {
        FechaFinalizado = fechaFinalizado;
    }

    public CurriculumVitae getCurriculumVitae() {
        return curriculumVitae;
    }

    public void setCurriculumVitae(CurriculumVitae curriculumVitae) {
        this.curriculumVitae = curriculumVitae;
    }
}

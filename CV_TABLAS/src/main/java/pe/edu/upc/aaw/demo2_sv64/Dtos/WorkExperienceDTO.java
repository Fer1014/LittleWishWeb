package pe.edu.upc.aaw.demo2_sv64.Dtos;

import pe.edu.upc.aaw.demo2_sv64.Entities.CurriculumVitae;


public class WorkExperienceDTO {
    private int idExperiecniaLaboral;
    private String Empresa;
    private String Cargo;
    private String FechaInicio;
    private String FechaFinalizado;
    private CurriculumVitae curriculumVitae;

    public int getIdExperiecniaLaboral() {
        return idExperiecniaLaboral;
    }

    public void setIdExperiecniaLaboral(int idExperiecniaLaboral) {
        this.idExperiecniaLaboral = idExperiecniaLaboral;
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

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public String getFechaFinalizado() {
        return FechaFinalizado;
    }

    public void setFechaFinalizado(String fechaFinalizado) {
        FechaFinalizado = fechaFinalizado;
    }

    public CurriculumVitae getCurriculumVitae() {
        return curriculumVitae;
    }

    public void setCurriculumVitae(CurriculumVitae curriculumVitae) {
        this.curriculumVitae = curriculumVitae;
    }
}

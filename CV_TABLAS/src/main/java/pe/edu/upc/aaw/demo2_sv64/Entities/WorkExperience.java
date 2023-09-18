package pe.edu.upc.aaw.demo2_sv64.Entities;

import javax.persistence.*;

@Entity
@Table(name = "WorkExperience")
public class WorkExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idExperienciaLaboral;

    @Column(name = "Empresa", length = 45, nullable = false)
    private String Empresa;

    @Column(name = "Cargo", length = 50, nullable = false)
    private String Cargo;

    @Column(name = "FechaInicio", nullable = false)
    private String FechaInicio;

    @Column(name = "FechaFinalizado", nullable = false)
    private String FechaFinalizado;

    @ManyToOne
    @JoinColumn(name = "ExperienciaLaboral_Id")
    private CurriculumVitae curriculumVitae;

    public WorkExperience() {
    }

    public WorkExperience(int idExperiecniaLaboral, String empresa, String cargo, String fechaInicio, String fechaFinalizado, CurriculumVitae curriculumVitae) {
        this.idExperienciaLaboral = idExperiecniaLaboral;
        Empresa = empresa;
        Cargo = cargo;
        FechaInicio = fechaInicio;
        FechaFinalizado = fechaFinalizado;
        this.curriculumVitae = curriculumVitae;
    }

    public int getIdExperiecniaLaboral() {
        return idExperienciaLaboral;
    }

    public void setIdExperiecniaLaboral(int idExperiecniaLaboral) {
        this.idExperienciaLaboral = idExperiecniaLaboral;
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

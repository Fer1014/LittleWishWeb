package pe.edu.upc.aaw.demo2_sv64.Entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Certifications")
public class Certifications {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCertificacion")
    private int idCertificacion;

    @Column(name = "nombreCertificaciones", length = 45, nullable = false)
    private String nombreCertificaciones;

    @Column(name = "empresaEmisora", length = 50, nullable = false)
    private String empresaEmisora;

    @Column(name = "fechaExpedicion", nullable = false)
    private LocalDate fechaExpedicion;

    @Column(name = "fechaCaducidad", nullable = false)
    private LocalDate fechaCaducidad;

    @Column(name = "urlCredencial", length = 50, nullable = false)
    private String urlCredencial;

    @ManyToOne
    @JoinColumn(name = "Certificaciones_Id")
    private CurriculumVitae curriculumVitae;

    public Certifications() {
    }

    public Certifications(int idCertificacion, String nombreCertificaciones, String empresaEmisora, LocalDate fechaExpedicion, LocalDate fechaCaducidad, String urlCredencial, CurriculumVitae curriculumVitae) {
        this.idCertificacion = idCertificacion;
        this.nombreCertificaciones = nombreCertificaciones;
        this.empresaEmisora = empresaEmisora;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaCaducidad = fechaCaducidad;
        this.urlCredencial = urlCredencial;
        this.curriculumVitae = curriculumVitae;
    }

    public int getIdCertificacion() {
        return idCertificacion;
    }

    public void setIdCertificacion(int idCertificacion) {
        this.idCertificacion = idCertificacion;
    }

    public String getNombreCertificaciones() {
        return nombreCertificaciones;
    }

    public void setNombreCertificaciones(String nombreCertificaciones) {
        this.nombreCertificaciones = nombreCertificaciones;
    }

    public String getEmpresaEmisora() {
        return empresaEmisora;
    }

    public void setEmpresaEmisora(String empresaEmisora) {
        this.empresaEmisora = empresaEmisora;
    }

    public LocalDate getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(LocalDate fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getUrlCredencial() {
        return urlCredencial;
    }

    public void setUrlCredencial(String urlCredencial) {
        this.urlCredencial = urlCredencial;
    }

    public CurriculumVitae getCurriculumVitae() {
        return curriculumVitae;
    }

    public void setCurriculumVitae(CurriculumVitae curriculumVitae) {
        this.curriculumVitae = curriculumVitae;
    }
}

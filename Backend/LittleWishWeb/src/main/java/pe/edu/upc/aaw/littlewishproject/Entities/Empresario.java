package pe.edu.upc.aaw.littlewishproject.Entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Empresario")
public class Empresario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpresario;

    @Column(name = "Nombre_Empresario", length = 45, nullable = false)
    private String nombreEmpresario;

    @Column(name = "Apellido_Empresario", length = 45, nullable = false)
    private String apellidoEmpresario;

    @Column(name = "Dni_Empresario", length = 15, nullable = false)
    private String dniEmpresario;

    @Column(name = "Correo_Empresario", length = 100, nullable = false)
    private String correoEmpresario;

    @Column(name = "Telefono_Empresario", length = 15, nullable = false)
    private String telefonoEmpresario;

    @Column(name = "Username", length = 45, nullable = false)
    private String username;

    @Column(name = "Password", length = 100, nullable = false)
    private String password;

    @Column(name = "Direccion", length = 200, nullable = false)
    private String direccion;

    @Column(name = "CV_ID_CV", nullable = false)
    private Long cvId;


    public Empresario() {
    }

    public Empresario(int idEmpresario, String nombreEmpresario, String apellidoEmpresario, String dniEmpresario, String correoEmpresario, String telefonoEmpresario, LocalDate creationDateUniversity, String username, String password, String direccion, Long cvId) {
        this.idEmpresario = idEmpresario;
        this.nombreEmpresario = nombreEmpresario;
        this.apellidoEmpresario = apellidoEmpresario;
        this.dniEmpresario = dniEmpresario;
        this.correoEmpresario = correoEmpresario;
        this.telefonoEmpresario = telefonoEmpresario;
        this.username = username;
        this.password = password;
        this.direccion = direccion;
        this.cvId = cvId;
    }

    // Getters y setters

    public int getIdEmpresario() {
        return idEmpresario;
    }

    public void setIdEmpresario(int idEmpresario) {
        this.idEmpresario = idEmpresario;
    }

    public String getNombreEmpresario() {
        return nombreEmpresario;
    }

    public void setNombreEmpresario(String nombreEmpresario) {
        this.nombreEmpresario = nombreEmpresario;
    }

    public String getApellidoEmpresario() {
        return apellidoEmpresario;
    }

    public void setApellidoEmpresario(String apellidoEmpresario) {
        this.apellidoEmpresario = apellidoEmpresario;
    }

    public String getDniEmpresario() {
        return dniEmpresario;
    }

    public void setDniEmpresario(String dniEmpresario) {
        this.dniEmpresario = dniEmpresario;
    }

    public String getCorreoEmpresario() {
        return correoEmpresario;
    }

    public void setCorreoEmpresario(String correoEmpresario) {
        this.correoEmpresario = correoEmpresario;
    }

    public String getTelefonoEmpresario() {
        return telefonoEmpresario;
    }

    public void setTelefonoEmpresario(String telefonoEmpresario) {
        this.telefonoEmpresario = telefonoEmpresario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Long getCvId() {
        return cvId;
    }

    public void setCvId(Long cvId) {
        this.cvId = cvId;
    }
}

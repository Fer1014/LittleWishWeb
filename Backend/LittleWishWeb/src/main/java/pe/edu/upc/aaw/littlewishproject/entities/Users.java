package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "users")
public class Users implements Serializable {
    //Datos de usuario login
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30, unique = true)
    private String username;
    @Column(length = 200)
    private String password;
    private Boolean enabled;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Role> roles;

    //Datos generales del usuario
    @Column(name = "Name", length = 45, nullable = false)
    private String Name;
    @Column(name = "Apellidos", length = 45, nullable = false)
    private String Apellidos;
    @Column(name = "DNI", nullable = false)
    private int DNI;
    @Column(name = "Correo", length = 45, nullable = false)
    private String Correo;
    @Column(name = "Telefono", nullable = false)
    private int Telefono;
    @Column(name = "Empresa", length = 45, nullable = true)
    private String Empresa;
    @ManyToOne
    @JoinColumn(name = "ID_CV", nullable = true)
    private CurriculumVitae curriculumVitae;

    public Users() {
    }

    public Users(Long id, String username, String password, Boolean enabled, List<Role> roles, String name, String apellidos, int DNI, String correo, int telefono, String empresa, CurriculumVitae curriculumVitae) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.roles = roles;
        Name = name;
        Apellidos = apellidos;
        this.DNI = DNI;
        Correo = correo;
        Telefono = telefono;
        Empresa = empresa;
        this.curriculumVitae = curriculumVitae;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public CurriculumVitae getCurriculumVitae() {
        return curriculumVitae;
    }

    public void setCurriculumVitae(CurriculumVitae curriculumVitae) {
        this.curriculumVitae = curriculumVitae;
    }
}

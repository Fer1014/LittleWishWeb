package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "Administrador")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_Admin;
    @Column(name = "Nombre_Admin", nullable = false,length = 50)
    private String Nombre_Admin;
    @Column(name = "Apellido_Admin", nullable = false,length = 50)
    private String Apellido_Admin;
    @Column(name = "Correo_Admin", nullable = false,length = 50)
    private String Correo_Admin;
    @Column(name = "Telefono_Admin", nullable = false)
    private int Telefono_Admin;
    @Column(name = "Username_Admin", nullable = false,length = 50)
    private String Username_Admin;
    @Column(name = "Password_Admin", nullable = false,length = 50)
    private String Password_Admin;
    @Column(name = "FechaRegistro_Admin", nullable = false)
    private LocalDate FechaRegistro_Admin;

    public Administrador() {
    }

    public Administrador(int id_Admin, String nombre_Admin, String apellido_Admin, String correo_Admin, int telefono_Admin, String username_Admin, String password_Admin, LocalDate fechaRegistro_Admin) {
        Id_Admin = id_Admin;
        Nombre_Admin = nombre_Admin;
        Apellido_Admin = apellido_Admin;
        Correo_Admin = correo_Admin;
        Telefono_Admin = telefono_Admin;
        Username_Admin = username_Admin;
        Password_Admin = password_Admin;
        FechaRegistro_Admin = fechaRegistro_Admin;
    }

    public int getId_Admin() {
        return Id_Admin;
    }

    public void setId_Admin(int id_Admin) {
        Id_Admin = id_Admin;
    }

    public String getNombre_Admin() {
        return Nombre_Admin;
    }

    public void setNombre_Admin(String nombre_Admin) {
        Nombre_Admin = nombre_Admin;
    }

    public String getApellido_Admin() {
        return Apellido_Admin;
    }

    public void setApellido_Admin(String apellido_Admin) {
        Apellido_Admin = apellido_Admin;
    }

    public String getCorreo_Admin() {
        return Correo_Admin;
    }

    public void setCorreo_Admin(String correo_Admin) {
        Correo_Admin = correo_Admin;
    }

    public int getTelefono_Admin() {
        return Telefono_Admin;
    }

    public void setTelefono_Admin(int telefono_Admin) {
        Telefono_Admin = telefono_Admin;
    }

    public String getUsername_Admin() {
        return Username_Admin;
    }

    public void setUsername_Admin(String username_Admin) {
        Username_Admin = username_Admin;
    }

    public String getPassword_Admin() {
        return Password_Admin;
    }

    public void setPassword_Admin(String password_Admin) {
        Password_Admin = password_Admin;
    }

    public LocalDate getFechaRegistro_Admin() {
        return FechaRegistro_Admin;
    }

    public void setFechaRegistro_Admin(LocalDate fechaRegistro_Admin) {
        FechaRegistro_Admin = fechaRegistro_Admin;
    }
}

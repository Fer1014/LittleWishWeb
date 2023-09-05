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
}

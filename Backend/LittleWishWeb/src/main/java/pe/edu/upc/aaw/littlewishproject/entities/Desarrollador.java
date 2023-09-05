package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;

@Entity
@Table(name ="Desarrollador")
public class Desarrollador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDesarrollador;
    @Column(name = "nameDesarrollador", length = 45, nullable = false)
    private String nameDesarrollador;
    @Column(name = "apellidoDesarrollador", length = 45, nullable = false)
    private String apellidoDesarrollador;
    @Column(name = "dniDesarrollador", length = 8, nullable = false)
    private int dniDesarrollador;
    @Column(name = "correoDesarrollador", length = 30, nullable = false)
    private String correoDesarrollador;
    @Column(name = "dniDesarrollador", length = 9, nullable = false)
    private int telefonoDesarrolador;
    @Column(name = "usuarioDesarrollador", length = 20, nullable = false)
    private String usuarioDesarrollador;
    @Column(name = "contraseñaDesarrollador", length = 25, nullable = false)
    private String contraseñaDesarrollador;

    public Desarrollador() {
    }

    public int getIdDesarrollador() {
        return idDesarrollador;
    }

    public void setIdDesarrollador(int idDesarrollador) {
        this.idDesarrollador = idDesarrollador;
    }

    public String getNameDesarrollador() {
        return nameDesarrollador;
    }

    public void setNameDesarrollador(String nameDesarrollador) {
        this.nameDesarrollador = nameDesarrollador;
    }

    public String getApellidoDesarrollador() {
        return apellidoDesarrollador;
    }

    public void setApellidoDesarrollador(String apellidoDesarrollador) {
        this.apellidoDesarrollador = apellidoDesarrollador;
    }

    public int getDniDesarrollador() {
        return dniDesarrollador;
    }

    public void setDniDesarrollador(int dniDesarrollador) {
        this.dniDesarrollador = dniDesarrollador;
    }

    public String getCorreoDesarrollador() {
        return correoDesarrollador;
    }

    public void setCorreoDesarrollador(String correoDesarrollador) {
        this.correoDesarrollador = correoDesarrollador;
    }

    public int getTelefonoDesarrolador() {
        return telefonoDesarrolador;
    }

    public void setTelefonoDesarrolador(int telefonoDesarrolador) {
        this.telefonoDesarrolador = telefonoDesarrolador;
    }

    public String getUsuarioDesarrollador() {
        return usuarioDesarrollador;
    }

    public void setUsuarioDesarrollador(String usuarioDesarrollador) {
        this.usuarioDesarrollador = usuarioDesarrollador;
    }

    public String getContraseñaDesarrollador() {
        return contraseñaDesarrollador;
    }

    public void setContraseñaDesarrollador(String contraseñaDesarrollador) {
        this.contraseñaDesarrollador = contraseñaDesarrollador;
    }
}

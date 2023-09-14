package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Universidades")
public class Universidades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_Universidad;
    @Column(name = "nameUniversidades", length = 45, nullable = false)
    private String nameUniversidades;
    @Column(name = "FechaIngreso", nullable = false)
    private LocalDate FechaIngreso;
    @Column(name = "FechaEgreso", nullable = false)
    private LocalDate FechaEgreso;
    @ManyToOne
    @JoinColumn(name = "ID_Formacion_academica")
    private Formacion_Academica formacion_academica;

    public Universidades() {
    }

    public Universidades(int ID_Universidad, String nameUniversidades, LocalDate fechaIngreso, LocalDate fechaEgreso, Formacion_Academica formacion_academica) {
        this.ID_Universidad = ID_Universidad;
        this.nameUniversidades = nameUniversidades;
        FechaIngreso = fechaIngreso;
        FechaEgreso = fechaEgreso;
        this.formacion_academica = formacion_academica;
    }

    public int getID_Universidad() {
        return ID_Universidad;
    }

    public void setID_Universidad(int ID_Universidad) {
        this.ID_Universidad = ID_Universidad;
    }

    public String getNameUniversidades() {
        return nameUniversidades;
    }

    public void setNameUniversidades(String nameUniversidades) {
        this.nameUniversidades = nameUniversidades;
    }

    public LocalDate getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        FechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaEgreso() {
        return FechaEgreso;
    }

    public void setFechaEgreso(LocalDate fechaEgreso) {
        FechaEgreso = fechaEgreso;
    }

    public Formacion_Academica getFormacion_academica() {
        return formacion_academica;
    }

    public void setFormacion_academica(Formacion_Academica formacion_academica) {
        this.formacion_academica = formacion_academica;
    }
}
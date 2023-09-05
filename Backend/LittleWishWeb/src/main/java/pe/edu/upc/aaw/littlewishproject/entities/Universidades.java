package pe.edu.upc.aaw.littlewishproject.entities;

import java.time.LocalDate;

public class Universidades {
    private int Id_Universidad;
    private String nombre_Universidad;
    private LocalDate anio_Inicio;
    private LocalDate anio_Fin;

    public Universidades(){
    }

    public Universidades(int id_Universidad, String nombre_Universidad, LocalDate anio_Inicio, LocalDate anio_Fin) {
        Id_Universidad = id_Universidad;
        this.nombre_Universidad = nombre_Universidad;
        this.anio_Inicio = anio_Inicio;
        this.anio_Fin = anio_Fin;
    }

    public int getId_Universidad() {
        return Id_Universidad;
    }

    public void setId_Universidad(int id_Universidad) {
        Id_Universidad = id_Universidad;
    }

    public String getNombre_Universidad() {
        return nombre_Universidad;
    }

    public void setNombre_Universidad(String nombre_Universidad) {
        this.nombre_Universidad = nombre_Universidad;
    }

    public LocalDate getAnio_Inicio() {
        return anio_Inicio;
    }

    public void setAnio_Inicio(LocalDate anio_Inicio) {
        this.anio_Inicio = anio_Inicio;
    }

    public LocalDate getAnio_Fin() {
        return anio_Fin;
    }

    public void setAnio_Fin(LocalDate anio_Fin) {
        this.anio_Fin = anio_Fin;
    }
}

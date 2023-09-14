package pe.edu.upc.aaw.littlewishproject.dtos;

public class Formacion_AcademicaDTO {
    private int ID_Formacion_academica;
    private String Nombre_Secundaria;

    public void setID_Formacion_academica(int ID_Formacion_academica) {
        this.ID_Formacion_academica = ID_Formacion_academica;
    }

    public void setNombre_Secundaria(String nombre_Secundaria) {
        Nombre_Secundaria = nombre_Secundaria;
    }

    public int getID_Formacion_academica() {
        return ID_Formacion_academica;
    }

    public String getNombre_Secundaria() {
        return Nombre_Secundaria;
    }
}

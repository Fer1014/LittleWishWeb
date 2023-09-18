package pe.edu.upc.aaw.demo2_sv64.Dtos;

import pe.edu.upc.aaw.demo2_sv64.Entities.Languages;

import javax.persistence.*;

public class LanguajesDTO {
    private int idIdiomas;
    private String idiomas;
    private String nivelEscrito;
    private String nivelOral;
    private Languages languajes;

    public int getIdIdiomas() {
        return idIdiomas;
    }

    public void setIdIdiomas(int idIdiomas) {
        this.idIdiomas = idIdiomas;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public String getNivelEscrito() {
        return nivelEscrito;
    }

    public void setNivelEscrito(String nivelEscrito) {
        this.nivelEscrito = nivelEscrito;
    }

    public String getNivelOral() {
        return nivelOral;
    }

    public void setNivelOral(String nivelOral) {
        this.nivelOral = nivelOral;
    }

    public Languages getLanguajes() {
        return languajes;
    }

    public void setLanguajes(Languages languajes) {
        this.languajes = languajes;
    }
}

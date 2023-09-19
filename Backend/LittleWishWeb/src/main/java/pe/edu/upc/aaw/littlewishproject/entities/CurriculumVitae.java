package pe.edu.upc.aaw.littlewishproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "CurriculumVitae")
public class CurriculumVitae {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CV")
    private int ID_CV;

    public CurriculumVitae() {
    }

    public CurriculumVitae(int ID_CV) {
        this.ID_CV = ID_CV;
    }

    public int getID_CV() {
        return ID_CV;
    }

    public void setID_CV(int ID_CV) {
        this.ID_CV = ID_CV;
    }
}
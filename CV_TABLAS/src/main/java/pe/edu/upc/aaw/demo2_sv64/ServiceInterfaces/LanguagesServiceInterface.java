package pe.edu.upc.aaw.demo2_sv64.ServiceInterfaces;

import pe.edu.upc.aaw.demo2_sv64.Entities.Languages;

import java.time.LocalDate;
import java.util.List;

public interface LanguagesServiceInterface {
    public  void insert(Languages languages);
    public List<Languages> list();
    public void delete(int idIdiomas);


}

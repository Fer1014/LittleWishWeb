package pe.edu.upc.aaw.demo2_sv64.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo2_sv64.Entities.Languages;
import pe.edu.upc.aaw.demo2_sv64.Repositories.LanguajesRepository;
import pe.edu.upc.aaw.demo2_sv64.ServiceInterfaces.LanguagesServiceInterface;

import java.util.List;
@Service
public class LanguajesServiceImplements implements LanguagesServiceInterface {
    @Autowired

    private LanguajesRepository lR;
    @Override
    public void insert(Languages languages){
        lR.save(languages);
    }

    @Override
    public List<Languages> list() {
            return lR.findAll();
    }

    @Override
    public void delete(int idIdiomas) {
        lR.deleteById(idIdiomas);
    }

}

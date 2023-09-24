package pe.edu.upc.aaw.littlewishproject.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.littlewishproject.entities.CurriculumVitae;
import pe.edu.upc.aaw.littlewishproject.entities.Users;
import pe.edu.upc.aaw.littlewishproject.repositories.UserRepository;
import pe.edu.upc.aaw.littlewishproject.servicesinterfaces.IUserService;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {
    @Autowired
    private UserRepository uR;

    @Override
    public void insert(Users users) {
        uR.save(users);
    }

    @Override
    public List<Users> list() {
        return uR.findAll();
    }

    @Override
    public List<String[]> usernameBypuntuacion() {
        return uR.usernameBypuntuacion();
    }

    @Override
    public Users findByDNI(int dni) {
        return uR.findByDNI(dni);
    }

    @Override
    public List<String> findUsersByRole(String rol) {
        return uR.findUsersByRole(rol);
    }

    @Override
    public CurriculumVitae findCVByUsername(String username) {
        return uR.findCVByUsername(username);
    }

    @Override
    public int contarUsuariosPorRol(String rol) {
        return uR.contarUsuariosPorRol(rol);
    }



}
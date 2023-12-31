package pe.edu.upc.aaw.littlewishproject.servicesinterfaces;

import org.hibernate.sql.Delete;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.aaw.littlewishproject.entities.CurriculumVitae;
import pe.edu.upc.aaw.littlewishproject.entities.Users;

import java.util.List;

public interface IUserService {
    public void insert(Users users);
    public List<Users> list();
    public void delete(long Id);
    public List<String[]> usernameBypuntuacion();
    public Users findByDNI(int dni);
    public List<String> findUsersByRole(String rol);
    public CurriculumVitae findCVByUsername(String username);
    public int contarUsuariosPorRol(String rol);





}
package pe.edu.upc.aaw.littlewishproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.aaw.littlewishproject.entities.CurriculumVitae;
import pe.edu.upc.aaw.littlewishproject.entities.Users;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    public Users findByUsername(String username);

    //BUSCAR POR DNI
    @Query("SELECT u FROM Users u WHERE u.DNI = :dni")
    Users findByDNI(@Param("dni") int dni);

    //BUSCAR POR ROL
    @Query("SELECT u.Name FROM Users u LEFT JOIN u.roles r WHERE r.rol = :rol")
    List<String> findUsersByRole(@Param("rol") String rol);

    //Contar por role
    @Query("SELECT COUNT(u) FROM Users u JOIN u.roles r WHERE r.rol = :rol")
    int contarUsuariosPorRol(@Param("rol") String rol);


    //USER POR PUNTUACION - MEJORES PUNTUADOS
    @Query(value = "SELECT u.username \n" +
            " FROM users u INNER JOIN puntuacion p\n" +
            "ON u.id = p.id_users\n" +
            "WHERE p.puntos = 5 OR p.puntos =4;\n;", nativeQuery = true )
    public List<String[]> usernameBypuntuacion();

    //MOSTRAR CV POR USERNAME
    @Query("SELECT cv FROM Users u JOIN u.curriculumVitae cv WHERE u.username = :username")
    CurriculumVitae findCVByUsername(String username);







}
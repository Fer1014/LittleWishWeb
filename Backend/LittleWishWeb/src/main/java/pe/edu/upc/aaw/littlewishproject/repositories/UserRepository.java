package pe.edu.upc.aaw.littlewishproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.aaw.littlewishproject.entities.Users;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    public Users findByUsername(String username);

    //BUSCAR POR NOMBRE
    @Query("select count(u.username) from Users u where u.username =:Username")
    public int buscarUsername(@Param("Username") String nombre);


    //USER POR PUNTUACION - MEJORES PUNTUADOS
    @Query(value = "SELECT u.username \n" +
            " FROM users u INNER JOIN puntuacion p\n" +
            "ON u.id = p.id_users\n" +
            "WHERE p.puntos = 5 OR p.puntos =4;\n;", nativeQuery = true )
    public List<String[]> usernameBypuntuacion();



    //INSERTAR ROLES
    @Transactional
    @Modifying
    @Query(value = "insert into roles (rol, user_id) VALUES (:rol, :user_id)", nativeQuery = true)
    public void insRol(@Param("rol") String authority, @Param("user_id") Long user_id);
}
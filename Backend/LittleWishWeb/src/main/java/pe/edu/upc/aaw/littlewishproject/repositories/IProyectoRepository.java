package pe.edu.upc.aaw.littlewishproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.littlewishproject.entities.Proyecto;

import java.util.List;

@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto, Integer> {
    @Query(value = "select * from Proyecto p where p.descripcion like '%descripcion%'",nativeQuery = true)
    Proyecto buscarProyecto(@Param("descripcion") String descripcion);
}

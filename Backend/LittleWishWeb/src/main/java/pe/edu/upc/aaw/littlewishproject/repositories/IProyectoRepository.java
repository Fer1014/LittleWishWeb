package pe.edu.upc.aaw.littlewishproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.littlewishproject.entities.Proyecto;
@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto, Integer> {
}

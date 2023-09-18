package pe.edu.upc.aaw.demo2_sv64.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demo2_sv64.Entities.Languages;

@Repository
public interface LanguajesRepository extends JpaRepository<Languages,Integer> {
}

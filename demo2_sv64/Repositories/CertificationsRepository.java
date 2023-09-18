package pe.edu.upc.aaw.demo2_sv64.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demo2_sv64.Entities.Certifications;

@Repository
public interface CertificationsRepository extends JpaRepository<Certifications,Integer> {

}

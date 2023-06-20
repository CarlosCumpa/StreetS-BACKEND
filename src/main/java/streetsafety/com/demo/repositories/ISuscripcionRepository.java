package streetsafety.com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import streetsafety.com.demo.entities.Suscripcion;
@Repository
public interface ISuscripcionRepository extends JpaRepository<Suscripcion,Integer> {
}

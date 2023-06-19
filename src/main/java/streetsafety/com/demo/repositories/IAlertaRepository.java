package streetsafety.com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import streetsafety.com.demo.entities.Alerta;
@Repository

public interface IAlertaRepository extends JpaRepository<Alerta,Integer> {
}

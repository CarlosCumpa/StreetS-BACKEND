package streetsafety.com.demo.repositories;

import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;
import streetsafety.com.demo.entities.Delitos;

public interface IDelitosRepository extends JpaRepository<Delitos, Integer> {
}

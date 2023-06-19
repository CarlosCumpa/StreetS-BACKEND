package streetsafety.com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import streetsafety.com.demo.entities.TipoDelitos;

@Repository
public interface ITipoDelitos extends JpaRepository<TipoDelitos,Integer> {

}

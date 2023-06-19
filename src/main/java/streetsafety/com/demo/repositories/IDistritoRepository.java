package streetsafety.com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import streetsafety.com.demo.entities.Distrito;

@Repository
public interface IDistritoRepository extends JpaRepository<Distrito,Integer> {

}

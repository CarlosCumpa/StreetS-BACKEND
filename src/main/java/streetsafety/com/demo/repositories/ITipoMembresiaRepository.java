package streetsafety.com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import streetsafety.com.demo.entities.TipoMembresia;

import java.util.List;
@Repository
public interface ITipoMembresiaRepository extends JpaRepository<TipoMembresia,Integer> {
    @Query("from TipoMembresia tm where tm.idTipoMembresia=:tmembresia")
    List<TipoMembresia> findByTMembresiaA(@Param("tmembresia")Integer tmembresia);
}

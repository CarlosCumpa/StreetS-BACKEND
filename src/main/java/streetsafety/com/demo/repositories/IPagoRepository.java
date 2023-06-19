package streetsafety.com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import streetsafety.com.demo.entities.Pago;

public interface IPagoRepository extends JpaRepository<Pago,Integer> {
    @Query(value="select count(1) from Pago p where p.tipoPago='3 Meses'")
    String getPagoTotal();
}

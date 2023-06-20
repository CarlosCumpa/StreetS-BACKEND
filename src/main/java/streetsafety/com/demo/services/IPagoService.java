package streetsafety.com.demo.services;

import streetsafety.com.demo.dtos.PagoTotalDTO;
import streetsafety.com.demo.entities.Pago;

import java.util.List;

public interface IPagoService {
    public void insert(Pago pago);
    List<Pago>list();
    public void delete(int idPago);
    PagoTotalDTO pdt();
}

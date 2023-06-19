package streetsafety.com.demo.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streetsafety.com.demo.dtos.PagoTotalDTO;
import streetsafety.com.demo.entities.Pago;
import streetsafety.com.demo.repositories.IPagoRepository;
import streetsafety.com.demo.services.IPagoService;

import java.util.List;
@Service
public class IPagoServiceImplement implements IPagoService {
    @Autowired
    private IPagoRepository pR;


    @Override
    public void insert(Pago pago) {
        pR.save(pago);
    }

    @Override
    public List<Pago> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idPago) {
        pR.deleteById(idPago);
    }

    @Override
    public PagoTotalDTO pdt() {
        return new PagoTotalDTO(pR.getPagoTotal());
    }


}

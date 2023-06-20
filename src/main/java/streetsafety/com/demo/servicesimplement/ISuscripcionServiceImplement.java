package streetsafety.com.demo.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streetsafety.com.demo.entities.Suscripcion;
import streetsafety.com.demo.repositories.ISuscripcionRepository;
import streetsafety.com.demo.services.ISuscripcionService;

import java.util.List;

@Service
public class ISuscripcionServiceImplement implements ISuscripcionService {
    @Autowired
    private ISuscripcionRepository sR;

    @Override
    public void insert(Suscripcion suscripcion) {
        sR.save(suscripcion);
    }

    @Override
    public List<Suscripcion> list() {
        return sR.findAll();
    }

    @Override
    public void delete(int idSuscripcion) {
    sR.deleteById(idSuscripcion);
    }

    @Override
    public Suscripcion listId(int IdSuscripcion) {
        return sR.findById(IdSuscripcion).orElse(new Suscripcion());
    }
}

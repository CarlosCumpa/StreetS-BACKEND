package streetsafety.com.demo.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streetsafety.com.demo.entities.Alerta;
import streetsafety.com.demo.repositories.IAlertaRepository;
import streetsafety.com.demo.services.IAlertaService;

import java.util.List;

@Service
public class IAlertaServiceImplement implements IAlertaService {

    @Autowired
    private  IAlertaRepository aR;


    @Override
    public void insert(Alerta alerta) {
        aR.save(alerta);
    }

    @Override
    public List<Alerta> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int idU) {
    aR.deleteById(idU);
    }

    @Override
    public Alerta listId(int IdU) {
        return aR.findById(IdU).orElse(new Alerta());
    }
}

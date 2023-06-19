package streetsafety.com.demo.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streetsafety.com.demo.entities.Suscripcion;
import streetsafety.com.demo.entities.TipoDelitos;
import streetsafety.com.demo.repositories.ITipoDelitos;
import streetsafety.com.demo.services.ITipoDelitosService;

import java.util.List;
@Service
public class ITipoDelitoServiceImplement implements ITipoDelitosService {
    @Autowired
    private ITipoDelitos dR;
    @Override
    public void insert(TipoDelitos delitos) {
        dR.save(delitos);
    }

    @Override
    public List<TipoDelitos> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int IdU) {
        dR.deleteById(IdU);
    }

    @Override
    public TipoDelitos listId(int IdU) {
        return (TipoDelitos) dR.findById(IdU).orElse(new TipoDelitos());
    }
}

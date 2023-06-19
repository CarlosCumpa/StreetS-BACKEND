package streetsafety.com.demo.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streetsafety.com.demo.entities.Delitos;
import streetsafety.com.demo.repositories.IDelitosRepository;
import streetsafety.com.demo.services.IDelitoService;

import java.util.List;

@Service
public class IDelitosServiceImplement implements IDelitoService {
    @Autowired
    private IDelitosRepository dR;
    @Override
    public void insert(Delitos delitos) {
       dR.save(delitos);
    }

    @Override
    public List<Delitos> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int idU) {
    dR.deleteById(idU);
    }

    @Override
    public Delitos listId(int Idu) {
        return dR.findById(Idu).orElse(new Delitos());
    }
}

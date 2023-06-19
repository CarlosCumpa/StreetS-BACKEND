package streetsafety.com.demo.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streetsafety.com.demo.entities.Distrito;
import streetsafety.com.demo.repositories.IDistritoRepository;
import streetsafety.com.demo.services.IDistritoService;
import java.util.List;
@Service
public class IDistritoServiceImplements implements IDistritoService {

@Autowired
private IDistritoRepository dR;


    @Override
    public void insert(Distrito distrito) { dR.save(distrito);
    }

    @Override
    public List<Distrito> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int idDistrito) {
        dR.deleteById(idDistrito);
    }

    @Override
    public Distrito listId(int IdD) {
        return  dR.findById(IdD).orElse(new Distrito());
    }
}

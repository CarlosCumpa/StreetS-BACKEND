package streetsafety.com.demo.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streetsafety.com.demo.entities.TipoMembresia;
import streetsafety.com.demo.repositories.ITipoMembresiaRepository;
import streetsafety.com.demo.services.ITipoMembresiaService;

import java.util.List;
@Service
public class ITipoMembresiaServiceImplement implements ITipoMembresiaService {
    @Autowired
    private ITipoMembresiaRepository tmR;

    @Override
    public void insert(TipoMembresia tipoMembresia){tmR.save(tipoMembresia);}

    @Override
    public List<TipoMembresia> list() {
        return tmR.findAll();
    }

    @Override
    public List<TipoMembresia> findByTMembresia(Integer tmembresia) {
        return tmR.findByTMembresiaA(tmembresia);
    }

    @Override
    public void delete(int idTipoMembresia) {
        tmR.deleteById(idTipoMembresia);
    }
}

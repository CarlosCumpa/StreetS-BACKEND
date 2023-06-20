package streetsafety.com.demo.services;

import streetsafety.com.demo.entities.TipoMembresia;

import java.util.List;

public interface ITipoMembresiaService {
    public void insert(TipoMembresia tipoMembresia);
    List<TipoMembresia>list();
    List<TipoMembresia>findByTMembresia(Integer tmembresia);
    public void delete(int idTipoMembresia);
}

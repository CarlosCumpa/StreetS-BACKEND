package streetsafety.com.demo.services;

import streetsafety.com.demo.entities.TipoDelitos;

import java.util.List;

public interface ITipoDelitosService {
    public  void insert(TipoDelitos delitos);
    List<TipoDelitos>list();
    public  void  delete(int IdU);
    public TipoDelitos listId(int IdU);
}

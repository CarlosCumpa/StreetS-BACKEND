package streetsafety.com.demo.services;

import java.util.List;
import streetsafety.com.demo.entities.Distrito;

public interface IDistritoService {
    public void insert(Distrito distrito);
    List<Distrito> list();

    public void delete(int idDistrito);

    public Distrito listId(int IdPet);
}

package streetsafety.com.demo.services;

import streetsafety.com.demo.entities.Delitos;

import java.util.List;

public interface IDelitoService {
    public void insert (Delitos delitos);
    List<Delitos> list();
    public  void delete(int idU);
    public Delitos listId(int Idu);
}

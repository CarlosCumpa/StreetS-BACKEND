package streetsafety.com.demo.services;

import streetsafety.com.demo.entities.Suscripcion;

import java.util.List;

public interface ISuscripcionService {
    public void insert(Suscripcion suscripcion);
    List<Suscripcion>list();
    public void delete(int idSuscripcion);
    public Suscripcion listId(int IdSuscripcion);
}

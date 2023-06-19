package streetsafety.com.demo.services;

import streetsafety.com.demo.dtos.PagoTotalDTO;
import streetsafety.com.demo.entities.Alerta;


import java.util.List;

public interface IAlertaService {
    public void insert(Alerta alerta);
    List<Alerta>list();
    public  void delete(int idU);
    public Alerta listId(int IdU);
}

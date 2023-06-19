package streetsafety.com.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "Tdelitos")
public class TipoDelitos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idTipoDelitos;
    @Column(name = "descripcion",length = 200,nullable = false)
    private String Descrip_delito;

    public TipoDelitos(int id, String descrip_delito) {
        this.idTipoDelitos = id;
        Descrip_delito = descrip_delito;
    }

    public TipoDelitos() {
              
    }

    public int getIdTipoDelitos() {
        return idTipoDelitos;
    }

    public void setIdTipoDelitos(int id) {
        this.idTipoDelitos = id;
    }

    public String getDescrip_delito() {
        return Descrip_delito;
    }

    public void setDescrip_delito(String descrip_delito) {
        Descrip_delito = descrip_delito;
    }
}

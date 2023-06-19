package streetsafety.com.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "distritos")
public class Distrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDistritos;
    @Column(name = "nameDistrito",length = 35,nullable = false)
    private String nameDistrito;
    @Column(name = "nameProvincia",length = 12, nullable = false)
    private String nameProvincia;

    public Distrito() {
    }

    public Distrito(int id, String nameDistrito, String nameProvincia) {
        this.idDistritos = id;
        this.nameDistrito = nameDistrito;
        this.nameProvincia = nameProvincia;
    }

    public int getIdDistritos() {
        return idDistritos;
    }

    public void setIdDistritos(int id) {
        this.idDistritos = id;
    }

    public String getNameDistrito() {
        return nameDistrito;
    }

    public void setNameDistrito(String nameDistrito) {
        this.nameDistrito = nameDistrito;
    }

    public String getNameProvincia() {
        return nameProvincia;
    }

    public void setNameProvincia(String nameProvincia) {
        this.nameProvincia = nameProvincia;
    }
}

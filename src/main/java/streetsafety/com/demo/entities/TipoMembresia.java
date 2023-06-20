package streetsafety.com.demo.entities;

import javax.persistence.*;

@Entity
@Table(name="tiposmembresias")
public class TipoMembresia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoMembresia;

    @Column(name="descripcion",length=100,nullable = false)
    private String descripcion;

    @Column(name="duracion",length=20,nullable = false)
    private String duracion;

    @Column(name="precio",length=10,nullable = false)
    private String precio;



    public TipoMembresia() {
    }

    public TipoMembresia(int idTipoMembresia, String descripcion, String duracion, String precio) {
        this.idTipoMembresia = idTipoMembresia;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.precio = precio;
    }

    public int getIdTipoMembresia() {
        return idTipoMembresia;
    }

    public void setIdTipoMembresia(int idTipoMembresia) {
        this.idTipoMembresia = idTipoMembresia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}

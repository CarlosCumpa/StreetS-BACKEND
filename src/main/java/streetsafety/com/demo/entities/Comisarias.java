package streetsafety.com.demo.entities;

import javax.persistence.*;


@Entity
@Table(name = "comisarias")
public class Comisarias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idComisaria;
    @Column(name = "nameComisaria", length = 200, nullable = false)

    private String nameComisaria;
    @Column(name = "direccionComisaria", length = 200, nullable = false)

    private String direccionComisaria;
    @Column(name = "cellComisaria", length = 200, nullable = false)


    private  String cellComisaria;
    @Column(name = "Latitud", length = 200, nullable = false)


    private String Latitud;
    @Column(name = "Longitud", length = 200, nullable = false)


    private  String Longitud;
    @ManyToOne
    @JoinColumn(name = "idAlerta",nullable = false)
    private Alerta alerta;
    public Comisarias(){

    }

    public Comisarias(int idcomisaria, String nombre_Comisaria, String direccion_Comisaria, String numero_comisaria, String latitud, String longitud, Alerta alerta) {
        this.idComisaria = idcomisaria;
        nameComisaria = nombre_Comisaria;
        direccionComisaria = direccion_Comisaria;
        cellComisaria = numero_comisaria;
        Latitud = latitud;
        Longitud = longitud;
        this.alerta = alerta;
    }

    public int getIdComisaria() {
        return idComisaria;
    }

    public void setIdComisaria(int idcomisaria) {
        this.idComisaria = idcomisaria;
    }

    public String getNameComisaria() {
        return nameComisaria;
    }

    public void setNameComisaria(String nameComisaria) {
        this.nameComisaria = nameComisaria;
    }

    public String getDireccionComisaria() {
        return direccionComisaria;
    }

    public void setDireccionComisaria(String direccionComisaria) {
        this.direccionComisaria = direccionComisaria;
    }

    public String getNumero_comisaria() {
        return cellComisaria;
    }

    public void setNumero_comisaria(String numero_comisaria) {
        cellComisaria = numero_comisaria;
    }

    public String getLatitud() {
        return Latitud;
    }

    public void setLatitud(String latitud) {
        Latitud = latitud;
    }

    public String getLongitud() {
        return Longitud;
    }

    public void setLongitud(String longitud) {
        Longitud = longitud;
    }

    public Alerta getAlerta() {
        return alerta;
    }

    public void setAlerta(Alerta alerta) {
        this.alerta = alerta;
    }
}

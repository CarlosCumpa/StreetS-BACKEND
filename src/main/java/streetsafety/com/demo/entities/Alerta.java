package streetsafety.com.demo.entities;


import javax.persistence.*;
@Entity
@Table(name = "alertas")
public class Alerta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idAlerta;

    @Column(name ="nombreVictima", length = 30, unique = true)

    private String nombreVictima;
    @Column(name ="apellidoVictima", length = 30, unique = true)

    private String apellidoVictima;
    @Column(name =" Pais", length = 30, unique = true)

    private String Pais;
    @Column(name ="Departamento", length = 30, unique = true)

    private String Departamento;
    @Column(name ="Provincia", length = 30, unique = true)

    private String Provincia;
    @Column(name ="Distrito", length = 30, unique = true)

    private String Distrito;
    @Column(name ="Ubicación", length = 30, unique = true)

    private String Ubicación;
    @Column(name ="Referencia", length = 30, unique = true)

    private String Referencia;
    @Column(name ="Detalles", length = 30, unique = true)

    private String Detalles;


    public Alerta(Integer id, String nombreVictima, String apellidoVictima, String pais, String departamento, String provincia, String distrito, String ubicación, String referencia, String detalles) {
        this.idAlerta = id;
        this.nombreVictima = nombreVictima;
        this.apellidoVictima = apellidoVictima;
        Pais = pais;
        Departamento = departamento;
        Provincia = provincia;
        Distrito = distrito;
        Ubicación = ubicación;
        Referencia = referencia;
        Detalles = detalles;
    }

    public Alerta() {

    }

    public Integer getIdAlerta() {
        return idAlerta;
    }

    public void setIdAlerta(Integer id) {
        this.idAlerta = id;
    }

    public String getNombreVictima() {
        return nombreVictima;
    }

    public void setNombreVictima(String nombreVictima) {
        this.nombreVictima = nombreVictima;
    }

    public String getApellidoVictima() {
        return apellidoVictima;
    }

    public void setApellidoVictima(String apellidoVictima) {
        this.apellidoVictima = apellidoVictima;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String provincia) {
        Provincia = provincia;
    }

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String distrito) {
        Distrito = distrito;
    }

    public String getUbicación() {
        return Ubicación;
    }

    public void setUbicación(String ubicación) {
        Ubicación = ubicación;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String referencia) {
        Referencia = referencia;
    }

    public String getDetalles() {
        return Detalles;
    }

    public void setDetalles(String detalles) {
        Detalles = detalles;
    }
}

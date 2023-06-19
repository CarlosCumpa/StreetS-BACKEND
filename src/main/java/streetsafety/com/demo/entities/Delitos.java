package streetsafety.com.demo.entities;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDate;

@Entity
@Table(name = "delitos")
public class Delitos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idDelitos;
    @Column(name = "hora",length = 200,nullable = false)

    private Time hora;
    @Column(name = "fecha",nullable = false)

    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "idDistrito",nullable = false)
    private Distrito distrito;
    @ManyToOne
    @JoinColumn(name = "IdTipodelitos",nullable = false)
    private TipoDelitos tdelitos;

    public Delitos(){

    }

    public Delitos(int iddelito, Time hora, LocalDate fecha, Distrito distrito) {
        this.idDelitos = iddelito;
        this.hora = hora;
        this.fecha = fecha;
        this.distrito = distrito;
    }

    public int getIdDelitos() {
        return idDelitos;
    }

    public void setIdDelitos(int iddelito) {
        this.idDelitos = iddelito;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }
}

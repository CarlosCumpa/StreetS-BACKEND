package streetsafety.com.demo.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="suscripciones")
public class Suscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSuscripcion;

    @ManyToOne
    @JoinColumn(name="idtipoMembresia",nullable = false)
    private TipoMembresia tipoMembresia;

    @Column(name="fechaInicio",nullable = false)
    private LocalDate fechaInicio;

    @Column(name="fechaFin",nullable = false)
    private LocalDate fechaFin;

    @ManyToOne
    @JoinColumn(name="idPago",nullable = false)
    private Pago pago;

    public Suscripcion() {
    }

    public Suscripcion(int idSuscripcion, TipoMembresia tipoMembresia, LocalDate fechaInicio, LocalDate fechaFin, Pago pago) {
        this.idSuscripcion = idSuscripcion;
        this.tipoMembresia = tipoMembresia;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.pago = pago;
    }

    public int getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(int idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    public TipoMembresia getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(TipoMembresia tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
}

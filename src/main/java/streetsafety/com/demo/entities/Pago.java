package streetsafety.com.demo.entities;

import javax.persistence.*;

@Entity
@Table(name="pagos")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPago;

    @Column(name="tipoPago",length=20,nullable = false)
    private String tipoPago;

    @Column(name="monto",length=20,nullable = false)
    private String monto;

    public Pago() {
    }

    public Pago(int idPago, String tipoPago, String monto) {
        this.idPago = idPago;
        this.tipoPago = tipoPago;
        this.monto = monto;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }
}

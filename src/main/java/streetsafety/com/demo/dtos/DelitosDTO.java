package streetsafety.com.demo.dtos;

import java.sql.Time;
import java.time.LocalDate;

public class DelitosDTO
{
    private  int iddelito;
    private Time hora;
    private LocalDate fecha;

    public int getIddelito() {
        return iddelito;
    }

    public void setIddelito(int iddelito) {
        this.iddelito = iddelito;
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
}

package sistema;

import java.time.LocalDate;
import java.util.Date;

public class Ganador {
	
	private LocalDate fecha;
    private Equipo equipoGanador;
    private int goles;
    
    
    
	
	public Ganador(LocalDate fecha, Equipo equipoGanador, int goles) {
		super();
		this.fecha = fecha;
		this.equipoGanador = equipoGanador;
		this.goles = goles;
	}
	
	@Override
	public String toString() {
		return "Ganador [equipoGanador=" + equipoGanador + ", goles=" + goles + "]";
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Equipo getEquipoGanador() {
		return equipoGanador;
	}
	public void setEquipoGanador(Equipo equipoGanador) {
		this.equipoGanador = equipoGanador;
	}
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}
	

}

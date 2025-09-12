package sistema;

import java.util.List;

public class Equipo {
	
	private String nombreEquipo;
    private String IdEquipo;
    private List<Jugador> jugadores;
    private Entrenador entrenador;
    
    
    
	public Equipo() {}
	
	
	public Equipo(String nombreEquipo, String idEquipo, List<Jugador> jugadores, Entrenador entrenador) {
		super();
		this.nombreEquipo = nombreEquipo;
		IdEquipo = idEquipo;
		this.jugadores = jugadores;
		this.entrenador = entrenador;
	}
	@Override
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", IdEquipo=" + IdEquipo + ", jugadores=" + jugadores
				+ ", entrenador=" + entrenador + "]";
	}
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	public String getIdEquipo() {
		return IdEquipo;
	}
	public void setIdEquipo(String idEquipo) {
		IdEquipo = idEquipo;
	}
	public List<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	public Entrenador getEntrenador() {
		return entrenador;
	}
	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}
    
    

}

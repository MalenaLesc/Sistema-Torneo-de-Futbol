package sistema;

public class RegistroParticipacion {
	
	private Jugador jugador;
    private Partido partido;
    private int goles;
    private int asistencias;
    private int minutos;
    
    
	public RegistroParticipacion() {}
	
	
	public RegistroParticipacion(Jugador jugador, Partido partido, int goles, int asistencias, int minutos) {
		super();
		this.jugador = jugador;
		this.partido = partido;
		this.goles = goles;
		this.asistencias = asistencias;
		this.minutos = minutos;
	}
	
	@Override
	public String toString() {
		return "RegistroParticipacion [jugador=" + jugador + ", partido=" + partido + ", goles=" + goles
				+ ", asistencias=" + asistencias + ", minutos=" + minutos + "]";
	}
	public Jugador getJugador() {
		return jugador;
	}
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	public Partido getPartido() {
		return partido;
	}
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}
	public int getAsistencias() {
		return asistencias;
	}
	public void setAsistencias(int asistencias) {
		this.asistencias = asistencias;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
    
    
    

}

package sistema;

public class Goleador {
	private Jugador jugador;
    private int goles;

    public Goleador(Jugador jugador, int goles) {
        this.jugador = jugador;
        this.goles = goles;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public int getGoles() {
        return goles;
    }

	@Override
	public String toString() {
		return "Goleador [jugador=" + jugador + ", goles=" + goles + "]";
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}
    
    
}

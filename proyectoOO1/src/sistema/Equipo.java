package sistema;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Equipo {
	
		private String nombreEquipo;
	    private String IdEquipo;
	    private List<Jugador> jugadores;
	    private Entrenador entrenador;
	    private boolean activo = true;
		
		
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
	
		public boolean isActivo() {
		    return activo;
		}

		public void darDeBaja() {
		    this.activo = false;
		}
	
	    public boolean agregarJugador(String apellido, String nombre, int dni, LocalDate fechaNacimiento, float estatura, float peso,
	    		String posicion, int camiseta) {
	    	
	    	Jugador jug1 = new Jugador(apellido, nombre, dni, fechaNacimiento, estatura, peso, posicion, camiseta);
	    	return jugadores.add(jug1);
	    	
	    }

		public Jugador traerJugadorPorDNI(int dniJugador){
			Jugador jugador = null;
			int contadorJugador = 0;
			
			while (jugador == null && contadorJugador < jugadores.size()) {
				
				if(jugadores.get(contadorJugador).getDniJugador() == dniJugador) {
					
					jugador = jugadores.get(contadorJugador);
					
				}
				
				contadorJugador++;
			}
			return jugador;
		}

		public Entrenador traerEntrenadorPorID(int dniEntrenador) {
		    
			if (entrenador != null && entrenador.getDniEntrenador() == dniEntrenador) {
		    	return entrenador;
		    }
		    
		    return null;
		}

	
		public boolean darDeBajaJugador(int dniJugador) {
		    for (Jugador jugador : jugadores) {
		        if (jugador.getDniJugador() == dniJugador && jugador.isActivo()) {
		        	
		            jugador.darDeBaja();
		            
		            return true;
		        }
		    }
		    return false;
		}
		
		public boolean darDeBajaEntrenador(int dniEntrenador) {
			
			if (entrenador.getDniEntrenador() == dniEntrenador && entrenador.isActivo()) {
				
				entrenador.darDeBaja();
				
				return true;
			}
			return false;
		}
	
	
	}


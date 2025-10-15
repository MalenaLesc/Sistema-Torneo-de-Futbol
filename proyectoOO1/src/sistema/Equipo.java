package sistema;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
	
		private String nombreEquipo;
	    private String IdEquipo;
	    private List<Jugador> jugadores;
	    private Entrenador entrenador;
	    private LocalDate fechaFundacion;
	    private boolean activo = true;
		
		
		public Equipo(String nombreEquipo, String idEquipo, List<Jugador> jugadores, Entrenador entrenador, LocalDate fechaFundacion) {
			super();
			this.nombreEquipo = nombreEquipo;
			IdEquipo = idEquipo;
			this.jugadores = jugadores;
			this.entrenador = entrenador;
			this.fechaFundacion = fechaFundacion;
		}
		
		
		@Override
		public String toString() {
			return "Equipo [nombreEquipo=" + nombreEquipo + ", IdEquipo=" + IdEquipo + ", \njugadores=" + jugadores
					+ ",\nentrenador=" + entrenador + ", fechaFundacion=" + fechaFundacion + ", activo=" + activo + "]";
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
	
		public LocalDate getFechaFundacion() {
			return fechaFundacion;
		}


		public void setFechaFundacion(LocalDate fechaFundacion) {
			this.fechaFundacion = fechaFundacion;
		}


		public boolean isActivo() {
		    return activo;
		}

		public void darDeBaja() {
		    this.activo = false;
		}
	
	    public boolean agregarJugador(String apellido, String nombre, int dni, LocalDate fechaNacimiento, float estatura, float peso,
	    		String posicion, int camiseta) throws Exception {
	    	for(Jugador j : jugadores) {
	    		if(dni == j.getDni()) throw new Exception("El jugador que se intenta agregar ya existe");
	    	}
	    	Jugador jug1 = new Jugador(apellido, nombre, dni, fechaNacimiento, estatura, peso, posicion, camiseta);
	    	return jugadores.add(jug1);
	    	
	    }

		public Jugador traerJugadorPorDNI(int dniJugador){
			Jugador jugador = null;
			int contadorJugador = 0;
			
			while (jugador == null && contadorJugador < jugadores.size()) {
				
				if(jugadores.get(contadorJugador).getDni() == dniJugador) {
					
					jugador = jugadores.get(contadorJugador);
					
				}
				
				contadorJugador++;
			}
			return jugador;
		}

		public Entrenador traerEntrenadorPorID(int dniEntrenador) {
		    
			if (entrenador != null && entrenador.getDni() == dniEntrenador) {
		    	return entrenador;
		    }
		    
		    return null;
		}

	
		public boolean darDeBajaJugador(int dniJugador) {
		    for (Jugador jugador : jugadores) {
		        if (jugador.getDni() == dniJugador && jugador.isActivo()) {
		        	
		            jugador.darDeBaja();
		            
		            return true;
		        }
		    }
		    return false;
		}
		
		public boolean darDeBajaEntrenador(int dniEntrenador) {
			
			if (entrenador.getDni() == dniEntrenador && entrenador.isActivo()) {
				
				entrenador.darDeBaja();
				
				return true;
			}
			return false;
		}
		
		public float calcularEstaturaPromedio() {
			
			float resultado = 0;
			
			if (jugadores.size() == 0)
				return resultado;
			
			for (Jugador jugador: jugadores) {
				
				resultado += jugador.getEstatura();
				
			}
			
			resultado = resultado/jugadores.size();
			
			return resultado;
			
		}

	
		public List<Jugador> buscarJugadoresPorFecha(LocalDate desde, LocalDate hasta) {
		    List<Jugador> resultado = new ArrayList<>();
		    
		    for (Jugador jugador : jugadores) {
		    	
		        LocalDate fechaNacimiento = jugador.getFechaNacimiento();
		        if (fechaNacimiento != null && 
		            (fechaNacimiento.isAfter(desde) || fechaNacimiento.isEqual(desde)) && 
		            (fechaNacimiento.isBefore(hasta) || fechaNacimiento.isEqual(hasta))) {
		            
		            resultado.add(jugador);
		        }
		    }
		    
		    return resultado;
		}
		
		public float calcularAlturaPromedio() {
			
		    if (jugadores == null || jugadores.isEmpty()) {
		        return 0; 
		    }
		    
		    float sumarAltura = 0;
		    for (Jugador j : jugadores) {
		    	sumarAltura += j.getEstatura();
		    }
		    return sumarAltura / jugadores.size();
		}
		
	}



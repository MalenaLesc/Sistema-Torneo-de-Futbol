package sistema;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Torneo {

	
	    private int idTorneo;
	    private String nombreTorneo;
	    private String temporada;
	    private List<Equipo> equipos;
	    private LocalDate fechaInicio;
	    private LocalDate fechaFin;
	    private List<Partido> partidos;


	    public Torneo() {
	    }

	    

		

		public Torneo(int idTorneo, String nombreTorneo, String temporada, List<Equipo> equipos, LocalDate fechaInicio,
				LocalDate fechaFin, List<Partido> partidos) {
			super();
			this.idTorneo = idTorneo;
			this.nombreTorneo = nombreTorneo;
			this.temporada = temporada;
			this.equipos = equipos;
			this.fechaInicio = fechaInicio;
			this.fechaFin = fechaFin;
			this.partidos = partidos;
		}


		@Override
		public String toString() {
			return "Torneo [idTorneo=" + idTorneo + ", nombreTorneo=" + nombreTorneo + ", temporada=" + temporada
					+ ", equipos=" + equipos + ", partidos=" + partidos + "]";
		}

		public int getIdTorneo() {
			return idTorneo;
		}


		public void setIdTorneo(int idTorneo) {
			this.idTorneo = idTorneo;
		}


		public String getNombreTorneo() {
			return nombreTorneo;
		}


		public void setNombreTorneo(String nombreTorneo) {
			this.nombreTorneo = nombreTorneo;
		}


		public String getTemporada() {
			return temporada;
		}


		public void setTemporada(String temporada) {
			this.temporada = temporada;
		}


		public List<Equipo> getEquipos() {
			return equipos;
		}


		public void setEquipos(List<Equipo> equipos) {
			this.equipos = equipos;
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

		public List<Partido> getPartidos() {
			return partidos;
		}


		public void setPartidos(List<Partido> partidos) {
			this.partidos = partidos;
		}
	    
	    public boolean agregarEquipo(String nombreEquipo, List<Jugador> jugadores, String idEquipo, Entrenador entrenador1, LocalDate fechaFundacion) {
	    	Equipo equipo1 = new Equipo(nombreEquipo, idEquipo, jugadores, entrenador1, fechaFundacion);
	    	return equipos.add(equipo1);
	    }
	    
	    public boolean agregarPartido(LocalDate fechaPartido, Equipo local, Equipo visitante, String estadio, int idPartido, int golesLocal, int golesVisitante) {
	    	Partido partido1 = new Partido(fechaPartido, local, visitante, estadio, idPartido, golesLocal, golesVisitante);
	    	return partidos.add(partido1);
	    }
	    
	    
	    //CU 4: Traer para un torneo y un número de fecha, la lista de los equipos ganadores
	    //utilizando una clase (Ganador, no se persiste es solo para generar reporte) con
	    //fecha, el equipo ganador, cantidad de goles
	    
	    public List<Ganador> listaGanadoresPorFecha(LocalDate fechaBuscada) {
	    	
	        List<Ganador> ganadores = new ArrayList<>();
	        
	        for (Partido partido : partidos) {
	        	
	        	Equipo ganador = partido.equipoGanador();
	        
	        	if (partido.getFechaPartido().equals(fechaBuscada)) {
	        		
	                if (ganador != null) {
	                	ganadores.add(new Ganador(partido.getFechaPartido(), ganador, partido.cantGolesGanador()));
	                }
	        	
	        	}
	        }
	        	
        	System.out.println("=== Ganadores del " + fechaBuscada + " ===\n");
        	
            if (ganadores.isEmpty()) {
                System.out.println("No hubo ganadores en esa fecha (empates o sin partidos)\n");
                
            } else {
                for (Ganador g : ganadores) {
                    System.out.println("Equipo: " + g.getEquipoGanador().getNombreEquipo() + ", Goles: " + g.getGoles());
                }
            }
        
        
	        return ganadores; 
	    }
	    
		public List<Equipo> traerEquipoPorID(String IdEquipo){
			List<Equipo> filtrarEquipo = new ArrayList<Equipo>(); 
			
			for (Equipo equipo : equipos) {
				
				if (equipo.getNombreEquipo().indexOf(IdEquipo) >= 0) {
					
					filtrarEquipo.add(equipo);
				}
			}
			
			return filtrarEquipo;
		}
		
		public Partido traerPartidosPorID(int idPartido) {
		    Partido partido = null;
		    int contadorPartidos = 0;

		    while (partido == null && contadorPartidos < partidos.size()) {
		    	
		        if (partidos.get(contadorPartidos).getIdPartido() == idPartido) {
		        	
		            partido = partidos.get(contadorPartidos);
		            
		        }
		        
		        contadorPartidos++;
		    }

		    return partido;
		}
		
		public boolean darDeBajaEquipo(String idEquipo) {
		    for (Equipo equipo : equipos) {
		        if (equipo.getIdEquipo().equals(idEquipo) && equipo.isActivo()) {
		            equipo.darDeBaja();
		            return true;
		        }
		    }
		    return false;
		}
	    
		public List<Equipo> traerEquiposPorFechaDeFundacion(LocalDate fecha){
			
			List<Equipo> equiposPorFecha = new ArrayList<>();
			
			for (Equipo equipo: equipos) {
				
				if (equipo.getFechaFundacion().isBefore(fecha)) {
					
					equiposPorFecha.add(equipo);					
				}
				
			}
			
			return equiposPorFecha;
			
		}
		
		public int calcularPuntosPorEquipo (Equipo equipo) {
			
			int puntos = 0;
			
			for (Partido p: partidos) {
				
				if (equipo.equals(p.getLocal()))
					if (p.getGolesLocal() > p.getGolesVisitante())
						puntos += 3;
					else if (p.getGolesLocal() == p.getGolesVisitante())
						puntos += 1;
				
				if (equipo.equals(p.getVisitante()))
					if (p.getGolesVisitante() > p.getGolesLocal())
						puntos += 3;
					else if (p.getGolesVisitante() == p.getGolesLocal())
						puntos += 1;
				
			}
			
			return puntos;
			
		}
		
		private class Posicion {
			
			Equipo equipo;
			int puntaje;
			
			public Posicion(Equipo equipo, int puntaje) {
				super();
				this.equipo = equipo;
				this.puntaje = puntaje;
			}
			
		}
		
		public List<Posicion> generarTablaPosiciones(){
			
			List<Posicion> tabla = new ArrayList<>();
			
			for (Equipo e: equipos) {
				Posicion posicion = new Posicion(e, calcularPuntosPorEquipo(e));
				tabla.add(posicion);
			}
			
			tabla.sort(Comparator.comparingInt((Posicion p) -> p.puntaje).reversed());
			
			return tabla;
			
		}
		
		// Agrego una forma "amigable" para mostrar la tabla de posiciones:
		public void mostrarTablaPosiciones(List<Posicion> tabla) {
			
			System.out.printf("%-20s %s%n", "Equipo", "Puntos");
		    System.out.println("-------------------- ------");

		    for (Posicion p : tabla) {
		        System.out.printf("%-20s %5d%n", p.equipo.getNombreEquipo(), p.puntaje);
		    }
			
		}
		
		//Metodo para crear una lista de entrenadores en base a una tactica favorita
		public List<Entrenador> traerEntrenadoresPorTactica(String tactica){
			List<Entrenador> entrenadoresEncontrados = new ArrayList<Entrenador>();
			for(Equipo equipo1 : equipos) {
				Entrenador entrenador1 = equipo1.getEntrenador();
				if(entrenador1 != null && entrenador1.getEstrategia().equalsIgnoreCase(tactica)) {
					entrenadoresEncontrados.add(entrenador1);
				}
			}
			return entrenadoresEncontrados;
		}
		
		//Metodo que devuelve la cantidad total de goles anotados en el torneo por un jugador
		public int cantidadTotalGoles(Jugador jugador) {
			int totalGoles = 0;
			for(Partido partido : partidos) {
				for(RegistroParticipacion reg : partido.getRegistros()) {
					if(reg.getJugador().equals(jugador)) {
						totalGoles += reg.getGoles();
					}
				}
			}
			return totalGoles;
		}
		
		public List<Goleador> calcularGoleadores(){
			
			Map<Jugador, Integer> golesPorJugador = new HashMap<>();
			
			for(Partido partido : partidos) {
				for(RegistroParticipacion reg : partido.getRegistros()) {
					
					Jugador jugador = reg.getJugador();
					int goles = reg.getGoles();
					golesPorJugador.put(jugador, golesPorJugador.getOrDefault(jugador, 0) + goles);
					
				}
			}
			
			List<Goleador> tablaGoleadores = new ArrayList<>();
			for(Map.Entry<Jugador, Integer> entry : golesPorJugador.entrySet()) {
				tablaGoleadores.add(new Goleador(entry.getKey(), entry.getValue()));
			}
			
			tablaGoleadores.sort(Comparator.comparingInt(Goleador::getGoles).reversed());
			
			return tablaGoleadores;
			
		}
		
		//CU 13: Cálculo de asistencias por jugador: Escribir un método que, dado un objeto Jugador, 
		//devuelva el total de asistencias que ha logrado en el torneo.

		public int totalAsistenciasTorneo (Jugador jugador) {
			
		    int totalAsistencias = 0;
		    
		    for (Partido partido : partidos) {
		    	
		        for (RegistroParticipacion registro : partido.getRegistros()) {
		        	
		            if (registro.getJugador().equals(jugador)) {
		                totalAsistencias += registro.getAsistencias();
		            }
		        }
		    }
		    
		    return totalAsistencias;
		}

		//CU 15: Generación de tabla de asistidores: Implementar un método que retorne una lista de
		//(Asistencia, no se persiste es solo para generar reporte) con el jugador y sus asistencias, 
		//ordenada de mayor a menor (utilizando ordenamiento de listas nativo o desarrollando el algoritmo de algún método de ordenamiento).
	
		public List<Asistencia> tablaAsistidores() {
		    List<Asistencia> tablaAsistencias = new ArrayList<>();
	
		    for (Partido partido : partidos) {
		    	
		        for (RegistroParticipacion registro : partido.getRegistros()) {
		            
		            Jugador jugador = registro.getJugador();
		            int asistencias = registro.getAsistencias();
	
		            
		            
		            Asistencia asistenciaEncontrada = null;
		            int i = 0;
		            //Busco si el jugador ya existe en mi tabla
		            while (i < tablaAsistencias.size() && asistenciaEncontrada == null) {
		            	
		                Asistencia a = tablaAsistencias.get(i);
		                
		                if (a.getJugador().equals(jugador)) {
		                    asistenciaEncontrada = a;
		                }
		                
		                i++;
		            }
	
		            if (asistenciaEncontrada != null) {
		            	
		                //Si el jugador ya estaba, sumo el numero de asistencias al que ya estaba guardado
		                asistenciaEncontrada.setAsistencias(asistenciaEncontrada.getAsistencias() + asistencias);
		                
		            } else {
		                // si no esta, lo agrego
		                tablaAsistencias.add(new Asistencia(jugador, asistencias));
		            }
		        }
		    }
	
		    // ordena de manera descendente
		    tablaAsistencias.sort(Comparator.comparingInt(Asistencia::getAsistencias).reversed());
	
		    return tablaAsistencias;
		}

	
}

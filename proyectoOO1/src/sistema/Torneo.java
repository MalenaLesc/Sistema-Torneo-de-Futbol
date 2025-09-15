package sistema;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
	    
	    public boolean agregarEquipo(String nombreEquipo, List<Jugador> jugadores, String idEquipo, Entrenador entrenador1) {
	    	Equipo equipo1 = new Equipo(nombreEquipo, idEquipo, jugadores, entrenador1);
	    	return equipos.add(equipo1);
	    }
	    
	    public boolean agregarPartido(LocalDate fechaPartido, Equipo local, Equipo visitante, String estadio, int idPartido, int golesLocal, int golesVisitante) {
	    	Partido partido1 = new Partido(fechaPartido, local, visitante, estadio, idPartido, golesLocal, golesVisitante);
	    	return partidos.add(partido1);
	    }
	    
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
	        
	        return ganadores;
	        
	    }
	    
	   
	    
}
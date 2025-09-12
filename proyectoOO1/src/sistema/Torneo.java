package sistema;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Torneo {

	
	    private int idTorneo;
	    private String nombreTorneo;
	    private String temporada;
	    private List<Equipo> equipos;
	    private Date fechaInicio;
	    private Date fechaFin;
	    private List<Partido> partidos;


	    public Torneo() {
	    }

	    

		public Torneo(int idTorneo, String nombreTorneo, String temporada, List<Equipo> equipos, Date fechaInicio,
				Date fechaFin, List<Partido> partidos) {
			super();
			this.idTorneo = idTorneo;
			this.nombreTorneo = nombreTorneo;
			this.temporada = temporada;
			this.equipos = new ArrayList<Equipo>();
			this.fechaInicio = fechaInicio;
			this.fechaFin = fechaFin;
			this.partidos = new ArrayList<Partido>();
		}



		@Override
		public String toString() {
			return "Torneo [idTorneo=" + idTorneo + ", nombreTorneo=" + nombreTorneo + ", temporada=" + temporada
					+ ", equipos=" + equipos + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", partidos="
					+ partidos + "]";
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


		public Date getFechaInicio() {
			return fechaInicio;
		}


		public void setFechaInicio(Date fechaInicio) {
			this.fechaInicio = fechaInicio;
		}


		public Date getFechaFin() {
			return fechaFin;
		}


		public void setFechaFin(Date fechaFin) {
			this.fechaFin = fechaFin;
		}


		public List<Partido> getPartidos() {
			return partidos;
		}


		public void setPartidos(List<Partido> partidos) {
			this.partidos = partidos;
		}
	    
	    public boolean agregarEquipo(String nombreEquipo, String idEquipo, Entrenador entrenador1) {
	    	Equipo equipo1 = new Equipo(nombreEquipo, idEquipo, entrenador1);
	    	return equipos.add(equipo1);
	    }
	    
	    public boolean agregarPartido(Date fechaPartido, Equipo local, Equipo visitante, String estadio, int idPartido) {
	    	Partido partido1 = new Partido(fechaPartido, local, visitante, estadio, idPartido);
	    	return partidos.add(partido1);
	    }
	    
}
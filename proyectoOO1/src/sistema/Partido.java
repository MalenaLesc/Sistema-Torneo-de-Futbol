package sistema;

import java.time.LocalDate;


public class Partido {
	
	private LocalDate fechaPartido;
    private Equipo local;
    private Equipo visitante;
    private String estadio;
    private int idPartido;
    
    private int golesLocal;
	private int golesVisitante;

    
    
	
	public Partido(LocalDate fechaPartido, Equipo local, Equipo visitante, String estadio, int idPartido, int golesLocal, int golesVisitante) {
		super();
		this.fechaPartido = fechaPartido;
		this.local = local;
		this.visitante = visitante;
		this.estadio = estadio;
		this.idPartido = idPartido;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
	}
	
	
	
	@Override
	public String toString() {
		return "Partido [fechaPartido=" + fechaPartido + ", local=" + local + ", visitante=" + visitante + ", estadio="
				+ estadio + ", idPartido=" + idPartido + ", golesLocal=" + golesLocal + ", golesVisitante="
				+ golesVisitante + "]";
	}



	public LocalDate getFechaPartido() {
		return fechaPartido;
	}
	public void setFechaPartido(LocalDate fechaPartido) {
		this.fechaPartido = fechaPartido;
	}
	public Equipo getLocal() {
		return local;
	}
	public void setLocal(Equipo local) {
		this.local = local;
	}
	public Equipo getVisitante() {
		return visitante;
	}
	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
	}
	public String getEstadio() {
		return estadio;
	}
	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}
	public int getIdPartido() {
		return idPartido;
	}
	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}
    
	 public int getGolesLocal() {
		return golesLocal;
    }

	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}

	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}
	
	public Equipo equipoGanador() {
		
		Equipo ganador = null;
		
	    if (golesLocal > golesVisitante) {
	        ganador = local;
	        
	    } else if (golesVisitante > golesLocal) {
	    	ganador = visitante;
	    }
	    
	    return ganador;
	}
	
	public int cantGolesGanador() {
		
		int goles = 0;
				
	    if (golesLocal > golesVisitante) {
	        goles = golesLocal;
	        
	    } else if (golesVisitante > golesLocal) {
	    	goles = golesVisitante;
	    }
	    
	    return goles; // si retorna 0 entonces fue empate
	}

}

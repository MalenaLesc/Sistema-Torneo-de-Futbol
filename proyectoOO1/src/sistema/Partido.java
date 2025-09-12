package sistema;

import java.util.Date;

public class Partido {
	
	private Date fechaPartido;
    private Equipo local;
    private Equipo visitante;
    private String estadio;
    private int idPartido;
    
    
	public Partido() {}
	
	public Partido(Date fechaPartido, Equipo local, Equipo visitante, String estadio, int idPartido) {
		super();
		this.fechaPartido = fechaPartido;
		this.local = local;
		this.visitante = visitante;
		this.estadio = estadio;
		this.idPartido = idPartido;
	}
	@Override
	public String toString() {
		return "Partido [fechaPartido=" + fechaPartido + ", local=" + local + ", visitante=" + visitante + ", estadio="
				+ estadio + ", idPartido=" + idPartido + "]";
	}
	public Date getFechaPartido() {
		return fechaPartido;
	}
	public void setFechaPartido(Date fechaPartido) {
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
    
    

}

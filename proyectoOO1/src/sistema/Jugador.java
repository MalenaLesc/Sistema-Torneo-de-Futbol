package sistema;

import java.time.LocalDate;
import java.util.Objects;


public class Jugador {
	
		private String apellidoJugador;
		private String nombreJugador;
	    private int dniJugador;
	    private LocalDate fechaNacimientoJugador;
	    private float estatura;
	    private float peso;
	    private String posicion;
	    private int camiseta;
	    private boolean activo = true;
	
		
	    public Jugador() {}
	   
	
		public Jugador(String apellidoJugador, String nombreJugador, int dniJugador, LocalDate fechaNacimientoJugador,
				float estatura, float peso, String posicion, int camiseta) {
			super();
			this.apellidoJugador = apellidoJugador;
			this.nombreJugador = nombreJugador;
			this.dniJugador = dniJugador;
			this.fechaNacimientoJugador = fechaNacimientoJugador;
			this.estatura = estatura;
			this.peso = peso;
			this.posicion = posicion;
			this.camiseta = camiseta;
		}
	
	
		@Override
		public String toString() {
			return "Jugador [apellidoJugador=" + apellidoJugador + ", nombreJugador=" + nombreJugador + ", dniJugador="
					+ dniJugador + ", fechaNacimientoJugador=" + fechaNacimientoJugador + ", estatura=" + estatura
					+ ", peso=" + peso + ", posicion=" + posicion + ", camiseta=" + camiseta + "]";
		}
	
	
		public String getApellidoJugador() {
			return apellidoJugador;
		}
		public void setApellidoJugador(String apellidoJugador) {
			this.apellidoJugador = apellidoJugador;
		}
		public String getNombreJugador() {
			return nombreJugador;
		}
		public void setNombreJugador(String nombreJugador) {
			this.nombreJugador = nombreJugador;
		}
		public int getDniJugador() {
			return dniJugador;
		}
		public void setDniJugador(int dniJugador) {
			this.dniJugador = dniJugador;
		}	
		public LocalDate getFechaNacimientoJugador() {
			return fechaNacimientoJugador;
		}
		public void setFechaNacimientoJugador(LocalDate fechaNacimientoJugador) {
			this.fechaNacimientoJugador = fechaNacimientoJugador;
		}
		public float getEstatura() {
			return estatura;
		}
		public void setEstatura(float estatura) {
			this.estatura = estatura;
		}
		public float getPeso() {
			return peso;
		}
		public void setPeso(float peso) {
			this.peso = peso;
		}
		public String getPosicion() {
			return posicion;
		}
		public void setPosicion(String posicion) {
			this.posicion = posicion;
		}
		public int getCamiseta() {
			return camiseta;
		}
		public void setCamiseta(int camiseta) {
			this.camiseta = camiseta;
		}

		public boolean isActivo() {
		    return activo;
		}

		public void darDeBaja() {
		    this.activo = false;
		}


		@Override
		public int hashCode() {
			return Objects.hash(activo, apellidoJugador, camiseta, dniJugador, estatura, fechaNacimientoJugador,
					nombreJugador, peso, posicion);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Jugador other = (Jugador) obj;
			return activo == other.activo && Objects.equals(apellidoJugador, other.apellidoJugador)
					&& camiseta == other.camiseta && dniJugador == other.dniJugador
					&& Float.floatToIntBits(estatura) == Float.floatToIntBits(other.estatura)
					&& Objects.equals(fechaNacimientoJugador, other.fechaNacimientoJugador)
					&& Objects.equals(nombreJugador, other.nombreJugador)
					&& Float.floatToIntBits(peso) == Float.floatToIntBits(other.peso)
					&& Objects.equals(posicion, other.posicion);
		}
		
		
		
	}

package sistema;

import java.time.LocalDate;
import java.util.Objects;


public class Jugador extends Persona{
	
	    private float estatura;
	    private float peso;
	    private String posicion;
	    private int camiseta;
	    private boolean activo = true;
	   
	
		public Jugador(String apellidoJugador, String nombreJugador, int dniJugador, LocalDate fechaNacimientoJugador,
				float estatura, float peso, String posicion, int camiseta) {
			super(nombreJugador, apellidoJugador, dniJugador, fechaNacimientoJugador);
			this.estatura = estatura;
			this.peso = peso;
			this.posicion = posicion;
			this.camiseta = camiseta;
		}
	
	
		
	
	
		@Override
		public String toString() {
			return super.toString() + "Jugador [estatura=" + estatura + ", peso=" + peso + ", posicion=" + posicion + ", camiseta="
					+ camiseta + ", activo=" + activo + "]";
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
			return Objects.hash(activo, camiseta, estatura, peso, posicion);
		}

		


		
		
		
	}

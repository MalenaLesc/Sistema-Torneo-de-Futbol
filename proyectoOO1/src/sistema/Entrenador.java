package sistema;

import java.time.LocalDate;


public class Entrenador extends Persona {
	 	
	    private String estrategia;
		private boolean activo = true;

	

		public Entrenador(String apellidoEntrenador, String nombreEntrenador, int dniEntrenador, LocalDate fechaNacimientoEntrenador, String estrategia) {
			super(nombreEntrenador, apellidoEntrenador, dniEntrenador, fechaNacimientoEntrenador);
			this.estrategia = estrategia;
		}

		
		
		

		@Override
		public String toString() {
			return super.toString() + "Entrenador [estrategia=" + estrategia + ", activo=" + activo + "]";
		}



		public String getEstrategia() {
			return estrategia;
		}


		public void setEstrategia(String estrategia) {
			this.estrategia = estrategia;
		}



		public boolean isActivo() {
		    return activo;
		}

		public void darDeBaja() {
		    this.activo = false;
		}
		
	    
}

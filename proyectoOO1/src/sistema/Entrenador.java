package sistema;

import java.time.LocalDate;


public class Entrenador {
	 	
		private String apellidoEntrenador;
	    private String nombreEntrenador;
	    private int dniEntrenador;
	    private LocalDate fechaNacimientoEntrenador;
	    private String estrategia;
		private boolean activo = true;

	
	    public Entrenador() {}

		public Entrenador(String apellidoEntrenador, String nombreEntrenador, int dniEntrenador, LocalDate fechaNacimientoEntrenador, String estrategia) {
			super();
			this.apellidoEntrenador = apellidoEntrenador;
			this.nombreEntrenador = nombreEntrenador;
			this.dniEntrenador = dniEntrenador;
			this.fechaNacimientoEntrenador = fechaNacimientoEntrenador;
			this.estrategia = estrategia;
		}

		

		@Override
		public String toString() {
			return "Entrenador [apellidoEntrenador=" + apellidoEntrenador + ", nombreEntrenador=" + nombreEntrenador
					+ ", dniEntrenador=" + dniEntrenador + ", fechaNacimientoEntrenador=" + fechaNacimientoEntrenador
					+ ", estrategia=" + estrategia + "]";
		}

		public String getApellidoEntrenador() {
			return apellidoEntrenador;
		}


		public void setApellidoEntrenador(String apellidoEntrenador) {
			this.apellidoEntrenador = apellidoEntrenador;
		}


		public String getNombreEntrenador() {
			return nombreEntrenador;
		}


		public void setNombreEntrenador(String nombreEntrenador) {
			this.nombreEntrenador = nombreEntrenador;
		}


		public int getDniEntrenador() {
			return dniEntrenador;
		}


		public void setDniEntrenador(int dniEntrenador) {
			this.dniEntrenador = dniEntrenador;
		}


		public String getEstrategia() {
			return estrategia;
		}


		public void setEstrategia(String estrategia) {
			this.estrategia = estrategia;
		}

		public LocalDate getFechaNacimientoEntrenador() {
			return fechaNacimientoEntrenador;
		}

		public void setFechaNacimientoEntrenador(LocalDate fechaNacimientoEntrenador) {
			this.fechaNacimientoEntrenador = fechaNacimientoEntrenador;
		}

		public boolean isActivo() {
		    return activo;
		}

		public void darDeBaja() {
		    this.activo = false;
		}
		
	    
}

package sistema;

import java.util.Date;

public class Entrenador {
	 	
		private String apellidoEntrenador;
	    private String nombreEntrenador;
	    private int dniEntrenador;
	    private Date fechaNacimientoEntrenador;
	    private String estrategia;

	
	    public Entrenador() {}
	    
	    


		public Entrenador(String apellidoEntrenador, String nombreEntrenador, int dniEntrenador,
				Date fechaNacimientoEntrenador, String estrategia) {
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


		public Date getFechaNacimientoEntrenador() {
			return fechaNacimientoEntrenador;
		}


		public void setFechaNacimientoEntrenador(Date fechaNacimientoEntrenador) {
			this.fechaNacimientoEntrenador = fechaNacimientoEntrenador;
		}


		public String getEstrategia() {
			return estrategia;
		}


		public void setEstrategia(String estrategia) {
			this.estrategia = estrategia;
		}
	    
	    

}
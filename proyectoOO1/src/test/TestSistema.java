package test;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import sistema.Asistencia;
import sistema.Entrenador;
import sistema.Equipo;
import sistema.Ganador;
import sistema.Goleador;
import sistema.Jugador;
import sistema.Partido;
import sistema.Torneo;

public class TestSistema {

	public static void main(String[] args) {

	    // Crear entrenadores
		Entrenador entrenador1 = new Entrenador("López", "Carlos", 11111111, LocalDate.of(1975, 5, 20), "Defensiva");
	    Entrenador entrenador2 = new Entrenador("Martínez", "Juan", 22222222, LocalDate.of(1980, 8, 15), "Ofensiva");
	
	
	    // Crear jugadores equipo 1
	    Jugador j1 = new Jugador("Pérez", "Luis", 33333333, LocalDate.of(1995, 3, 10), 1.80f, 75, "Delantero", 9);
	    Jugador j2 = new Jugador("Gómez", "Diego", 44444444, LocalDate.of(1998, 7, 25), 1.75f, 70, "Mediocampista", 8);
	    Jugador j3 = new Jugador("Fernández", "Pablo", 55555555, LocalDate.of(1992, 11, 5), 1.85f, 78, "Defensa", 5);
	
	    
        // Crear jugadores equipo 2
        Jugador j4 = new Jugador("Suárez", "Matías", 66666666, LocalDate.of(1994, 2, 2), 1.82f, 76, "Delantero", 10);
        Jugador j5 = new Jugador("Díaz", "Jorge", 77777777, LocalDate.of(1997, 12, 12), 1.70f, 68, "Mediocampista", 7);
        Jugador j6 = new Jugador("Ramírez", "Sergio", 88888888, LocalDate.of(1991, 9, 30), 1.88f, 80, "Defensa", 4);

        // Crear equipos
        Equipo equipo1 = new Equipo("Tiburones", "E001", Arrays.asList(j1, j2, j3), entrenador1, LocalDate.of(1970, 02, 26));
        Equipo equipo2 = new Equipo("Leones", "E002", Arrays.asList(j4, j5, j6), entrenador2, LocalDate.of(1999, 01,30));

        // Crear partidos
        Partido partido1 = new Partido(LocalDate.of(2025, 3, 15), equipo1, equipo2, "Estadio Central", 2, 1, 1);
        Partido partido2 = new Partido(LocalDate.of(2025, 3, 22), equipo2, equipo1, "Estadio Norte", 0, 3, 9);
        Partido partido3 = new Partido(LocalDate.of(2025, 3, 22), equipo1, equipo2, "Estadio Sur", 1, 1, 2); // empate


        // Crear torneo
        Torneo torneo = new Torneo(1, "Clausura 2025", "2025", Arrays.asList(equipo1, equipo2), LocalDate.of(2025, 3, 1), LocalDate.of(2025, 6, 30), Arrays.asList(partido1, partido2, partido3));


        // CU 4: ganadores por fecha
        LocalDate fechaConsulta = LocalDate.of(2025, 3, 22);
        torneo.listaGanadoresPorFecha(fechaConsulta);

        
        //CU 7: mostrar equipos fundados antes de una determinada fecha
        System.out.println("\nEquipos fundados antes de 1980:\n" + torneo.traerEquiposPorFechaDeFundacion(LocalDate.of(1980, 01, 01)));;
        
        //CU 8: calcular altura promedio por equipo
        System.out.println("\nAltura promedio de "+ equipo1.getNombreEquipo()+ ": "+ equipo1.calcularEstaturaPromedio());
        
        //CU 10 y 11: generar la tabla de posiciones según los puntos de cada equipo
        System.out.println("\n--- Tabla de posiciones ---");
        torneo.mostrarTablaPosiciones(torneo.generarTablaPosiciones());;
        
        //CU 5: Generar lista de entrenadores filtrando por una estrategia en particular
        System.out.println(torneo.traerEntrenadoresPorTactica("defensiva"));
        
        //Agregamos registros de jugadores
        partido1.agregarRegistro(j1, 1, 7, 90);
        partido1.agregarRegistro(j4, 1, 3, 90);
        partido2.agregarRegistro(j1, 2, 1, 90);
        partido2.agregarRegistro(j2, 1, 0, 85);
        
        //CU 12: Calcular cantidad total de goles de un jugador en el torneo
        System.out.println("Goles de " + j1.getNombre() + ": " + torneo.cantidadTotalGoles(j1));
        
        //CU 13: Cálculo de asistencias por jugador
        System.out.println("\n=== Total de asistencias por jugador ===");
        System.out.println(j1.getNombre() + ": " + torneo.totalAsistenciasTorneo(j1));
        System.out.println(j2.getNombre() + ": " + torneo.totalAsistenciasTorneo(j2));
        
        //CU 14: Generar Lista ordenada de forma descendente por la cantidad de goles de cada jugador
        System.out.println("\n----Tabla de goleadores----");
        List<Goleador> tablaGoleadores = torneo.tablaGoleadores();
        System.out.println(tablaGoleadores);
        
        //CU 15: Generación de tabla de asistidores
        System.out.println("\n=== Tabla de asistidores ===");
        List<Asistencia> tablaAsistidores = torneo.tablaAsistidores();
        for (Asistencia a : tablaAsistidores) {
            System.out.println(a);
        }
        
        // CU 6: Busqueda por fecha de nacimiento
        LocalDate desde = LocalDate.of(1994, 1, 1);
        LocalDate hasta = LocalDate.of(1996, 12, 31);

        List<Jugador> jugadoresFiltrados = equipo1.buscarJugadoresPorFecha(desde, hasta);
        
        System.out.println("Jugadores de " + equipo1.getNombreEquipo() + " nacidos entre " + desde + " y " + hasta + ":");
        for (Jugador j : jugadoresFiltrados) {
            System.out.println(j.getNombre() + " " + j.getApellido() + " - Nacido el " + j.getFechaNacimiento());
        }

    	// CU 9: equipo con mayor altura promedio
    	Equipo mejor = torneo.equipoConMayorAlturaPromedio();
    	System.out.println("El equipo con mayor altura promedio es: " + mejor.getNombreEquipo() + " con promedio de " + mejor.calcularAlturaPromedio());
    	
	    }
	
	    
	
}




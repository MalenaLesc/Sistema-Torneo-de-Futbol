package test;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import sistema.Entrenador;
import sistema.Equipo;
import sistema.Ganador;
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
        Equipo equipo1 = new Equipo("Tiburones", "E001", Arrays.asList(j1, j2, j3), entrenador1);
        Equipo equipo2 = new Equipo("Leones", "E002", Arrays.asList(j4, j5, j6), entrenador2);

        // Crear partidos

        Partido partido1 = new Partido(LocalDate.of(2025, 3, 15), equipo1, equipo2, "Estadio Central", 2, 1, 1);
        Partido partido2 = new Partido(LocalDate.of(2025, 3, 22), equipo2, equipo1, "Estadio Norte", 0, 3, 9);
        Partido partido3 = new Partido(LocalDate.of(2025, 3, 22), equipo1, equipo2, "Estadio Sur", 1, 1, 2); // empate


        // Crear torneo
        Torneo torneo = new Torneo(1, "Clausura 2025", "2025", Arrays.asList(equipo1, equipo2), LocalDate.of(2025, 3, 1), LocalDate.of(2025, 6, 30), Arrays.asList(partido1, partido2, partido3));


        // CU 4: ganadores por fecha
        LocalDate fechaConsulta = LocalDate.of(2025, 3, 22);
        System.out.println("=== Ganadores del " + fechaConsulta + " ===");

        List<Ganador> ganadores = torneo.listaGanadoresPorFecha(fechaConsulta);

        if (ganadores.isEmpty()) {
            System.out.println("No hubo ganadores en esa fecha (empates o sin partidos).");
	        } else {
	            for (Ganador g : ganadores) {
	                System.out.println(g);
	            }
	        }
	    }
	
}



package aplicacion;

import java.time.LocalDate;

import modelo.Entrenador;
import modelo.Equipo;
import modelo.Formacion;
import modelo.Jugador;
import modelo.Posicion;
import modelo.Presidente;

public class Main {
    public static void main(String[] arg) {

        // equipos
        Equipo eq1 = new Equipo("Olimpia OL");
        Equipo eq2 = new Equipo("Leones United");
        Equipo eq3 = new Equipo("Nacional NC");

        // jugadores
        Jugador j1 = new Jugador("Ramos", LocalDate.of(1996, 3, 15), eq1, Posicion.DEFENSA);
        Jugador j2 = new Jugador("Vega", LocalDate.of(1998, 7, 21), eq2, Posicion.CENTROCAMPISTA);
        Jugador j3 = new Jugador("Torres", LocalDate.of(2000, 1, 10), eq3, Posicion.DELANTERO);
        Jugador j4 = new Jugador("Luna", LocalDate.of(1997, 9, 2), eq1, Posicion.PORTERO);
        Jugador j5 = new Jugador("Navas", LocalDate.of(1999, 12, 5), eq2, Posicion.DEFENSA);
        Jugador j6 = new Jugador("Ruiz", LocalDate.of(2001, 4, 18), eq3, Posicion.CENTROCAMPISTA);
        Jugador j7 = new Jugador("Molina", LocalDate.of(1995, 6, 30), eq1, Posicion.DELANTERO);
        Jugador j8 = new Jugador("Santos", LocalDate.of(2002, 11, 8), eq3, Posicion.DEFENSA);

        // entrenadores
        Entrenador e1 = new Entrenador("Carlos Martin", LocalDate.of(1970, 1, 1), eq1, Formacion.F_4_3_3);
        Entrenador e2 = new Entrenador("Luis Perez", LocalDate.of(1975, 1, 1), eq2, Formacion.F_4_4_2);
        Entrenador e3 = new Entrenador("mariano Gomez", LocalDate.of(1968, 1, 1), eq3, Formacion.F_3_5_2);

        // asignar entrenadores
        eq1.setEntrenador(e1);
        eq2.setEntrenador(e2);
        eq3.setEntrenador(e3);

        // añadir jugadores
        eq1.añadirJugador(j1);
        eq1.añadirJugador(j2);
        eq1.añadirJugador(j3);

        eq2.añadirJugador(j4);
        eq2.añadirJugador(j5);

        eq3.añadirJugador(j6);
        eq3.añadirJugador(j7);
        eq3.añadirJugador(j8);

        // probar ejercicio 7
        System.out.println(eq1);
        eq1.verPlantilla();
        eq2.verPlantilla();

        // ejercicio 8, contadores
        System.out.println("Total jugadores: " + Jugador.getTotalJugadores());
        System.out.println("Total entrenadores: " + Entrenador.getTotalEntrenadores());
        System.out.println("Total equipos: " + Equipo.getTotalEquipos());

        // crear prsidente
        Presidente p1 = new Presidente("Juan Garcia", LocalDate.of(1960, 1, 1), eq1);

        j1.solicitarTraspaso(); // SIN_SOLICITAR SOLICITADO
        e1.aprobarTraspaso(j1); // SOLICITADO APROBADO_POR_ENTRENADOR
        p1.aprobarTraspaso(j1); // APROBADO_POR_ENTRENADOR APROBADO_POR_PRESIDENTE
        eq1.transferirJugador(j1, eq2); // transferencia
    }
}

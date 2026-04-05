import java.time.LocalDate;

public class Main {
    public static void main(String[] arg) {

        //jugadores
        Jugador j1 = new Jugador("Ramos", LocalDate.of(1996, 3, 15), "Defensa");
        Jugador j2 = new Jugador("Vega", LocalDate.of(1998, 7, 21), "Centrocampista");
        Jugador j3 = new Jugador("Torres", LocalDate.of(2000, 1, 10), "Delantero");
        Jugador j4 = new Jugador("Luna", LocalDate.of(1997, 9, 2), "Portero");
        Jugador j5 = new Jugador("Navas", LocalDate.of(1999, 12, 5), "Defensa");
        Jugador j6 = new Jugador("Ruiz", LocalDate.of(2001, 4, 18), "Centrocampista");
        Jugador j7 = new Jugador("Molina", LocalDate.of(1995, 6, 30), "Delantero");
        Jugador j8 = new Jugador("Santos", LocalDate.of(2002, 11, 8), "Defensa");

        //entrenadores 
        Entrenador e1 = new Entrenador("Carlos Martin", "4-3-3");
        Entrenador e2 = new Entrenador("Luis Perez", "4-4-2");
        Entrenador e3 = new Entrenador("mariano Gomez", "3-5-2");

        //equipos 
        Equipo eq1 = new Equipo("Olimpia OL");
        Equipo eq2 = new Equipo("Leones United");
        Equipo eq3 = new Equipo("Nacional NC");

        //asignar entrenadores 
        



    }
}

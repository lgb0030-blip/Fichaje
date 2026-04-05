import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private Entrenador entrenador;
    private ArrayList<Jugador> jugadores;
    private static int totalEquipos = 0;

    /**
     * Constructor de la clase Equipo.
     * @param nombre Nombre del equipo.
     */
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.entrenador = null;
        this.jugadores = new ArrayList<Jugador>();
        totalEquipos++;
    }
    public static int getTotalEquipos() {
    return totalEquipos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Equipo: " + nombre +
               " | Entrenador: " + entrenador +
               " | Jugador: " + jugadores.size();
    }

    public void añadirJugador(Jugador j) {
        jugadores.add(j);

    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

  public void verPlantilla() {
    System.out.println("Plantilla del equipo " + nombre + ":");
    if (jugadores.isEmpty()) {
        System.out.println("No hay jugadores en la plantilla.");
    } else {
        for (Jugador j : jugadores) {
            System.out.println(j);
        }
    }
}

public void transferirJugador(Jugador jug, Equipo destino) {
    if (jugadores.contains(jug) && jug.isTraspasoSolicitado()) {
        jugadores.remove(jug);
        destino.añadirJugador(jug);
        jug.setTraspasoSolicitado(false);

        System.out.println("Transferencia realizada: " + jug.getNombre() + " pasa de " + this.nombre + " a " + destino.getNombre() + ".");

    } else {
        System.out.println("Transferencia no realizada para " + jug.getNombre() + ".");
    }
}

}
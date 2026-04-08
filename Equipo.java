import java.util.ArrayList;
/**
 * Clase que representa un equipo de la liga.
 */
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
    /**
     * Total de equipos instanciados.
     * @return 
     */
    public static int getTotalEquipos() {
    return totalEquipos;
    }
    /**
     * Devuelve el nombre del equipo.
     * @return nombre del equipo
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Modifica el nombre del equipo.
     * @param nombre Nombre nuevo del equipo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @return cadena con la informacion del equipo
     */
    @Override
    public String toString() {
        return "Equipo: " + nombre +
               " | Entrenador: " + entrenador +
               " | Jugador: " + jugadores.size();
    }
    /**
     * Añade un jugador a la lista de jugadores de equipo.
     * no realiza comprobacion
     * @param j jugador añadido
     */
    public void añadirJugador(Jugador j) {
        jugadores.add(j);

    }
    /**
     * Asigna un entrenador al equipo.
     * @param entrenador Entrenador a asignar
     */
    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }
    /**
     * Muestra todos los jugadores del equipo .
     */
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
/**
 * Transferir un jugador a otro equipo si tiene traspaso solicitado.
 * @param jug jugador a transferir.
 * @param destino equipo destino
 */
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
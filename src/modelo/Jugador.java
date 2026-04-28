package modelo;
import java.time.LocalDate;

/**
 * Clase que representa un jugador de la liga.
 */
public class Jugador extends Trabajador {
    
   
    /**
     * Posicion en la que juega el jugador.
     */
    private Posicion posicion;
    /**
     * Indica si el jugador ha solicitado el traspaso.
     */
    private EstadoTraspaso estadoTraspaso;
    /**
     * contador total de objetos creados.
     */

    private static int totalJugadores = 0;

    /**
     * contructor de la clase jugador.
     * El atributo traspaso solicitado siempre se inicializa a false .
     * 
     * @param Nombre          de la camiseta del jugador.
     * @param fechaNacimiento Feche de nacimiento del jugador.
     * @param posicion        Posicion del jugador.
     */
    public Jugador(String nombre, LocalDate fechaNacimiento, Equipo equipo, Posicion posicion) {
        super(nombre, fechaNacimiento, equipo);
        this.posicion = posicion;
        this.estadoTraspaso = EstadoTraspaso.SIN_SOLICITAR;
        totalJugadores++;

    }

    /**
     * Total de jugadores instanciado.
     * 
     * @return total de jugadores creadas.
     */

    public static int getTotalJugadores() {
        return totalJugadores;
    }

    
    /**
     * Devuelve la posicion del jugador.
     * 
     * @return posicion del jugador
     */
    public Posicion getPosicion() {
        return posicion;
    }

    /**
     * Nueva posicion del jugador.
     * 
     * @param posicion
     */

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    /**
     * true para solicitar, false para cancelar.
     * 
     * @param traspasoSolicitado
     */
    public void setEstadoTraspaso(EstadoTraspaso estadoTraspaso) {
        this.estadoTraspaso = estadoTraspaso;
    }

    /**
     * true si el traspaso esta solicitado.
     * 
     * @return true si ha solicitado traspaso, false en caso contrario.
     */
    public EstadoTraspaso getEstadoTraspaso() {
        return estadoTraspaso;
    }

    /**
     * Solicita el traspaso del jugador.
     */
    public void solicitarTraspaso() {
        this.estadoTraspaso = EstadoTraspaso.SOLICITADO;
        System.out.println("El jugador " + nombre + " ha solicitado el traspaso.");
    }

    /**
     * Cancela la solicitud de traspaso del jugador.
     */
    public void cancelarTraspaso() {
        this.estadoTraspaso = EstadoTraspaso.SIN_SOLICITAR;
        System.out.println("El jugador " + nombre + " ha cancelado la solicitud de traspaso.");
    }

    /**
     * devuelve una representacion legible de los del jugador.
     * 
     * @return cadena con la informacion del jugador.
     */

    @Override
    public String toString() {
        return "Jugador: " + nombre +
                " | Posicion: " + posicion +
                " | Nacimiento: " + fechaNacimiento +
                " | Traspaso: " + estadoTraspaso;

    }

}

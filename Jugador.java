import java.time.LocalDate;
/**
 * Clase que representa un jugador de la liga.
 */
public class Jugador {
    /**
     * Nombre del jugador
     */
    private String nombre;
    private LocalDate fechaNacimiento;
    private String posicion;
    private boolean traspasoSolicitado;

    private static int totalJugadores = 0;
    
     /**
      * contructor de la clase jugador. 
      * El atributo traspaso solicitado siempre se inicializa a false . 
      * 
      * @param Nombre de la camiseta del jugador. 
      * @param fechaNacimiento Feche de nacimiento del jugador. 
      * @param posicion Posicion del jugador. 
      */   
public Jugador(String nombre, LocalDate fechaNacimiento, String posicion) {

    this.nombre = nombre;
    this.fechaNacimiento = fechaNacimiento;
    this.posicion = posicion; 
    this.traspasoSolicitado = false;
    totalJugadores++;

    }
  /**
   * Total de jugadores instanciado.
   * @return
   */  

public static int getTotalJugadores() {
    return totalJugadores;
}
/**
 * nommbre del jugador
 * @return 
 */

public String getNombre() {
    return nombre;
}
/**
 * Nombre nuevo del jugador.
 * @param nombre
 */
public void setNombre(String nombre) {
    this.nombre = nombre;
}
/**
 * Fecha de nacimiento del jugador.
 * @return
 */
public LocalDate getFechaNacimiento() {
    return fechaNacimiento;
}
/**
 * Nueva fechaNacimiento.
 * @param fechaNacimiento
 */
public void setFechaNcimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
}
/**
 * Devuelve la posicion del jugador.
 * @return posicion del jugador
 */
public String getPosicion() {
    return posicion;
}
/**
 * Nueva posicion del jugador.
 * @param posicion
 */

public void setPosicion(String posicion) {
    this.posicion = posicion;
}
/**
 * true para solicitar, false para cancelar.
 * @param traspasoSolicitado
 */
public void setTraspasoSolicitado(boolean traspasoSolicitado){
    this.traspasoSolicitado = traspasoSolicitado;
}
/**
 * true si el traspaso esta solicitado.
 * @return
 */
public boolean isTraspasoSolicitado() {
    return traspasoSolicitado;
}
/**
 * Solicita el traspaso del jugador.
 */
public void solicitarTraspaso() {
    this.traspasoSolicitado = true;
    System.out.println("El jugador " + nombre + " ha solicitado el traspaso.");
}
/**
 * Cancela la solicitud de traspaso del jugador.
 */
public void cancelarTraspaso() {
    this.traspasoSolicitado = false;
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
           " | Traspaso: " + traspasoSolicitado;
        
}


}

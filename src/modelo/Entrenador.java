package modelo;

import java.time.LocalDate;

/**
 * Clase que representa un entrenador de un equipo.
 */
public class Entrenador extends Trabajador implements GestorTraspasos {

    /**
     * Formacion preferida del entrenador.
     */
    private Formacion formacionPreferida;
    /**
     * Contador total de objetos de entrenador creados.
     */

    private static int totalEntrenadores = 0;
   
/***
 * Constructor de la clase entrenador.
 * 
 * @param nombre Nombre del entrenador.
 * @param formacionPreferida Formacion preferida del entrenador.
 */

public Entrenador(String nombre, LocalDate fechaNacimiento, String equipo, Formacion formacionPreferida) {
    super(nombre, fechaNacimiento, equipo);
    this.formacionPreferida = formacionPreferida;
     totalEntrenadores++;

}
/**
 * Total del entrenador instanciado.
 * @return total de entrenadores creadas.
 */
public static int getTotalEntrenadores() {
    return totalEntrenadores;
}
/**
 * Devuelve el nombre del entrenador.
 * @return nombre del entrenador
 */
public String getNombre() {
    return nombre;
}
/**
 * Modifica el nombre del entrenador.
 * @param nombre del entrenador
 */
public void setNombre(String nombre) {
    this.nombre = nombre;
}
/**
 * Devuelve la formacion preferida del entrenador.
 * @return Formacion Preferida
 */
public Formacion getFormacionPreferida() {
    return formacionPreferida;
}
/**
 * Modifica la formacion preferida del entrenador.
 * @param formacionPreferida
 */
public void setFormacionPreferida(Formacion formacionPreferida) {
    this.formacionPreferida = formacionPreferida;
}


/**
 * Devuelve una representacion legible de los datos del entrenador.
 * 
 * @return cadena con la informacion del entrenador.
 * 
 */

@Override
public String toString() {
    return "Entrenador: " + nombre +
           " | formacionPreferida: " + formacionPreferida;
           
}

@Override 
public void aprobarTraspaso(Jugador j){
    if (mismoEquipo(j) && j.getEstadoTraspaso() == EstadoTraspaso.SOLICITADO){
        j.setEstadoTraspaso(EstadoTraspaso.APROBADO_POR_ENTRENADOR);
        System.err.println("Entrenador aprueba el traspaso de " + j.getNombre());
    }
}

@Override
public void rechazarTraspaso(Jugador j) {
    if (mismoEquipo(j) && j.getEstadoTraspaso() == EstadoTraspaso.SOLICITADO){
        j.setEstadoTraspaso(EstadoTraspaso.RECHAZADO);
        System.out.println("Entrenador rechaza el traspaso de " + j.getNombre());
    }
}




}

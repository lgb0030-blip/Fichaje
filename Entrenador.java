
/**
 * Clase que representa un entrenador de un equipo.
 */
public class Entrenador {
/**
 * Nombre del entrenador.
 */
    private String nombre;
    /**
     * Formacion preferida del entrenador.
     */
    private String formacionPreferida;
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

public Entrenador(String nombre, String formacionPreferida) {
    this.nombre = nombre;
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
public String getFormacionPreferida() {
    return formacionPreferida;
}
/**
 * Modifica la formacion preferida del entrenador.
 * @param formacionPreferida
 */
public void setFormacionPreferida(String formacionPreferida) {
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




}

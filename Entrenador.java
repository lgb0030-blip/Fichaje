public class Entrenador {

    private String nombre;
    private String formacionPreferida;

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

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getFormacionPreferida() {
    return formacionPreferida;
}

public void setFormacionPreferida(String formacionPreferida) {
    this.formacionPreferida = formacionPreferida;
}

public static int getTotalEntrenadores() {
    return totalEntrenadores;
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

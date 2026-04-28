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
     * @param nombre             Nombre del entrenador.
     * @param formacionPreferida Formacion preferida del entrenador.
     */

    public Entrenador(String nombre, LocalDate fechaNacimiento, Equipo equipo, Formacion formacionPreferida) {
        super(nombre, fechaNacimiento, equipo);
        this.formacionPreferida = formacionPreferida;
        totalEntrenadores++;

    }

    /**
     * Total del entrenador instanciado.
     * 
     * @return total de entrenadores creadas.
     */
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

    @Override
    public void aprobarTraspaso(Jugador j) {
        if (mismoEquipo(j) && j.getEstadoTraspaso() == EstadoTraspaso.SOLICITADO) {
            j.setEstadoTraspaso(EstadoTraspaso.APROBADO_POR_ENTRENADOR);
            System.out.println("Entrenador aprueba el traspaso de " + j.getNombre());
        } else {

            System.out.println("No se puede aprobar el traspaso de " + j.getNombre());

        }
    }

    @Override
    public void rechazarTraspaso(Jugador j) {
        if (mismoEquipo(j) && j.getEstadoTraspaso() == EstadoTraspaso.SOLICITADO) {
            j.setEstadoTraspaso(EstadoTraspaso.RECHAZADO);
            System.out.println("Entrenador rechaza el traspaso de " + j.getNombre());
        }
    }

}

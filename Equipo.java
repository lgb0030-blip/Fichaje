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
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Equipo: " + nombre;
    }
}
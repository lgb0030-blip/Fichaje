import java.util.ArrayList;

public class Equipo {
    private String nombre;

    private static totalEquipo = 0;

/**
 * constructoer de la clase Equipo.
 * El entrenador se inicializa a null y la lista de jugadoes vacia.
 * 
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


}

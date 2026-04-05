import java.time.LocalDate;

public class Jugador {
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

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public LocalDate getFechaNacimiento() {
    return fechaNacimiento;
}

public void setFechaNcimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
}

public String getPosicion() {
    return posicion;
}

public void setPosicion(String posicion) {
    this.posicion = posicion;
}

public void setTraspasoSolicitado(boolean traspasoSolicitado){
    this.traspasoSolicitado = traspasoSolicitado;
}

public boolean isTraspasoSolicitado() {
    return traspasoSolicitado;
}

public void solicitarTraspaso() {
    this.traspasoSolicitado = true;
    System.out.println("El jugador " + nombre + " ha solicitado el traspaso.");
}

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

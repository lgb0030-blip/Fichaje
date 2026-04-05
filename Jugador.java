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

}

}

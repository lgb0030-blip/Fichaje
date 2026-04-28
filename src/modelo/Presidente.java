package modelo;

import java.time.LocalDate;

public class Presidente extends Trabajador implements GestorTraspasos {
    public Presidente(String nombre, LocalDate fechaNacimiento, Equipo equipo) {
        super(nombre, fechaNacimiento, equipo);
    }

    @Override
    public void aprobarTraspaso(Jugador j) {
        if (mismoEquipo(j) && j.getEstadoTraspaso() == EstadoTraspaso.APROBADO_POR_ENTRENADOR) {
            j.setEstadoTraspaso(EstadoTraspaso.APROBADO_POR_PRESIDENTE);
            System.out.println("Presidente aprueba el traspaso de " + j.getNombre());
        } else{

            System.out.println("No se puede aprobar el traspaso de " + j.getNombre());
            
        }
    }

    @Override
    public void rechazarTraspaso(Jugador j) {
        if (mismoEquipo(j) && j.getEstadoTraspaso() == EstadoTraspaso.APROBADO_POR_ENTRENADOR) {
            j.setEstadoTraspaso(EstadoTraspaso.RECHAZADO);
            System.out.println("Presidente rechaza el traspaso de " + j.getNombre());
        }
    }
}

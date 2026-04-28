package modelo;
import java.time.LocalDate;

public abstract class Trabajador{
    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected String equipo;

    public Trabajador(String nombre, LocalDate fechaNacimiento, String equipo){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.equipo = equipo;

    }

    public boolean mismoEquipo(Trabajador t){
        return this.equipo.equals(t.equipo);
    }
    
}

package modelo;
import java.time.LocalDate;

public abstract class Trabajador{
    protected String nombre;
    protected LocalDate fechaNacimiento;
    ////////////////////////
    protected Equipo equipo;

    public Trabajador(String nombre, LocalDate fechaNacimiento, Equipo equipo){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.equipo = equipo;

    }

     //gettter y sdetter

    public boolean mismoEquipo(Trabajador t){
        return this.equipo.getNombre().equals(t.equipo.getNombre());
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

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    

    
    
}

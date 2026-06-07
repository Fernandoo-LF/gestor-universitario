import java.time.LocalDate;
import java.time.Period;

public class Persona {

    // ATRIBUTOS
    private String nombre;
    private LocalDate fechaNacimiento;
    private String direccion;

    // CONSTRUCTOR
    public Persona(String nombre, LocalDate fechaNacimiento, String direccion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    // GETTERS Y SETTERS

    // Getter y Setter de nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter de fechaNacimiento
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getter y Setter de direccion
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // METODOS DEL UML

    // Actualiza la dirección de la persona
    public void actualizarDireccion(String nuevaDir) {
        this.direccion = nuevaDir;
    }

    // Calcula y devuelve la edad de la persona
    public int obtenerEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    // Determina si la persona tiene 60 años o más
    public boolean esAdultoMayor() {
        return obtenerEdad() >= 60;
    }

}

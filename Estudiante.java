import java.time.LocalDate;

public class Estudiante extends Persona {

    // ATRIBUTO
    private String matricula;
    private double promedio;
    private LocalDate fechaIngreso;

    // CONSTRUCTOR

    public Estudiante(String nombre,
                      LocalDate fechaNacimiento,
                      String direccion,
                      String matricula,
                      double promedio,
                      LocalDate fechaIngreso) {

        super(nombre, fechaNacimiento, direccion);

        this.matricula = matricula;
        this.promedio = promedio;
        this.fechaIngreso = fechaIngreso;
    }


    // GETTERS Y SETTERS

    // Getter y Setter de matricula
    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Getter y Setter de promedio
    public double getPromedio() {
        return this.promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    // Getter y Setter de fechaIngreso
    public LocalDate getFechaIngreso() {
        return this.fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }


    // METODOS DEL UML

    // Inscribe al estudiante en una materia
    public void inscribirMateria(String materia) {
        System.out.println("El estudiante " +
                           getNombre() +
                           " se inscribio a la materia: " +
                           materia);
    }

    // Calcula el monto de beca
    public double calcularBeca() {

        if (promedio >= 9.0) {
            return 3000;
        }

        else if (promedio >= 8.0) {
            return 2000;
        }

        else {
            return 1000;
        }
    }

    //TOSTRING
    @Override
    public String toString() {
        return "Nombre: " + getNombre() +
               "\nFecha de nacimiento: " + getFechaNacimiento() +
               "\nDireccion: " + getDireccion() +
               "\nMatricula: " + matricula +
               "\nPromedio: " + promedio +
               "\nFecha de ingreso: " + fechaIngreso;
    }

}

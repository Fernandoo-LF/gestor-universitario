import java.time.LocalDate;
import java.time.Period;

public class Trabajador extends Persona {

    // ATRIBUTOS

       private LocalDate fechaIngreso;
    private double salario;
    private String puesto;

       // CONSTRUCTOR
   
    public Trabajador(String nombre,
                      LocalDate fechaNacimiento,
                      String direccion,
                      LocalDate fechaIngreso,
                      double salario,
                      String puesto) {

        super(nombre, fechaNacimiento, direccion);

        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
        this.puesto = puesto;
    }

        // GETTERS Y SETTERS
   
    // Getter y Setter de fechaIngreso
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    // Getter y Setter de salario
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Getter y Setter de puesto
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

     // METODOS DEL UML
  
    // Calcula los años que lleva trabajando
    public int calcularAntiguedad() {
        return Period.between(fechaIngreso, LocalDate.now()).getYears();
    }

    // Simula una solicitud de vacaciones
    public void solicitarVacaciones() {
        System.out.println(getNombre() + " ha solicitado vacaciones.");
    }

}

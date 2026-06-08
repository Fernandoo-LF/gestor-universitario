import java.time.LocalDate;

public class PDI extends Trabajador {

    // ATRIBUTOS

    private String categoria;
    private String especialidad;
    private int horasDocencia;


    // CONSTRUCTOR

    public PDI(String nombre,
               LocalDate fechaNacimiento,
               String direccion,
               LocalDate fechaIngreso,
               double salario,
               String puesto,
               String categoria,
               String especialidad,
               int horasDocencia) {

        super(nombre, fechaNacimiento, direccion,
              fechaIngreso, salario, puesto);

        this.categoria = categoria;
        this.especialidad = especialidad;
        this.horasDocencia = horasDocencia;
    }


    // GETTERS Y SETTERS

    // Getter y Setter de categoria
    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Getter y Setter de especialidad
    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Getter y Setter de horasDocencia
    public int getHorasDocencia() {
        return this.horasDocencia;
    }

    public void setHorasDocencia(int horasDocencia) {
        this.horasDocencia = horasDocencia;
    }

    // METODOS DEL UML

    // Realiza una investigacion sobre un tema
    public void investigar(String tema) {
        System.out.println(getNombre() +
                           " esta investigando sobre: " + tema);
    }

    // Imparte una clase
    public void impartirClase() {
        System.out.println(getNombre() +
                           " impartio una clase de " +
                           horasDocencia + " horas.");
    }

    //TOSTRING
    @Override
    public String toString() {
        return "Nombre: " + getNombre() +
               "\nFecha de nacimiento: " + getFechaNacimiento() +
               "\nDireccion: " + getDireccion() +
               "\nFecha de ingreso: " + getFechaIngreso() +
               "\nSalario: " + getSalario() +
               "\nPuesto: " + getPuesto() +
               "\nCategoria: " + categoria +
               "\nEspecialidad: " + especialidad +
               "\nHoras de docencia: " + horasDocencia;
    }

}

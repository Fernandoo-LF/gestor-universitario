import java.time.LocalDate;

public class EstudianteGrado extends Estudiante {

    // ATRIBUTOS

    private String titulacion;
    private int creditos;
    private boolean servicioSocial;

    // CONSTRUCTOR

    public EstudianteGrado(String nombre,
                           LocalDate fechaNacimiento,
                           String direccion,
                           String matricula,
                           double promedio,
                           LocalDate fechaIngreso,
                           String titulacion,
                           int creditos,
                           boolean servicioSocial) {

        super(nombre, fechaNacimiento, direccion,
              matricula, promedio, fechaIngreso);

        this.titulacion = titulacion;
        this.creditos = creditos;
        this.servicioSocial = servicioSocial;
    }


    // GETTERS Y SETTERS

    // Getter y Setter de titulacion
    public String getTitulacion() {
        return this.titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    // Getter y Setter de creditos
    public int getCreditos() {
        return this.creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    // Getter y Setter de servicioSocial
    public boolean getServicioSocial() {
        return this.servicioSocial;
    }

    public void setServicioSocial(boolean servicioSocial) {
        this.servicioSocial = servicioSocial;
    }

    // METODOS DEL UML

    // Simula la realizacion de un proyecto academico
    public void realizarProyecto() {

        System.out.println("El estudiante " +
                           getNombre() +
                           " esta realizando su proyecto de titulacion mediante: "
                           + titulacion);
    }

    // Verifica si puede solicitar la titulacion
    public void solicitarTitulacion() {

        if (servicioSocial && creditos >= 300) {

            System.out.println("El estudiante " +
                               getNombre() +
                               " puede iniciar el tramite de titulacion.");
        }

        else {

            System.out.println("El estudiante " +
                               getNombre() +
                               " aun no cumple los requisitos para titularse.");

            if (!servicioSocial) {
                System.out.println("Falta completar el servicio social.");
            }

            if (creditos < 300) {
                System.out.println("Faltan creditos para titularse.");
            }
        }
    }

}

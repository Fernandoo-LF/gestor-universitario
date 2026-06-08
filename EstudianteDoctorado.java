import java.time.LocalDate;

public class EstudianteDoctorado extends Estudiante {

    // ATRIBUTOS

    private String programa;
    private String temaTesis;
    private String directorTesis;


    // CONSTRUCTOR

    public EstudianteDoctorado(String nombre,
                               LocalDate fechaNacimiento,
                               String direccion,
                               String matricula,
                               double promedio,
                               LocalDate fechaIngreso,
                               String programa,
                               String temaTesis,
                               String directorTesis) {

        super(nombre, fechaNacimiento, direccion,
              matricula, promedio, fechaIngreso);

        this.programa = programa;
        this.temaTesis = temaTesis;
        this.directorTesis = directorTesis;
    }


    // GETTERS Y SETTER

    // Getter y Setter de programa
    public String getPrograma() {
        return this.programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    // Getter y Setter de temaTesis
    public String getTemaTesis() {
        return this.temaTesis;
    }

    public void setTemaTesis(String temaTesis) {
        this.temaTesis = temaTesis;
    }

    // Getter y Setter de directorTesis
    public String getDirectorTesis() {
        return this.directorTesis;
    }

    public void setDirectorTesis(String directorTesis) {
        this.directorTesis = directorTesis;
    }

    // METODOS DEL UML

    // Simula el desarrollo de la tesis doctoral
    public void realizarTesis() {

        System.out.println("El estudiante " + getNombre());
        System.out.println("continua trabajando en su tesis.");
        System.out.println("Tema: " + temaTesis);
        System.out.println("Director: " + directorTesis);
    }

    // Simula la publicacion de un articulo cientifico
    public void publicarArticulo() {

        System.out.println("El estudiante " + getNombre());
        System.out.println("ha publicado un articulo relacionado con:");
        System.out.println("Programa: " + programa);
        System.out.println("Tema de investigacion: " + temaTesis);
    }

}

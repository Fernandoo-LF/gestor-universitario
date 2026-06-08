import java.time.LocalDate;

public class PAS extends Trabajador {

    // ATRIBUTOS

    private String area;
    private int nivel;
    private String turno;


    // CONSTRUCTOR

    public PAS(String nombre,
               LocalDate fechaNacimiento,
               String direccion,
               LocalDate fechaIngreso,
               double salario,
               String puesto,
               String area,
               int nivel,
               String turno) {

        super(nombre, fechaNacimiento, direccion,
              fechaIngreso, salario, puesto);

        this.area = area;
        this.nivel = nivel;
        this.turno = turno;
    }


    // GETTERS Y SETTERS

    // Getter y Setter de area
    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    // Getter y Setter de nivel
    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    // Getter y Setter de turno
    public String getTurno() {
        return this.turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }


    // METODOS DEL UML

    // Administra los recursos del area
    public void administrarRecursos() {
        System.out.println("Administrando recursos del area: " + area);
    }

    // Genera un reporte del personal
    public void generarReporte() {
        System.out.println("Generando reporte del personal del area: " + area);
    }

}

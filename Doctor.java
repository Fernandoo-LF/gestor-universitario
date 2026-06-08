public class Doctor {

    // ATRIBUTOS

    private String especialidad;
    private String universidad;
    private int anioObtencion;


    // CONSTRUCTOR
    public Doctor(String especialidad,
                  String universidad,
                  int anioObtencion) {

        this.especialidad = especialidad;
        this.universidad = universidad;
        this.anioObtencion = anioObtencion;
    }

    // GETTERS Y SETTERS

    // Getter y Setter de especialidad
    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Getter y Setter de universidad
    public String getUniversidad() {
        return this.universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    // Getter y Setter de anioObtencion
    public int getAnioObtencion() {
        return this.anioObtencion;
    }

    public void setAnioObtencion(int anioObtencion) {
        this.anioObtencion = anioObtencion;
    }

    // METODOS DEL UML

    // Valida la informacion del titulo
    public void validarTitulo() {

        if (anioObtencion > 0) {
            System.out.println("Titulo validado correctamente.");
        } else {
            System.out.println("Titulo no valido.");
        }
    }

    // Registra el titulo de doctorado
    public void registrarTitulo() {

        System.out.println("Titulo registrado.");
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Universidad: " + universidad);
        System.out.println("Anio de obtencion: " + anioObtencion);
    }

}

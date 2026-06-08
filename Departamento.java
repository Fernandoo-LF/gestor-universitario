public class Departamento {

    // ATRIBUTOS

    private String nombre;
    private String codigo;
    private String ubicacion;

    // ARREGLO DE OBJETOS

    private PDI[] profesores;

    // CONSTRUCTOR

    public Departamento(String nombre,
                        String codigo,
                        String ubicacion) {

        this.nombre = nombre;
        this.codigo = codigo;
        this.ubicacion = ubicacion;

        profesores = new PDI[10];
    }

    // GETTERS Y SETTERS

    // Getter y Setter de nombre
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter de codigo
    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Getter y Setter de ubicacion
    public String getUbicacion() {
        return this.ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // METODOS DEL UML

    // Asigna un profesor al departamento
    public void asignarProfesor(PDI profesor) {

        for (int i = 0; i < profesores.length; i++) {

            if (profesores[i] == null) {

                profesores[i] = profesor;

                System.out.println("Profesor asignado correctamente.");
                return;
            }
        }

        System.out.println("No hay espacio para mas profesores.");
    }


    // Muestra el personal del departamento
    public void listarPersonal() {

        System.out.println("Personal del departamento: " + nombre);

        for (int i = 0; i < profesores.length; i++) {

            if (profesores[i] != null) {

                System.out.println(
                    profesores[i].getNombre()
                );
            }
        }
    }

    // METODO TOSTRING

    @Override
    public String toString() {

        return "Nombre: " + nombre +
               "\nCodigo: " + codigo +
               "\nUbicacion: " + ubicacion;
    }

}

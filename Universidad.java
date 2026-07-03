public class Universidad {

    // ATRIBUTOS

    private String nombre;
    private String ciudad;
    private int fundacion;

    // ARREGLOS DE OBJETOS

    private Estudiante[] estudiantes;
    private Trabajador[] trabajadores;
    private Departamento[] departamentos;

    // CONSTRUCTOR

    public Universidad(String nombre,
            String ciudad,
            int fundacion) {

        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fundacion = fundacion;

        estudiantes = new Estudiante[50];
        trabajadores = new Trabajador[50];
        departamentos = new Departamento[20];
    }

    // GETTERS Y SETTERS

    // Getter y Setter de nombre
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter de ciudad
    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    // Getter y Setter de fundacion
    public int getFundacion() {
        return this.fundacion;
    }

    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }

    // METODOS DEL UML

    // Registra un estudiante
    public void registrarEstudiante(Estudiante estudiante) {

        for (int i = 0; i < estudiantes.length; i++) {

            if (estudiantes[i] == null) {

                estudiantes[i] = estudiante;

                System.out.println("Estudiante registrado correctamente.");
                return;
            }
        }

        System.out.println("No hay espacio para mas estudiantes.");
    }

    // Contrata un trabajador
    public void contratarTrabajador(Trabajador trabajador) {

        for (int i = 0; i < trabajadores.length; i++) {

            if (trabajadores[i] == null) {

                trabajadores[i] = trabajador;

                System.out.println("Trabajador contratado correctamente.");
                return;
            }
        }

        System.out.println("No hay espacio para mas trabajadores.");
    }

    // Agrega un departamento
    public void agregarDepartamento(Departamento departamento) {

        for (int i = 0; i < departamentos.length; i++) {

            if (departamentos[i] == null) {

                departamentos[i] = departamento;

                System.out.println("Departamento agregado correctamente.");
                return;
            }
        }

        System.out.println("No hay espacio para mas departamentos.");
    }

    // Busca un estudiante por nombre usando recursion
    public int buscarEstudianteRecursivo(String nombreEstudiante) {
        return buscarEstudianteRecursivo(nombreEstudiante, 0);
    }

    // Metodo auxiliar recursivo para estudiantes
    private int buscarEstudianteRecursivo(String nombreEstudiante, int posicion) {

        if (posicion >= estudiantes.length) {
            return -1;
        }

        if (estudiantes[posicion] != null &&
                estudiantes[posicion].getNombre().equalsIgnoreCase(nombreEstudiante)) {
            return posicion;
        }

        return buscarEstudianteRecursivo(nombreEstudiante, posicion + 1);
    }

    // Busca un trabajador por nombre usando recursion
    public int buscarTrabajadorRecursivo(String nombreTrabajador) {
        return buscarTrabajadorRecursivo(nombreTrabajador, 0);
    }

    // Metodo auxiliar recursivo para trabajadores
    private int buscarTrabajadorRecursivo(String nombreTrabajador, int posicion) {

        if (posicion >= trabajadores.length) {
            return -1;
        }

        if (trabajadores[posicion] != null &&
                trabajadores[posicion].getNombre().equalsIgnoreCase(nombreTrabajador)) {
            return posicion;
        }

        return buscarTrabajadorRecursivo(nombreTrabajador, posicion + 1);
    }

    // Busca un departamento por nombre usando recursion
    public int buscarDepartamentoRecursivo(String nombreDepartamento) {
        return buscarDepartamentoRecursivo(nombreDepartamento, 0);
    }

    // Metodo auxiliar recursivo para departamentos
    private int buscarDepartamentoRecursivo(String nombreDepartamento, int posicion) {

        if (posicion >= departamentos.length) {
            return -1;
        }

        if (departamentos[posicion] != null &&
                departamentos[posicion].getNombre().equalsIgnoreCase(nombreDepartamento)) {
            return posicion;
        }

        return buscarDepartamentoRecursivo(nombreDepartamento, posicion + 1);
    }

    // METODO TOSTRING

    @Override
    public String toString() {

        return "Nombre: " + nombre +
                "\nCiudad: " + ciudad +
                "\nFundacion: " + fundacion;
    }

}

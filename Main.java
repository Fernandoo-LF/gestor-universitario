import java.time.LocalDate;

public class Main {

        public static void main(String[] args) {

                // UNIVERSIDAD

                Universidad uni = new Universidad(
                                "Universidad Nacional",
                                "Ciudad de Mexico",
                                1950);

                System.out.println(uni);

                // PAS

                PAS pas = new PAS(
                                "Juan Perez",
                                LocalDate.of(1980, 5, 10),
                                "CDMX",
                                LocalDate.of(2010, 3, 15),
                                15000,
                                "Administrador",
                                "Recursos Humanos",
                                2,
                                "Matutino");

                pas.administrarRecursos();
                pas.generarReporte();

                // PDI

                PDI profesor = new PDI(
                                "Maria Lopez",
                                LocalDate.of(1975, 8, 20),
                                "CDMX",
                                LocalDate.of(2005, 2, 10),
                                25000,
                                "Profesor",
                                "Titular",
                                "Programacion",
                                20);

                profesor.investigar("Inteligencia Artificial");
                profesor.impartirClase();

                // ESTUDIANTE

                Estudiante estudiante = new Estudiante(
                                "Carlos Ruiz",
                                LocalDate.of(2003, 4, 12),
                                "Toluca",
                                "A12345",
                                9.2,
                                LocalDate.of(2022, 8, 1));

                estudiante.inscribirMateria("Programacion Orientada a Objetos");

                System.out.println(
                                "Beca: $" + estudiante.calcularBeca());

                // ESTUDIANTE GRADO

                EstudianteGrado eg = new EstudianteGrado(
                                "Ana Torres",
                                LocalDate.of(2002, 6, 15),
                                "Puebla",
                                "G123",
                                8.8,
                                LocalDate.of(2021, 8, 1),
                                "Tesis",
                                320,
                                true);

                eg.realizarProyecto();
                eg.solicitarTitulacion();

                // ESTUDIANTE DOCTORADO

                EstudianteDoctorado ed = new EstudianteDoctorado(
                                "Luis Gomez",
                                LocalDate.of(1995, 3, 10),
                                "Monterrey",
                                "D001",
                                9.5,
                                LocalDate.of(2024, 1, 15),
                                "Doctorado en Computacion",
                                "Machine Learning",
                                "Dra. Martinez");

                ed.realizarTesis();
                ed.publicarArticulo();

                // DOCTOR
                Doctor doctor = new Doctor(
                                "Ciencias Computacionales",
                                "UNAM",
                                2018);

                doctor.validarTitulo();
                doctor.registrarTitulo();

                // DEPARTAMENTO
                Departamento dep = new Departamento(
                                "Computacion",
                                "COMP01",
                                "Edificio A");

                dep.asignarProfesor(profesor);
                dep.listarPersonal();

                // UNIVERSIDAD

                uni.registrarEstudiante(estudiante);
                uni.registrarEstudiante(eg);
                uni.registrarEstudiante(ed);

                uni.contratarTrabajador(pas);
                uni.contratarTrabajador(profesor);

                uni.agregarDepartamento(dep);

                // PRUEBAS DE BUSQUEDA RECURSIVA

                System.out.println("\n PRUEBAS DE BUSQUEDA RECURSIVA");

                System.out.println(
                                "Posicion del profesor Maria Lopez en Departamento: " +
                                                dep.buscarProfesorRecursivo("Maria Lopez"));

                System.out.println(
                                "Posicion del estudiante Carlos Ruiz en Universidad: " +
                                                uni.buscarEstudianteRecursivo("Carlos Ruiz"));

                System.out.println(
                                "Posicion del trabajador Juan Perez en Universidad: " +
                                                uni.buscarTrabajadorRecursivo("Juan Perez"));

                System.out.println(
                                "Posicion del departamento Computacion en Universidad: " +
                                                uni.buscarDepartamentoRecursivo("Computacion"));

                System.out.println(
                                "Busqueda de estudiante inexistente: " +
                                                uni.buscarEstudianteRecursivo("Alumno Falso"));

        }
}

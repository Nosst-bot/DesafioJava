package DesafioGrupo6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opciones;

        System.out.println("Hola, bienvenido. Define una opción");
        System.out.println("\nOpción 1 para estudiante.");
        System.out.println("\nOpción 2 para trabajador.");
        System.out.println("\nOpción 3 para salir.");
        opciones = scanner.nextInt();

        switch (opciones) {
            case 1 -> System.out.println(crearEstudiante());
            case 2 -> System.out.println(crearTrabajador());
            case 3 -> System.out.println("Nos vemos, hasta la próxima!");
        }
    }

    public static Estudiante crearEstudiante() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre del estudiante");
        String nombre = scanner.nextLine();

        System.out.println("Ingresa el apellido del estudiante");
        String apellido = scanner.nextLine();

        System.out.println("Ingresa la edad del estudiante");
        Integer edad = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingresa el rut del estudiante");
        String rut = scanner.nextLine();

        System.out.println("Ingresa la nacionalidad del estudiante");
        String nacionalidad = scanner.nextLine();

        System.out.println("Ingresa la altura del estudiante");
        Double altura = Double.parseDouble(scanner.nextLine());

        System.out.println("Ingresa el deporte del estudiante");
        String deporte = scanner.nextLine();

        System.out.println("Ingresa el curso del estudiante");
        String curso = scanner.nextLine();

        System.out.println("Ingresa el colegio del estudiante");
        String colegio = scanner.nextLine();


        Estudiante estudiante = new Estudiante(nombre, apellido, edad, rut, nacionalidad, altura, deporte, curso, colegio);
        return estudiante;
    }

    public static Trabajador crearTrabajador() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre del trabajador");
        String nombre = scanner.nextLine();

        System.out.println("Ingresa el apellido del trabajador");
        String apellido = scanner.nextLine();

        System.out.println("Ingresa la edad del trabajador");
        Integer edad = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingresa el rut del trabajador");
        String rut = scanner.nextLine();

        System.out.println("Ingresa la nacionalidad del trabajador");
        String nacionalidad = scanner.nextLine();

        System.out.println("Ingresa la altura del trabajador");
        Double altura = Double.parseDouble(scanner.nextLine());

        System.out.println("Ingresa el oficio del trabajador");
        String oficio = scanner.nextLine();

        System.out.println("Ingresa el sueldo del trabajador");
        String sueldo = scanner.nextLine();

        System.out.println("Ingresa el lugar de trabajo del trabajador");
        String lugarDeTrabajo = scanner.nextLine();


        Trabajador trabajador = new Trabajador(nombre, apellido, edad, rut, nacionalidad, altura, oficio, sueldo, lugarDeTrabajo);
        return trabajador;
    }
}

package DesafioGrupo6;

import java.util.Scanner;

public class Persona {
    //Atributos
    String nombre;
    String apellido;
    Integer edad;
    String rut;
    String nacionalidad;
    Double altura;

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", rut='" + rut + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", altura=" + altura +
                '}';
    }

    public Persona() {}
    public Persona(String nombre, String apellido, Integer edad, String rut, String nacionalidad, Double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.rut = rut;
        this.nacionalidad = nacionalidad;
        this.altura = altura;
    }

    //Métodos de la persona
    public void saludar(){
        System.out.println("Hola, una persona");
    }
    public void dormir(){
        System.out.println(nombre + " Está persona está durmiendo");
    }
    public void comer(){
        System.out.println("Esta persona está comiendo");
    }

    public static Persona crearPersonaDesdeScanner(){
        //Declaramos variables a utilizar
        Scanner scanner = new Scanner(System.in);
        int opciones;
        byte verificador;

        //Mostramos el menu y pedimos una opcion a registrar
        System.out.print("Hola, bienvenido. Define una opción\nOpción 1 para estudiante.\nOpción 2 para trabajador.\nOpción 3 para salir.\n>>");
        opciones = scanner.nextInt();
        scanner.nextLine();

        if (opciones == 1) {
            verificador = 1;
        } else if (opciones == 2) {
            verificador = 2;
        } else if (opciones == 3) {
            verificador = 3;
            System.out.println("Hasta pronto");
            //System.exit(0) es para que el programa se salga
            System.exit(0);
        } else {
            throw new IllegalArgumentException("Opcion no valida");
        }

        //Pedimos los datos al usuario mediante consola y guardamos cada en una variable del mismo tipo que requiera el constructor
        System.out.print("Ingresa el nombre: \n>>");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa el apellido: \n>>");
        String apellido = scanner.nextLine();
        System.out.print("Ingresa la edad: \n>>");
        Integer edad = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingresa el rut: \n>>");
        String rut = scanner.nextLine();
        System.out.print("Ingresa la nacionalidad: \n>>");
        String nacionalidad = scanner.nextLine();
        System.out.print("Ingresa la altura: \n>>");
        Double altura = Double.parseDouble(scanner.nextLine());

        //Aqui condicionamos y hacemos uso del menu mostrado al principio y creamos una instancia de Persona segun
        if (verificador == 1) {
            System.out.print("Ingrese el deporte: \n>>");
            String deporte = scanner.nextLine();
            System.out.print("Ingrese el curso: \n>>");
            String curso = scanner.nextLine();
            System.out.print("Ingrese el colegio: \n>>");
            String colegio = scanner.nextLine();
            return new Estudiante(nombre, apellido, edad, rut, nacionalidad, altura, deporte, curso, colegio);
        }
        if (verificador == 2) {
            System.out.print("Ingrese el oficio: \n>>");
            String oficio = scanner.nextLine();
            System.out.print("Ingrese el sueldo: \n>>");
            Double sueldo = Double.parseDouble(scanner.nextLine());
            System.out.print("Ingrese el lugar de trabajo: \n>>");
            String lugarDeTrabajo = scanner.nextLine();
            return new Trabajador(nombre, apellido, edad, rut, nacionalidad, altura, oficio, sueldo, lugarDeTrabajo);
        }

        //Esto es para evitar errores de compilacion, no se ejecutara nunca
        return null;
    }
}

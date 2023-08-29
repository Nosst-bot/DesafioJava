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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre");
        String nombre = scanner.nextLine();

        System.out.println("Ingresa el apellido");
        String apellido = scanner.nextLine();

        System.out.println("Ingresa la edad");
        Integer edad = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingresa el rut");
        String rut = scanner.nextLine();

        System.out.println("Ingresa la nacionalidad");
        String nacionalidad = scanner.nextLine();

        System.out.println("Ingresa la altura");
        Double altura = Double.parseDouble(scanner.nextLine());

        return new Persona(nombre, apellido, edad, rut, nacionalidad, altura);
    }
}

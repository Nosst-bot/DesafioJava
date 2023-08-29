package DesafioGrupo6;

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
}

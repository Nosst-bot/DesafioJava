package DesafioGrupo6;

public class Trabajador extends Persona{
    String oficio;
    Double sueldo;
    String lugarDeTrabajo;

    public Trabajador(String nombre, String apellido, Integer edad, String rut, String nacionalidad, Double altura, String oficio, Double sueldo, String lugarDeTrabajo) {
        super(nombre, apellido, edad, rut, nacionalidad, altura);
        this.oficio = oficio;
        this.sueldo = Double.valueOf(sueldo);
        this.lugarDeTrabajo = lugarDeTrabajo;
    }
    public Trabajador() {
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "oficio='" + oficio + '\'' +
                ", sueldo=" + sueldo +
                ", lugarDeTrabajo='" + lugarDeTrabajo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", rut='" + rut + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", altura=" + altura +
                '}';
    }

    //Sobre-escribir el método
    @Override
    public void saludar(){
        System.out.println("Hola soy un trabajador");
    }
    @Override
    public void dormir(){
        System.out.println("Este trabajador está durmiendo");
    }
    @Override
    public void comer(){
        System.out.println("Este trabajador está comiendo");
    }
}

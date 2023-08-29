package DesafioGrupo6;

public class Estudiante extends Persona{
    //Podemos colocar más atributos
    String deporte;
    String curso;
    String colegio;

    public Estudiante(String nombre, String apellido, Integer edad, String rut, String nacionalidad, Double altura, String deporte, String curso, String colegio) {
        super(nombre, apellido, edad, rut, nacionalidad, altura);
        this.deporte = deporte;
        this.curso = curso;
        this.colegio = colegio;
    }
    public Estudiante() {}

    @Override
    public String toString() {
        return "Estudiante{" +
                "deporte='" + deporte + '\'' +
                ", curso='" + curso + '\'' +
                ", colegio='" + colegio + '\'' +
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
        System.out.println("Hola soy un estudiante");
    }
    @Override
    public void dormir(){
        System.out.println("Este estudiante está durmiendo");
    }
    @Override
    public void comer(){
        System.out.println("Este estudiante está comiendo");
    }
}

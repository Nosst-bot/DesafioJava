package Tarea;
import java.util.HashMap;

public class Estudiante {
    //Atributos del estudiante
    String nombre;
    String apellido;
    Integer matricula;
    String curso;
    Double promedio;
    HashMap<String, Double> promedioMaterias;


    //Constructor vacío
    public Estudiante(){}
    //Constructor

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre=\"" + nombre + '\"' +
                ", apellido=\"" + apellido + '\"' +
                ", matricula=" + matricula +
                ", curso='" + curso + '\'' +
                ", promedio=" + promedio +
                ", promedioMaterias=" + promedioMaterias +
                '}';
    }

    public Estudiante(String nombre, String apellido, Integer matricula, String curso, Double promedio, HashMap<String, Double> promedioMaterias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.curso = curso;
        this.promedio = promedio;
        this.promedioMaterias = promedioMaterias;
    }

    //Método para ver si pasó de curso
    public boolean pasaCurso(double promedio) {
        if (promedio >= 4) {
            System.out.println("\n" + nombre + " " + apellido + ". Felicidades, aprobaste el curso con una calificación de " + promedio);
            return true;
        }else {
            System.out.println("\n" + nombre + " " + apellido + ". Lo siento, reprobaste el curso. Tu calificación fue de " + promedio + "\nBuena suerte para la próxima vez");
            return false;
        }
    }

    //Método para generar el promedio de materias con for-each
    public double calcularPromedio(HashMap <String, Double> promedioMaterias){
        double promedio = 0.0;
        double total = 0.0;
        for (double notas :promedioMaterias.values()) {
            //System.out.println(notas);
            total += notas;
        }
        promedio = total/promedioMaterias.size();
        return promedio;

    }
    
    public void listarPromedios(HashMap<String, Double> promedioMaterias) {
        for (String i :
                promedioMaterias.keySet()) {
            System.out.println("Asignatura: " + i + " Promedio: " + promedioMaterias.get(i));
        }
    }


}

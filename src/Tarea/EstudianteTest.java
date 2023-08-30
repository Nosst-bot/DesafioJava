package Tarea;

import java.util.HashMap;

public class EstudianteTest {
    public static void main(String[] args){
        HashMap <String, Double> promedioMaterias = new HashMap<>();
   promedioMaterias.put("Matemáticas ", 5.7);
        promedioMaterias.put("Lenguaje y Comunicación ", 4.0);
        promedioMaterias.put("Inglés ", 6.8);
        promedioMaterias.put("Historia ", 5.5);
        promedioMaterias.put("Filosofía ", 7.0);
        promedioMaterias.put("Ed. Fisica", 4.0);

//        //Plantear segundo HasMap para el otro estudiante
//
         Estudiante uno = new Estudiante("Angel", "Bombín", 2018, "4°Medio", 3.9, promedioMaterias);
//        double promedioEstudiante = uno.calcularPromedio(uno.promedioMaterias);
//        // Estudiante dos = new Estudiante("Matías", "Bombín", 2018, "4°Medio", 6.5, promedioMaterias);
//        // System.out.println(dos);
//
//        //System.out.println(dos.pasaCurso(dos.promedio));
//        System.out.println(uno.pasaCurso(promedioEstudiante));
//        uno.listarPromedios(uno.promedioMaterias);
        System.out.println(uno);
    }
}
//En este ejercicio aplicamos lo aprendido en HasMap creando métodos que nos entreguen el promdeio de las notas,
// Usamos el bucle For-each y también usamos atributos
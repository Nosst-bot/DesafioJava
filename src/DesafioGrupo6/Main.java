package DesafioGrupo6;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        ArrayList<Trabajador> listaTrabajadores = new ArrayList<>();

        Persona persona = Persona.crearPersonaDesdeScanner();

        if (persona instanceof Estudiante) {
            listaEstudiantes.add((Estudiante) persona);

        }
        if (persona instanceof Trabajador) {
            listaTrabajadores.add((Trabajador) persona);
        }

        for (Estudiante estudiante :
                listaEstudiantes) {
            System.out.println(estudiante);
        }

        for (Trabajador trabajador :
                listaTrabajadores) {
            System.out.println(trabajador);
        }
    }

}

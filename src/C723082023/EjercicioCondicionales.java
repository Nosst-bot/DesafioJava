package C723082023;

import java.util.Scanner;

public class EjercicioCondicionales {
    public static void main(String[] args) {
        //EJERCICIO
        /*
        *****Programa para ingresar notas de estudiantes******
        - Crear un menú para ingresar al programa
        - Pedir 3 notas al estudiante
                - Obtener el promedio
        - Según el resultado, imprimir:
        - Si obtuvo menos de 5 pts:  "Reprueba"
        - Si obtuvo 5 pts: "Aprobaste, pero debes seguir estudiando"
        - Si obtuvo más de 7: "Felicidades, sigue así"

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("******Programa para ingresar notas de estudiantes******");
        System.out.print("1 para ingresar al programa\n0 para salir\n>>");
        int opcion = scan.nextInt();
        scan.nextLine();
        if (opcion == 0) {
            System.out.println("Proceso terminado");
        }else if(opcion == 1){
            System.out.println("Bienvenido, porfavor ingrese 3 notas.");
            System.out.println("Nota 1: ");
            double nota1 = Double.parseDouble(scan.nextLine());

            System.out.println("Nota 2: ");
            double nota2 = Double.parseDouble(scan.nextLine());

            System.out.println("Nota 3: ");
            double nota3 = Double.parseDouble(scan.nextLine());

            double promedio = (nota1+nota2+nota3)/3;
            scan.close();

            System.out.println("Tu promedio es de: " + promedio);

            //Validacion del promedio
            if(promedio < 5) {
                System.out.println("Reprueba.");
            }else if(promedio < 7) {
                System.out.println("Aprobaste, pero debes seguir estudiando.");
            }else {
                System.out.println("Felicidades, sigue asi!");
            }

        } else {
            System.out.println("Numero no valido, ejecute el programa nuevamente.");
            System.out.println("Proceso terminado");
        }

    }
}

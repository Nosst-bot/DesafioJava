package C722082023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        **********************************
        Indique su nombre
        Indique su edad
        Indique la temperatura de hoy
        Indique su pelicula favorita
        **********************************

        *************************************
        Su nombre es: ________
        Tiene ______ años
        La temperatura de hoy es de ____ grados
        la mejor pelicula del mundo es: ________
        ****************************************
         */

        Scanner scan = new Scanner (System.in);

        System.out.println("***********************************************************");

        System.out.println("Indique su nombre: ");
        String nombre = scan.nextLine();

        System.out.println("Indique su edad: ");
        byte edad = Byte.parseByte(scan.nextLine());

        System.out.println("Indique la temperatura de hoy(use punto si desea ingresar decimal): ");
        double temperatura = Double.parseDouble(scan.nextLine());

        System.out.println("Indique su pelicula favorita: ");
        String pelicula = scan.nextLine();

        System.out.println("***********************************************************");
        scan.close();

        System.out.printf("Su nombre es: "+nombre+
                "\nTiene "+edad+" años"+
                "\nLa temperatura hoy es de " +temperatura+" grados" +
                "\nLa mejor pelicula del mundo es: "+pelicula+
                "\n");

//        System.out.println("Su nombre es: "+nombre);
//        System.out.println("Tiene "+edad+" años");
//        System.out.println("La temperatura de hoy es de "+temperatura+" grados");
//        System.out.println("La mejor pelicula del mundo es: "+pelicula);
//
        System.out.println("***********************************************************");

    }
}

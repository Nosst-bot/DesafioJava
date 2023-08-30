package C724082023;

import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = scan.next();

//        for (int i = 0; i < nombre.length(); i++) {
//            System.out.println(nombre.charAt(i));
//        }
        int i = 0;
        while(i < nombre.length()) {

            System.out.println(nombre.charAt(i));



            i++;
        }














    }
}

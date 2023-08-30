package C725082023;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {
        imprimirMenu();
    }



    static void imprimirMenu(){
        Scanner scan = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Hola, bienvenido al menu!\nPor favor elija una opcion");
            opcion = Integer.parseInt(scan.nextLine());
            switch (opcion) {
                case 0:
                    System.out.println("Hasta pronto!");
                    break;
                case 1:
                    System.out.println("Elegiste la suma");
                    break;
                case 2:
                    System.out.println("Elegiste la resta");
                    break;
                case 3:
                    System.out.println("Elegiste la multiplicacion");
                    break;
                case 4:
                    System.out.println("Elegiste la division");
                    break;
            }

        }while(opcion != 0);
    }
}

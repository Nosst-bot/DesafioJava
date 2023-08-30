package C724082023;

import C728082023.Calculadora;

import java.util.Scanner;

public class EjercicioCalculadora {
    public static void main(String[] args) {

        Calculadora calculadoraNueva = new Calculadora();

        System.out.println(calculadoraNueva);




    }


















    //Metodos
    static void calculadora(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido!!!");
        boolean isRunning = true;
        double resultado = 0.0;
        do {
            System.out.println("****************************************\n****************************************");
            System.out.println("Que operacion desea realizar?");
            System.out.print("1. Sumar\n2. Restar\n3. Multiplcar\n4. Dividir\n5. Elevar(Potencia)\n0. Salir\n>>");
            int operacion = Integer.parseInt(scan.nextLine());
            double num1 = 0.0;
            double num2 = 0.0;

            switch (operacion) {
                case 1:
                    System.out.print("**********Sumar**********\nIngresa el primer numero:\n>>");
                    num1 = Double.parseDouble(scan.nextLine());
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = Double.parseDouble(scan.nextLine());

                    resultado = suma(num1, num2);
                    System.out.println("El resultado es: " +resultado);
                    break;

                case 2:
                    System.out.print("**********Restar**********\nIngresa el primer numero:\n>>");
                    num1 = Double.parseDouble(scan.nextLine());
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = Double.parseDouble(scan.nextLine());

                    resultado = resta(num1, num2);
                    System.out.println("\nEl resultado es: " +resultado);
                    break;

                case 3:
                    System.out.print("**********Multiplicarr**********\nIngresa el primer numero:\n>>");
                    num1 = Double.parseDouble(scan.nextLine());
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = Double.parseDouble(scan.nextLine());

                    resultado = multiplicar(num1, num2);
                    System.out.println("El resultado es: " +resultado);
                    break;

                case 4:
                    System.out.print("**********Dividir**********\nIngresa el primer numero:\n>>");
                    num1 = Double.parseDouble(scan.nextLine());
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = Double.parseDouble(scan.nextLine());

                    resultado = dividir(num1, num2);
                    System.out.println("El resultado es: " +resultado);
                    break;

                case 5:
                    System.out.print("**********Elevar**********\nIngresa el primer numero:\n>>");
                    num1 = Double.parseDouble(scan.nextLine());
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = Double.parseDouble(scan.nextLine());

                    resultado = elevar(num1, num2);
                    System.out.println("El resultado es: " +resultado);
                    break;
                case 0:
                    System.out.println("Hasta pronto!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }while(isRunning);



        scan.close();
    }
    static int suma(int... numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }

    static double suma(double num1, double num2) {
        return num1 + num2;
    }

    static double resta(double... numeros) {
        double total = 0;
        for (double num :
                numeros) {
            total -= num;
        }
        return total;
    }

    static double resta(double num1, double num2) {
        return num1 - num2;
    }

    static double dividir(double num1, double num2){
        return num1 / num2;
    }

    static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    static double elevar(double num1, double num2) {
        double total = num1;
        for (int i = 1; i < num2; i++) {
            total *= num1;
        }
        return total;
    }
}

package C725082023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
//        ArrayList <String> estudiantesCohorte = new ArrayList<>();
//
//        estudiantesCohorte.add("Angel");
//        estudiantesCohorte.add("Matias");
//        estudiantesCohorte.add("Lizzete");
//
//        String eliminado = estudiantesCohorte.remove(2);
//
//        for (String estudiante:estudiantesCohorte) {
//            System.out.println(estudiante);
//        }
//
//        System.out.println("El eliminado fue: "+ eliminado);
//
//
//        HashSet<String> paises = new HashSet<>();
//
//        Scanner scan = new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            paises.add(scan.nextLine());
//        }
//
//        System.out.println(paises);
//        System.out.println(paises.add("Francia"));

       HashMap<String, String> capitales = new HashMap<>();

       capitales.put("Chile", "Santiago");
       capitales.put("Argentina", "Buenos Aires");
       capitales.put("Peru", "Lima");

        for (String pais:capitales.values()
             ) {
            System.out.println(pais);
        }
    }




}

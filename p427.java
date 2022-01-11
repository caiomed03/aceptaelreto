    package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p427 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosPrueba = sc.nextInt();

        for (int i = 0; i < casosPrueba; i++) {
            String nombre = sc.next();
            String parentesco = sc.next();

            if (nombre.equals("Luke") && parentesco.equals("padre")) {
                System.out.println("TOP SECRET");
            } else {
                System.out.println(nombre + ", yo soy tu " + parentesco);
            }
        }
    }
}

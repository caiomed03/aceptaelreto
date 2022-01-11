package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p436 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            double grosorPapel = sc.nextInt() * Math.pow(10, -6);
            int alturaEdificio = sc.nextInt();

            for (int i = 0; true; i++) {
                if (grosorPapel >= alturaEdificio) {
                    System.out.println(i);
                    break;
                }
                grosorPapel *= 2;
            }
            

        }
    }
}

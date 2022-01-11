package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p433 {

    public static void main(String[] args) {
        int nUvas, suma = 0, cont = 0;
        Scanner sc = new Scanner(System.in);

        nUvas = sc.nextInt();
        while (nUvas != 0) {
            for (int i = 1; true; i++) {
                suma += i;
                if (suma >= nUvas) {
                    cont++;
                    suma = 0;
                    break;
                }
                cont++;
            }

            System.out.println(cont);
            cont = 0;
            nUvas = sc.nextInt();
        }
    }
}

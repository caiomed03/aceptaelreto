package com.caiomed03.aceptaelreto;

import Librerias.ArrayLib;
import java.util.Scanner;

public class p460 {

    public static void main(String[] args) {
        int n, res = 0;
        String n1;
        String[] numeros;
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            n1 = sc.next();
            numeros = new String[n1.length()];
            numeros = n1.split("");

            for (int i = 0; i < n1.length(); i++) {
                if (i!=n1.length()-1) {
                    System.out.print(numeros[i] + "0");
                }
                else{
                    System.out.print(numeros[i]);
                }
            }
            System.out.println("");

        }
    }
}

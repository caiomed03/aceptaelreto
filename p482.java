package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p482 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int contN = 0;
            int contG = 0;
            String aux = sc.next();
            if (aux.equals(".")) {
                return;
            }
            while (!".".equals(aux)) {
                if ("N".equals(aux)) {
                    contN++;
                } else if ("G".equals(aux)) {
                    contG++;
                }
                aux = sc.next();
            }

            if (contN % 2 == 0 && contG % 2 == 0) {
                System.out.println("EMPAREJADOS");
            } else if (contN % 2 == 1 && contG % 2 == 0) {
                System.out.println("NEGRO SOLITARIO");
            } else if (contN % 2 == 0 && contG % 2 == 1) {
                System.out.println("GRIS SOLITARIO");
            } else if (contN % 2 == 1 && contG % 2 == 1) {
                System.out.println("PAREJA MIXTA");
            }
        }
    }
}

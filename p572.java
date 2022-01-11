package com.caiomed03.trabajo2Ev;

import java.util.Scanner;

public class p572 {

    public static boolean checkerMayor9(double[] a) {
        for (int i = 0; i < 5; i++) {
            if (a[i] >= 9) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkerDe0(double[] a) {
        for (int i = 0; i < 5; i++) {
            if (a[i] == 0.0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        double a;
        int casosPrueba;
        double[] notas = new double[5];
        Scanner sc = new Scanner(System.in);

        casosPrueba = sc.nextInt();

        for (int i = 0; i < casosPrueba; i++) {
            for (int j = 0; j < 5; j++) {
                notas[j] = Double.parseDouble(sc.next());
            }
            if (checkerDe0(notas)) {
                if (checkerMayor9(notas)) {
                    System.out.println("MEDIA");
                } else {
                    System.out.println("SUSPENSO DIRECTO");
                }
            } else {
                System.out.println("MEDIA");
            }
        }

    }
}

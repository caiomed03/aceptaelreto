package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p439 {

    public static void main(String[] args) {
        int casosPrueba;
        String[] a;
        String[] b;
        Scanner sc = new Scanner(System.in);

        casosPrueba = sc.nextInt();

        for (int i = 0; i < casosPrueba; i++) {
            a = sc.next().split("=");
            b = sc.next().split("=");

            if (a[0].equals("D") && b[0].equals("T")) {
                int aux = Integer.parseInt(a[1]) / Integer.parseInt(b[1]);
                System.out.println("V=" + aux);
            } else if (a[0].equals("T") && b[0].equals("D")) {
                int aux = Integer.parseInt(b[1]) / Integer.parseInt(a[1]);
                System.out.println("V=" + aux);
            } else if (a[0].equals("T") && b[0].equals("V")) {
                int aux = Integer.parseInt(a[1]) * Integer.parseInt(b[1]);
                System.out.println("D=" + aux);
            } else if (a[0].equals("V") && b[0].equals("T")) {
                int aux = Integer.parseInt(b[1]) * Integer.parseInt(a[1]);
                System.out.println("D=" + aux);
            } else if (a[0].equals("V") && b[0].equals("D")) {
                int aux = Integer.parseInt(b[1]) / Integer.parseInt(a[1]);
                System.out.println("T=" + aux);
            } else if (a[0].equals("D") && b[0].equals("V")) {
                int aux = Integer.parseInt(a[1]) / Integer.parseInt(b[1]);
                System.out.println("T=" + aux);
            }
        }
    }
}

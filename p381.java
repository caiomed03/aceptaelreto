package com.caiomed03.trabajo2Ev;

import java.util.Scanner;

public class p381 {

    static Scanner sc = new Scanner(System.in);

    // Función para hallar el máximo común divisor de 2 números.
    public static int mcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return mcd(b % a, a);
    }

    // Fórmula para calcular el mínimo común múltiplo de 2 números.
    public static int mcm(int a, int b) {

        return (a * b) / mcd(a, b);
    }

    // Función para rellenar el array.
    public static void fillArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {

        int numPlanetas;
        int[] planetas;
        int dias;

        while (true) {
            numPlanetas = sc.nextInt();

            if (numPlanetas == 0) {
                return;
            }

            planetas = new int[numPlanetas];
            fillArray(planetas);

            // Voy haciendo el mínimo común múltiplo de 2 en 2 hasta hallar la solución.
            dias = mcm(planetas[0], planetas[1]);
            for (int i = 2; i < numPlanetas; i++) {
                dias = mcm(dias, planetas[i]);
            }
            System.out.println(dias);
        }

    }

}

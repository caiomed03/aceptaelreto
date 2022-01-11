package com.caiomed03.trabajo2Ev;


import java.util.Scanner;

public class p168 {

    public static int numeroFaltante(int[] a) {
        int suma = 0;
        int suma2 = 0;

        // Calculo la suma de todos los elementos contando la pieza que falta.
        for (int i = 1; i < a.length + 2; i++) {
            suma += i;
        }

        // Calculo la suma del array.
        for (int i = 0; i < a.length; i++) {
            suma2 += a[i];
        }

        // Devuelvo la resta entre las 2 números que será el número faltante.
        return suma - suma2;
    }

    public static void main(String[] args) {
        int numPiezas;
        int[] piezas;
        Scanner sc = new Scanner(System.in);

        numPiezas = sc.nextInt();
        while (numPiezas != 0) {
            piezas = new int[numPiezas - 1];
            
            // Relleno el array
            for (int i = 0; i < numPiezas - 1; i++) {
                piezas[i] = sc.nextInt();
            }

            System.out.println(numeroFaltante(piezas));

            numPiezas = sc.nextInt();
        }
    }
}

package com.caiomed03.aceptaelreto;

import java.io.*;
import java.util.*;

public class p485 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            int[] distancias = new int[n];
            int suma = 0;
            for (int i = 0; i < n; ++i) {
                distancias[i] = sc.nextInt();
                suma += distancias[i];
            }
            for (int i = 0; i < n; ++i) {
                System.out.print(suma);
                if (i < n - 1) {
                    System.out.print(" ");
                }
                suma -= distancias[i];
            }
            System.out.println();

            n = sc.nextInt();
        }
    }
}

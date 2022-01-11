package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p380 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nNumeros = sc.nextInt();

        while (!(nNumeros == 0)) {
            int sum = 0;
            for (int i=0; i<nNumeros; i++) {
                sum += sc.nextInt();
            }
            System.out.println(sum);
            nNumeros = sc.nextInt();
        }
    }
}

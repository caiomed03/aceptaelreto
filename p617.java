package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p617 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casosPrueba = Integer.parseInt(s.nextLine());
        while (casosPrueba-- != 0) {

            int nFilas = Integer.parseInt(s.nextLine());
            char[][] matriz = new char[nFilas][3];

            for (int i = 0; i < nFilas; i++) {
                String aux = s.nextLine();
                for (int j = 0; j < 3; j++) {
                    matriz[i][j] = aux.charAt(j);
                }
            }
            String res = "";
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < nFilas; j++) {
                    res += matriz[j][i];
                }
            }
            System.out.println(res);
        }
    }

}

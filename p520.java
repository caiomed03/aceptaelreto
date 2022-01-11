package com.caiomed03.aceptaelreto;

import java.util.ArrayList;
import java.util.Scanner;

public class p520 {

    static Scanner sc = new Scanner(System.in);

    public static int posFinalBola(int[] movimientos, int posInicial) {
        int posFinal = posInicial;

        for (int i = 0; i < movimientos.length; i++) {
            if(i%2==0){
                if(movimientos[i]==posFinal){
                    posFinal = movimientos[i+1];
                }
            }
            else{
            }
        }

        return posFinal;
    }

    public static int[] add(int[] a, int n) {
        int[] aux = new int[a.length + 1];

        for (int i = 0; i < aux.length; i++) {
            if (i == aux.length - 1) {
                aux[i] = n;
            } else {
                aux[i] = a[i];
            }
        }
        return aux;

    }

    public static void main(String[] args) {
        int numCubos, posBola, aux;
        int[] movimientos;

        while (true) {
            numCubos = sc.nextInt();
            posBola = sc.nextInt();
            movimientos = new int[numCubos*2];
            if (numCubos == 0 && posBola == 0) {
                break;
            }
            
            for(int i=0; i<numCubos*2; i++){
                movimientos[i] = sc.nextInt();
            }
            
            int aaaa = posFinalBola(movimientos, posBola);
            System.out.println(aaaa);
        }
    }
}

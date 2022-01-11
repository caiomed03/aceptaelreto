package com.caiomed03.aceptaelreto;

import java.util.Arrays;
import java.util.Scanner;

public class p586 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosPrueba = sc.nextInt();

        for (int i = 0; i < casosPrueba; i++) {
            int años = sc.nextInt();
            int[] conjunto = new int[años];
            
            for(int j=0; j<años; j++){
                conjunto[j] = sc.nextInt();
            }
            
            int cont = 0;
            Arrays.sort(conjunto);
            
            for(int z=1; z<años ; z++){
                cont += conjunto[z] - conjunto[z-1] - 1;
            }
            System.out.println(cont);
        }
    }
}

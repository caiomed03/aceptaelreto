
package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p602 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int casosPrueba = sc.nextInt();
        
        for (int i = 0; i < casosPrueba; i++) {
            int suma = 2;
            int n = sc.nextInt();
            int diaAnteAyer = 1, diaAyer = 1;
            for(int j=2; true; j++){
                if(diaAnteAyer*2+diaAyer>=n){
                    System.out.println(j);
                    break;
                }
                int aux = diaAnteAyer;
                diaAnteAyer = diaAyer;
                diaAyer = aux*2+diaAyer;
            }
        }
    }
}

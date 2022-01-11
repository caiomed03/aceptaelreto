
package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p512 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int casosPrueba = sc.nextInt();
        
        for (int i = 0; i < casosPrueba; i++) {
            double conejo = sc.nextDouble();
            double caballo = sc.nextDouble();
            double res = conejo*100.0/(conejo+caballo);
            System.out.println((int)res);
        }
    }
}

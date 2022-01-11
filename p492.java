
package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p492 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numeroMarta = sc.nextInt();
        int numeroDaniel = sc.nextInt();
        int n = sc.nextInt();
        while(!(numeroMarta==0 && numeroDaniel==0 && n==0)){
            int sum = 0;
            for(int i=Math.max(numeroMarta, numeroDaniel); i<n+1; i+=Math.max(numeroMarta, numeroDaniel)){
                if(i%numeroMarta==0 && i%numeroDaniel==0){
                    sum = n/i;
                    break;
                }
            }
            System.out.println(sum);
            numeroMarta = sc.nextInt();
            numeroDaniel = sc.nextInt();
            n = sc.nextInt();
        }
    }
}

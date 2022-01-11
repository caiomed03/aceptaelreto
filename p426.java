
package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p426 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nNiños = sc.nextInt();
        
        while(nNiños!=0){
            int contNiños = 0;
            int sum = 0;
            while(nNiños!=0){
                contNiños++;
                sum += nNiños;
                nNiños = sc.nextInt();
            }
            if(sum%contNiños==0){
                System.out.println("REPARTO JUSTO");
            }
            else{
                System.out.println("IMPOSIBLE");
            }
            nNiños = sc.nextInt();
        }
    }
}


package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p413 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int casosPrueba = sc.nextInt();
        
        for (int i = 0; i < casosPrueba; i++) {
            int ancho = sc.nextInt();
            int alto = sc.nextInt();
            if(ancho%2==0 || alto%2==0){
                System.out.println(ancho*alto/2 + " " + ancho*alto/2);
            }
            else{
                int aux = ancho*alto;
                System.out.println((ancho*alto+1)/2 + " " + (ancho*alto-1)/2);
            }
        }
    }
}


package com.caiomed03.trabajo2Ev;

import java.util.Scanner;

public class p532 {
    public static void main(String[] args){
        int casosPrueba, pesoNeto, pesoTotal;
        Scanner sc = new Scanner(System.in);
        
        casosPrueba = sc.nextInt();
        
        for(int i=0; i<casosPrueba; i++){
            pesoNeto = sc.nextInt();
            pesoTotal = sc.nextInt();
            System.out.println(pesoTotal-pesoNeto);
        }
    }
}

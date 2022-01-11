
package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p434 {
    public static void main(String[] args){
        int casosPrueba, nPalomas, nHabitaculos;
        Scanner sc = new Scanner(System.in);
        
        casosPrueba = sc.nextInt();
        
        for(int i=0; i<casosPrueba; i++){
            nPalomas = sc.nextInt();
            nHabitaculos = sc.nextInt();
            
            if(nHabitaculos>=nPalomas){
                System.out.println("ROMANCE");
            }
            else{
                System.out.println("PRINCIPIO");
            }
       }
    }
}

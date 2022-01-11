
package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p313 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int casosPrueba = sc.nextInt();
        
        for (int i = 0; i < casosPrueba; i++) {
            int x = sc.nextInt();
            int b = sc.nextInt();
            
            if(x+b>=0){
                System.out.println("SI");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

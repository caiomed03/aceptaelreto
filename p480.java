
package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p480 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int casosPrueba = sc.nextInt();
        
        for (int i = 0; i < casosPrueba; i++) {
            int uvasTotales = sc.nextInt();
            int factor = sc.nextInt();
            int cadaEstasUvas = sc.nextInt();
            int sum = 0;
            
            sum += uvasTotales/cadaEstasUvas*factor;
            if(uvasTotales%cadaEstasUvas>factor){
                sum += factor;
            }
            else{
                sum += uvasTotales%cadaEstasUvas;
            }
            System.out.println(sum);
        }
    }
}

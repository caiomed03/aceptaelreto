package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p615 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosPrueba = sc.nextInt();

        for (int i = 0; i < casosPrueba; i++) {
            int pasos = sc.nextInt();
            int factor = sc.nextInt();
            int tiempo = sc.nextInt();
            
            System.out.println(tiempo%(pasos+1)*factor);
           
        }
    }
}

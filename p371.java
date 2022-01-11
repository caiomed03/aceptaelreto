package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p371 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();

        while (base != 0) {
            // Utilizo la fórmula de la suma de números consecutivos ya que se 
            // puede apreciar un patrón
            int res = (base)*(base+1)/2*3;            
            System.out.println(res);
            base = sc.nextInt();
        }
    }
}

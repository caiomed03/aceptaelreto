
package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p350 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double lado = sc.nextDouble(), altura = sc.nextDouble();
        
        while (!(lado == 0 && altura == 0)) {
            System.out.println(lado*altura/2);
            lado = sc.nextDouble();
            altura = sc.nextDouble();
        }
    }
}

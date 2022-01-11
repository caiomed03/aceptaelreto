package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p467 {

    public static void show(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        String frase;
        int casosPrueba;
        Scanner sc = new Scanner(System.in), sc2 = new Scanner(System.in);

        casosPrueba = sc.nextInt();
        for (int i = 0; i < casosPrueba; i++) {
            String p1 = sc.next();
            String p2 = sc.next();
            String p3 = sc.next();
            if(p1.equalsIgnoreCase(p3)){
                System.out.println("TAUTOLOGIA");
            }
            else{
                System.out.println("NO TAUTOLOGIA");
            }
        }
    }
}


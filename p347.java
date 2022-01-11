package com.caiomed03.trabajo2Ev;

import java.util.Scanner;

public class p347 {

    public static int func(int ancho, int alto) {
        int res;
        
        // Restricciones del enunciado
        if (alto < 10 || ancho < 10) {
            return 0;
        }
        
        // Lógica
        if (ancho > alto) {
            res = ancho / alto;
            ancho = ancho - res * alto;
            return res + func(ancho, alto);
        } else {
            res = alto / ancho;
            alto = alto - res * ancho;
            return res + func(ancho, alto);
        }
    }

    public static void main(String[] args) {
        int ancho, alto;
        Scanner sc = new Scanner(System.in);
        while (true) {
            ancho = sc.nextInt();
            alto = sc.nextInt();
            
            // El programa debe finalizar cuando las 2 entradas sean 0
            if (ancho == 0 && alto == 0) {
                return;
            }
            
            // Resultado
            System.out.println(func(ancho, alto));
        }
    }
}

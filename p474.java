package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p474 {

    public static void main(String[] args) {
        int casosPrueba, posSpiderman, posBomba1, posBomba2, contador = 0;
        Scanner sc = new Scanner(System.in);

        casosPrueba = sc.nextInt();

        for (int i = 0; i < casosPrueba; i++) {
            posSpiderman = sc.nextInt();
            posBomba1 = sc.nextInt();
            posBomba2 = sc.nextInt();

            if (Math.abs(posSpiderman - posBomba1) < Math.abs(posSpiderman - posBomba2)) {
                contador += Math.abs(posBomba1 - posSpiderman);
                posSpiderman = posBomba1;
                contador += Math.abs(posBomba2 - posSpiderman);
            } else {
                contador += Math.abs(posBomba2 - posSpiderman);
                posSpiderman = posBomba2;
                contador += Math.abs(posBomba1 - posSpiderman);
            }
            System.out.println(contador);
            contador = 0;
        }
    }
}

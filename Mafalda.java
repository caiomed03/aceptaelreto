package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class Mafalda {

    public static void main(String[] args) {
        int casosPrueba, nMafalda, nPadre, nMadre, casosFavorables = 0;
        Scanner sc = new Scanner(System.in);

        casosPrueba = sc.nextInt();

        for (; casosPrueba != 0; casosPrueba--) {
            nMafalda = sc.nextInt();
            nPadre = sc.nextInt();
            nMadre = sc.nextInt();
            
            for(int i=nMafalda; i!=nMadre+1; i++){
                for(int j=0; j!=nPadre+1; j++){
                    if(i+j==nMadre){
                        casosFavorables++;
                    }
                }
            }
            System.out.println(casosFavorables);
            casosFavorables = 0;
        }
    }
}

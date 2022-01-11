package com.caiomed03.trabajo2Ev;

import java.util.ArrayList;
import java.util.Scanner;

public class p533 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosPrueba = sc.nextInt();

        for (int i = 0; i < casosPrueba; i++) {
            int kilosPremio = sc.nextInt();
            int botellasNecesarias = kilosPremio * 8;
            
            int botella = sc.nextInt();
            int suma = 0;
            int pos = -1;
            for(int j=1; botella != 0; j++){
                suma += botella;
                if(suma>=botellasNecesarias){
                    if(pos == -1){
                        pos = j;
                    }
                    else{
                        continue;
                    }
                   
                }
                botella = sc.nextInt();
            }
            
            if(pos != -1){
                System.out.println(pos);
            }
            else{
                System.out.println("SIGAMOS RECICLANDO");
            }
        }
    }
}


package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p360 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int casosPrueba = sc.nextInt();
        
        for (int i = 0; i < casosPrueba; i++) {
            int cantidadAguaInicial = sc.nextInt(), cantidadDeAguaCircuitoSeguro = sc.nextInt();
            
            int agua = sc.nextInt();
            int nivelAgua = cantidadAguaInicial;
            int cont = 0;
            while(agua!=-1){
                nivelAgua -= agua;
                if(nivelAgua<cantidadDeAguaCircuitoSeguro){
                    nivelAgua = cantidadAguaInicial;
                    cont++;
                }
                agua = sc.nextInt();
            }
            

            System.out.println(cont);
        }
    }
}

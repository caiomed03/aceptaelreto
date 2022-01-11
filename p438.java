
package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p438 {
    public static int contadorExclamaciones(String frase){
        int aux=0;
        for(int i=0; i<frase.length(); i++){
            if(frase.charAt(i)=='!'){
                aux++;
            }
        }
        return aux;
    }
    public static int contadorLetras(String frase){
        int aux=0;
        for(int i=0; i<frase.length(); i++){
            String aux1 = frase.charAt(i) + "";
            if(aux1.matches("[a-zA-Z]")){
                aux++;
            }
        }
        return aux;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String frase;
        
        while(sc.hasNext()){
            frase = sc.nextLine();
            
            if(contadorExclamaciones(frase)>contadorLetras(frase)){
                System.out.println("ESGRITO");
            }
            else{
                System.out.println("escrito");
            }
        }
    }
}

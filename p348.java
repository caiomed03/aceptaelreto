package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p348 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosPrueba = sc.nextInt();
        for (int i = 0; i < casosPrueba; i++) {
            int n = sc.nextInt();
            
            if (9 > n) {
                System.out.println(1);
            } else {
                int tamaño = String.valueOf(n).length();
                int factor;
                if(tamaño%2==0){
                    String aux = "1" + String.valueOf((int) Math.pow(10, tamaño/2-1));
                    factor = Integer.parseInt(aux);
                }
                else{
                    factor = (int) Math.pow(10, (tamaño-1)/2);
                }
                String aux = String.valueOf(n);
                int descRec;
                if(factor*Integer.parseInt(aux.substring(0, aux.length()-1))<n){
                    descRec = n - factor*Integer.parseInt(aux.substring(0, aux.length()-1));
                }
                else{
                    descRec = n - factor*Integer.parseInt(aux.substring(0, aux.length()-1));
                }
                int res = Math.abs(factor+n-descRec);
                System.out.println(res);
            }
        }
    }
}

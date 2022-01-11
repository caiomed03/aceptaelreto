
package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p376 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nRutas = sc.nextInt();
        
        while (!(nRutas == 0)) {
            int[] picos = new int[nRutas];
            int cont=0;
            for(int i=0; i<nRutas; i++){
                picos[i] = sc.nextInt();
            }
            for(int i=0; i<nRutas; i++){
                if(i==0){
                    if(picos[0]>picos[1] && picos[0]>picos[picos.length-1]) cont++;
                }
                else if(i==nRutas-1){
                    if(picos[picos.length-1]>picos[i-1] && picos[picos.length-1]>picos[0]) cont++;
                }
                else{
                    if (picos[i]>picos[i-1] && picos[i]>picos[i+1]) cont++;
                }
            }
            
            System.out.println(cont);
            nRutas  =sc.nextInt();
        }
    }
}

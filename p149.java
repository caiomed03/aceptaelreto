
package com.caiomed03.aceptaelreto;




import java.util.Scanner;


public class p149 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int nToros = sc.nextInt();
            int max = Integer.MIN_VALUE;
            for(int i=0; i<nToros; i++){
                int aux = sc.nextInt();
                if(max<aux){
                    max = aux;
                }
            }
            System.out.println(max);
        }
    }
}

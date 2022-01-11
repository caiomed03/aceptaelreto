package com.caiomed03.aceptaelreto;

import java.util.*;

public class p428 {
    public static boolean a(String a){
        int sum = 0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)=='4'){
                sum++;
            }
            if(sum>1){
                return true;
            }
        }
        return false;
    }
    public static long basexABaseY(long numero, int basex, int basey) {
        if (basex >= 2 && basex <= 10 && basey >= 2 && basey <= 10) {
            if (basex == 10 || basey == 10) {
                int decimal = 0;
                int digito;
                final long DIVISOR = basey;
                for (long i = numero, j = 0; i > 0; i /= DIVISOR, j++) {
                    digito = (int) (i % DIVISOR);
                    decimal += digito * Math.pow(basex, j);
                }
                return decimal;
            } else {
                // Lo paso a decimal
                long aDecimal = basexABaseY(numero, basex, 10);
                // Lo paso a la base deseada
                long numeroBaseY = basexABaseY(aDecimal, 10, basey);
                return numeroBaseY;
            }
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosPrueba = sc.nextInt();

        for (int i = 0; i < casosPrueba; i++) {
            int nBase10 = sc.nextInt();
            String nBase5 = String.valueOf(basexABaseY(nBase10, 10, 5));
            if(a(nBase5)){
                System.out.println("SI");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

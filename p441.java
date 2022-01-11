package com.caiomed03.aceptaelreto;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p441 {

    static Scanner sc = new Scanner(System.in);

    public static String replace(String a) {
        String aux = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '.') {
                aux += "";
                continue;
            }
            aux += a.charAt(i);
        }
        return aux;
    }

    public static void main(String[] args){
        String numero;
        DecimalFormat formatea = new DecimalFormat("###,###.##");

        while (sc.hasNext()){
            numero = sc.next();

            numero = replace(numero);

            int n = Integer.parseInt(numero)+1;

            System.out.println(formatea.format(n));
        }
    }
}

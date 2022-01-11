package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p401 {

    public static boolean esTrifelio(String str1, String str2) {

        str1 = str1.replace("v", "b").toLowerCase();
        str2 = str2.replace("v", "b").toLowerCase();

        if (str1.equals(str2)) {
            return false;
        }

        return str1.concat(str1).contains(str2) && str2.concat(str2).contains(str1) && str2.charAt(0)!='r';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosPrueba = sc.nextInt();

        for (int i = 0; i < casosPrueba; i++) {
            String s1 = sc.next(), s2 = sc.next();
            if(esTrifelio(s1, s2)){
                System.out.println("SI");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

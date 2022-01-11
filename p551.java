package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p551 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String s1 = sc.next();
            String res = "";
            for (int i = 0; i < s1.length() - 1;) {
                char aux = (char) Integer.parseInt(s1.substring(i, i + 2));
                String a = aux +"";
                if (a.matches("[a-zA-Z0-9., ]")) {
                    res += aux;
                    i += 2;
                }
                else{
                    aux = (char) Integer.parseInt(s1.substring(i, i + 3));
                    res += aux;
                    i += 3;
                }
            }
            System.out.println(res);
        }
    }
}

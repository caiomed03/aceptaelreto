package com.caiomed03.trabajo2Ev;

import java.util.Scanner;

public class p174 {

    public static boolean hasRepeatedDigits(int a) {
        String aux = String.valueOf(a);

        for (int i = 0; i < aux.length(); i++) {
            for (int j = i + 1; j < aux.length(); j++) {
                if (aux.charAt(i) == aux.charAt(j)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosPrueba = sc.nextInt();

        for (int i = 0; i < casosPrueba; i++) {
            int n = sc.nextInt();
            int primerAño = 0, ultimoAño = 0;
            if (hasRepeatedDigits(n)) {
                for (int j = n; true; j--) {
                    if (!hasRepeatedDigits(j)) {
                        primerAño = j + 1;
                        break;
                    }
                }
                for (int j = primerAño; true; j++) {
                    if (!hasRepeatedDigits(j)) {
                        ultimoAño = j - 1;
                        break;
                    }
                }
            } else {
                for (int j = n; true; j--) {
                    if (hasRepeatedDigits(j)) {
                        primerAño = j + 1;
                        break;
                    }
                }
                for (int j = primerAño; true; j++) {
                    if (hasRepeatedDigits(j)) {
                        ultimoAño = j - 1;
                        break;
                    }
                }
            }
            System.out.println(primerAño + " " + (ultimoAño - primerAño + 1));
        }
    }
}

package com.caiomed03.aceptaelreto;

import java.util.ArrayList;
import java.util.Scanner;


public class p472 {

    public static boolean check(ArrayList cotas, int desnivelPermitido) {
        int sum = 0;
        for (int i = 0; i < cotas.size() - 1; i++) {
            if ((int) cotas.get(i + 1) - (int) cotas.get(i) > 0) {
                sum += (int) cotas.get(i + 1) - (int) cotas.get(i);
            } else if ((int) cotas.get(i + 1) - (int) cotas.get(i) <= 0) {
                sum = 0;
            }
            if (sum > desnivelPermitido) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int desnivelPermitido = sc.nextInt();
            int nCotas = sc.nextInt();
            ArrayList<Integer> cotas = new ArrayList<>();

            for (int i = 0; i < nCotas; i++) {
                cotas.add(sc.nextInt());
            }
            int sum = 0;

            if (check(cotas, desnivelPermitido)) {
                System.out.println("APTA");
            } else {
                System.out.println("NO APTA");
            }
        }
    }
}

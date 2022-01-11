package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p107 {

    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static double calculadorErrorPermitido(int m) {
        return 1 / Math.pow(10, m);
    }

    public static float calculadorErrorReal(double n) {
        float aux2 = numerosPrimosDe1aN(n);
        float aux = (float) (numerosPrimosDe1aN(n) / n);
        double aux3 = aux - (1 / Math.log(n));
        double aux4 = 1 / Math.log(n);
        System.out.println(aux3);
        return (float) Math.abs(aux - (1 / Math.log(n)));
    }

    public static float numerosPrimosDe1aN(double n) {
        return (float) (n / Math.log(n));
    }

    public static void main(String[] args) {
        int error, a;
        double n;
        FastReader sc = new FastReader();

        n = sc.nextInt();
        error = sc.nextInt();

        while (n != 0 && error != 0) {
            if (calculadorErrorPermitido(error) > calculadorErrorReal(n)) {
                System.out.println("Menor");
            } else if (calculadorErrorPermitido(error) < calculadorErrorReal(n)) {
                System.out.println("Mayor");
                System.out.println(numerosPrimosDe1aN(n));
                System.out.println(calculadorErrorReal(n));
                System.out.println(1 / Math.log(n));
            } else {
                System.out.println("Igual");
            }
            n = sc.nextInt();
            error = sc.nextInt();
        }
    }
}

package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p192 {
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
    public static boolean cc(int n) {
        int aux = n;
        for (int i = 0; true; i++) {
            int a = n - (int) Math.pow(3, i);
            if (aux - Math.pow(3, i) < 0) {
                return false;
            }
            if (a % 5 == 0) {
                return true;
            }
            if (aux - Math.pow(3, i) < 0) {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        boolean tipo1 = true;
        while (n != 0) {
            int aux = n;
            if (cc(aux)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            n = sc.nextInt();
        }

    }

}

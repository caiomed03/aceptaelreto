package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p193 {

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

    public static boolean checker(String suma) {
        for (int i = 0; i < suma.length(); i++) {
            if (Character.getNumericValue(suma.charAt(i)) % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();

        while (!(n == 0)) {
            StringBuilder aa = new StringBuilder(String.valueOf(n));
            int reversoN = Integer.parseInt(aa.reverse().toString());
            if (String.valueOf(reversoN).length() != aa.length()) {
                System.out.println("NO");
            } else {
                String suma = String.valueOf(reversoN + n);
                if (checker(suma)) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
            n = sc.nextInt();
        }
    }
}

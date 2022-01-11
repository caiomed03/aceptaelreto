package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p165 {
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
    public static boolean checker(char[] a) {
        for (int i = 0; i < a.length; i++) {
            if (Character.getNumericValue(a[i]) % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int a;
        String aaa;
        FastReader sc = new FastReader();
        a = sc.nextInt();
        while (a>-1) {
            aaa = String.valueOf(a);
            char[] aa = aaa.toCharArray();

            if (checker(aa)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            a = sc.nextInt();
        }
    }
}

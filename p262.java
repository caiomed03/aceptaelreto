package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p262 {
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
    static int pow(int n, int pot) {
        if (pot == 0) {
            return 1;
        }
        return pow(n, pot - 1) * n % 46337;
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt(), p = sc.nextInt();

        while (!(n == 0 && p == 0)) {
            int sum = 0;
            for (int i = 1; i < n + 1; i++) {
                sum += pow(i, p);
                sum %= 46337;
            }
            System.out.println(sum);
            n = sc.nextInt();
            p = sc.nextInt();
        }
    }
}

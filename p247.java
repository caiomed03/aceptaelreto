package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p247 {
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
    public static boolean checker(int[] abejas) {
        for (int i = 0; i < abejas.length - 1; i++) {
            if (abejas[i] >= abejas[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int nAbejas = sc.nextInt();

        while (!(nAbejas == 0)) {
            int[] abejas = new int[nAbejas];
            for (int i = 0; i < nAbejas; i++) {
                abejas[i] = sc.nextInt();
            }
            
            if(checker(abejas)){
                System.out.println("NO");
            }
            else{
                System.out.println("SI");
            }
            nAbejas = sc.nextInt();
        }
    }
}
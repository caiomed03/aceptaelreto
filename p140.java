package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p140 {
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
    public static int sumador(String s){
        int sum=0;
        for(int i=0; i<s.length(); i++){
            sum += Character.getNumericValue(s.charAt(i));
        }
        return sum;
    }
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();

        while (!(n < 0)) {
            String s1 = String.valueOf(n);
            for (int i = 0; i < s1.length(); i++) {
                if (i!=s1.length()-1) {
                    System.out.print(s1.charAt(i) + " + ");
                }
                else{
                    System.out.print(s1.charAt(i)+" ");
                }
            }
            System.out.print("= "+sumador(s1));
            System.out.println("");
            n = sc.nextInt();
        }

    }
}

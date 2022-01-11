
package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p171 {
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
    public static void main(String[] args){
        FastReader sc = new FastReader();
        int nMontanias = sc.nextInt();
        
        while (!(nMontanias == 0)) {
            int sum = 0;
            int[] a = new int[nMontanias];
            for(int i=0; i<nMontanias; i++){
                a[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            for(int i=nMontanias-1; i>-1; i--){
                if(a[i]>max){
                    max = a[i];
                    sum++;
                }
            }
            System.out.println(sum);
            nMontanias = sc.nextInt();
        }
    }
}

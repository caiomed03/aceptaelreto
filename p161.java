
package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p161 {
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
        int nNumeros = sc.nextInt();
        while (!(nNumeros == 0)) {
            int[] n = new int[nNumeros];
            for(int i=0; i<nNumeros; i++){
                n[i] = sc.nextInt();
            }
            Arrays.sort(n);
            int index1;
            int index2;
            if(n.length%2==0){
                index1 = n.length/2;
                index2 = n.length/2+1;
                int res = n[index1-1] + n[index2-1];
                System.out.println(res);
            }
            else{
                index1= (n.length+1)/2;
                System.out.println(n[index1-1]*2);
            }
            nNumeros = sc.nextInt();
        }
    }
}

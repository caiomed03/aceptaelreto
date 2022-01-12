package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p525 {

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

        boolean hasNext() {
            if (st != null && st.hasMoreTokens()) {
                return true;
            }
            String tmp;
            try {
                br.mark(1000);
                tmp = br.readLine();
                if (tmp == null) {
                    return false;
                }
                br.reset();
            } catch (IOException e) {
                return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int casosPrueba = sc.nextInt();

        for (int i = 0; i < casosPrueba; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            
            if(n1>n2){
                int temp = n2;
                n2 = n1;
                n1 = temp;
            }
            
            if(a1>a2){
                int temp = a2;
                a2 = a1;
                a1 = temp;
            }
            
            if((n1<=a1 && n2<=a1) || n1>=a2) System.out.println("SEPARADOS");
            else System.out.println("SOLAPADOS");

        }
    }
}

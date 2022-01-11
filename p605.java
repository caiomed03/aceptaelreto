package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p605 {

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

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        String s1 = sc.next();

        while (!(s1.equals("."))) {
            int contV = 0;
            int contI = 0;
            while (!s1.equals(".")) {
                if (s1.equals("V")) {
                    contV++;
                } else if (s1.equals("I")) {
                    contI++;
                } else {
                    contV++;
                    contI++;
                }
                s1 = sc.next();
            }
            if(contV>contI) System.out.println("VERANO");
            else if(contI>contV) System.out.println("INVIERNO");
            else System.out.println("EMPATE");
            
            s1 = sc.next();
        }
    }
}

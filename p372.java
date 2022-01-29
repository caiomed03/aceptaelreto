package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p372 {

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
        int casosPrueba;
        String palabra;

        casosPrueba = sc.nextInt();

        for (int i = 0; i < casosPrueba; i++) {
            palabra = sc.next();
            if (Character.isLowerCase(palabra.charAt(0))) {
                for (int j = palabra.length() - 1; j != -1; j--) {
                    System.out.print(palabra.charAt(j));
                }
            } else {
                palabra = palabra.toLowerCase();
                for (int j = palabra.length() - 1; j != -1; j--) {
                    if (j == palabra.length() - 1) {
                        System.out.print(Character.toUpperCase(palabra.charAt(j)));
                        continue;
                    }
                    System.out.print(palabra.charAt(j));
                }
            }
            System.out.println("");
        }
    }
}

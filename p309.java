package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

// 15 + 8 - 7 + 10 - 3
//   23  16  26   23
public class p309 {
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

        FastReader s = new FastReader();

        int casos;
        int resultado = 0;
        int n2;
        String signo;

        casos = s.nextInt();

        for (int i = 0; i < casos; i++) {

            resultado = s.nextInt();

            signo = s.next();

            n2 = s.nextInt();

            while (!signo.equals(".")) {

                if (signo.equals("+")) {

                    resultado += n2;

                } else if (signo.equals("-")) {

                    resultado -= n2;

                }

                signo = s.next();

                if (signo.equals(".")) {
                    System.out.print(resultado);
                    resultado = 0;
                } else {
                    System.out.print(resultado + ", ");
                    n2 = s.nextInt();
                }

            }

            System.out.println();

        }

    }

}

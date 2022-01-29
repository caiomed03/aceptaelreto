package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p466 {

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

    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int casosPrueba = sc.nextInt();

        while (casosPrueba-- != 0) {
            String a = sc.next();
            String b = sc.next();
            if (a.length() != b.length()) {
                int cant0;
                String aSumar0 = "";
                if (a.length() > b.length()) {
                    cant0 = a.length() - b.length();
                    for (int i = 0; i < cant0; i++) {
                        aSumar0 += 0;
                    }
                    aSumar0 += b;
                    b = aSumar0;
                } else {
                    cant0 = b.length() - a.length();
                    for (int i = 0; i < cant0; i++) {
                        aSumar0 += 0;
                    }
                    aSumar0 += a;
                    a = aSumar0;
                }
                char[] a2 = a.toCharArray();
                char[] b2 = b.toCharArray();
                int carry = 0;
                int[] res = new int[a2.length];
                for (int i = a2.length - 1; i != -1; i--) {
                    if (i == 0) {
                        res[0] = Character.getNumericValue(a2[0]) * Character.getNumericValue(b2[0]) + carry;
                    } else if (Character.getNumericValue(a2[i]) * Character.getNumericValue(b2[i]) + carry > 9) {
                        res[i] = (Character.getNumericValue(a2[i]) * Character.getNumericValue(b2[i]) + carry) % 10;
                        carry = (Character.getNumericValue(a2[i]) * Character.getNumericValue(b2[i]) + carry) / 10;
                    } else if (Character.getNumericValue(a2[i]) * Character.getNumericValue(b2[i]) + carry < 10) {
                        res[i] = (Character.getNumericValue(a2[i]) * Character.getNumericValue(b2[i]) + carry);
                        carry = 0;
                    }
                }
                for (int aa : res) {
                    System.out.print(aa);
                }
                System.out.println("");

            } else {
                char[] a2 = a.toCharArray();
                char[] b2 = b.toCharArray();
                int carry = 0;
                int[] res = new int[a2.length];
                for (int i = a2.length - 1; i != -1; i--) {
                    if (i == 0) {
                        res[0] = Character.getNumericValue(a2[0]) * Character.getNumericValue(b2[0]) + carry;
                    } else if (Character.getNumericValue(a2[i]) * Character.getNumericValue(b2[i]) + carry > 9) {
                        res[i] = (Character.getNumericValue(a2[i]) * Character.getNumericValue(b2[i]) + carry) % 10;
                        carry = (Character.getNumericValue(a2[i]) * Character.getNumericValue(b2[i]) + carry) / 10;
                    } else if (Character.getNumericValue(a2[i]) * Character.getNumericValue(b2[i]) + carry < 10) {
                        res[i] = (Character.getNumericValue(a2[i]) * Character.getNumericValue(b2[i]) + carry);
                        carry = 0;
                    }
                }
                for (int aa : res) {
                    System.out.print(aa);
                }
                System.out.println("");
            }
        }
    }
}

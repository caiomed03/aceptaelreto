package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p154 {

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

        FastReader s = new FastReader();

        String numMatricula;
        String letraMatricula;
        int matriculaNumero;
        char[] matriculaChar = new char[3];
        char letra;

        numMatricula = s.next();

        letraMatricula = s.next();

        while (!(numMatricula.equals("9999") && letraMatricula.equals("ZZZ"))) {

            matriculaNumero = Integer.parseInt(numMatricula);
            matriculaNumero++;
            numMatricula = String.valueOf(matriculaNumero);

            if (matriculaNumero > 9999) {

                numMatricula = "0000";

                for (int i = 0; i < letraMatricula.length(); i++) {

                    matriculaChar[i] = letraMatricula.charAt(i);

                }

                matriculaChar[2] = next_char(letraMatricula.charAt(2));

                if (matriculaChar[2] == 'B') {

                    matriculaChar[1] = next_char(letraMatricula.charAt(1));

                    if (matriculaChar[1] == 'B') {

                        matriculaChar[0] = next_char(letraMatricula.charAt(0));

                    }

                }

            }

            if (numMatricula.equals("0000")) {

                System.out.print(numMatricula + " ");

                for (int i = 0; i < 3; i++) {
                    System.out.print(matriculaChar[i]);
                }

                System.out.println();

            } else {

                System.out.printf("%04d %s", matriculaNumero, letraMatricula);
                System.out.println();

            }

            numMatricula = s.next();

            letraMatricula = s.next();

        }

    }

    public static char next_char(char x) {

        char letras[] = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
        int pos = 0;

        for (int i = 0; i < 21; i++) {

            if (x == letras[i]) {
                pos = i;
            }

        }

        if (letras[pos] == 'Z') {

            return letras[0];

        } else {

            return letras[pos + 1];

        }

    }

}

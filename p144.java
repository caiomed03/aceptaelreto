package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class p144 {

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

        ArrayList<Character> letras;
        String presionadas;
        int pos;

        while (s.hasNext()) {

            presionadas = s.nextLine();

            pos = 0;
            letras = new ArrayList<>();
            for (int i = 0; i < presionadas.length(); i++) {
                switch (presionadas.charAt(i)) {
                    case '-':
                        pos = 0;
                        break;
                    case '*':
                        pos++;
                        break;
                    case '3':
                        if (!letras.isEmpty() && pos <= letras.size() - 1) {
                            letras.remove(pos);
                        }
                        break;
                    case '+':
                        if (letras.isEmpty()) {
                            pos = 0;
                        } else {
                            pos = letras.size();
                        }
                        break;
                    default:
                        if (pos > letras.size()) {
                            if (!letras.isEmpty()) {
                                pos = letras.size();
                            } else {
                                pos = 0;
                            }
                        }
                        letras.add(pos++, presionadas.charAt(i));
                }
            }

            for (Character c : letras) {
                System.out.print(c + "");
            }
            System.out.println();
        }

    }
}

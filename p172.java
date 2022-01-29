    package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p172 {

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

    static boolean check(String a) {
        char b = '.';
        boolean flag = true;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != '.' && flag) {
                b = a.charAt(i);
                flag = false;
            }
            if (!flag && a.charAt(i) != b && a.charAt(i) != '.') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int nAsistentes = sc.nextInt();
        while (!(nAsistentes == 0)) {
            String s1 = sc.next();
            System.out.println(check(s1) ? "TODOS COMEN" : "ALGUNO NO COME");
            nAsistentes = sc.nextInt();
        }
    }
}

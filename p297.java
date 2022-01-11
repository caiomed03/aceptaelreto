package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p297 {

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

    public static long calculoMedio(long n, String m) {
        switch (m) {
            case "o":
                return n;
            case "da":
                return n * 10;
            case "h":
                return n * 100;
            case "k":
                return n * 1000;
            case "M":
                return n * 1000000;
            case "G":
                return n * 1000000000;
        }
        return 0;
    }

    public static String calcularRes(long num) {
        if (num % 1000000000 == 0) {
            return (num / 1000000000) + " G";
        }
        if (num % 1000000 == 0) {
            return (num / 1000000) + " M";
        }
        if (num % 1000 == 0) {
            return (num / 1000) + " k";
        }
        if (num % 100 == 0) {
            return (num / 100) + " h";
        }
        if (num % 10 == 0) {
            return (num / 10) + " da";
        }
        return num + " o";
    }

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();

        long n, sum=0;
        String m;
        int casosPrueba = sc.nextInt();

        for (int i = 0; i < casosPrueba; i++) {
            sum = 0;
            while (true) {
                n = sc.nextLong();
                if (n == 0) break;
                m = sc.next();
                sum += calculoMedio(n, m);
            }
            System.out.println(calcularRes(sum));
        }

    }

}

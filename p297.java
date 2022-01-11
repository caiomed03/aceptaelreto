package com.caiomed03.trabajo2Ev;

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

    public static long calculoMedio(long num, String m) {
        switch (m) {
            case "o":
                return num;
            case "da":
                return num * 10;
            case "h":
                return num * 100;
            case "k":
                return num * 1000;
            case "M":
                return num * 1000000;
            case "G":
                return num * 1000000000;
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

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int casosPrueba = sc.nextInt();
        long num, res;
        String m;

        for (int i = 0; i < casosPrueba; i++) {
            res = 0;
            while (true) {
                num = sc.nextLong();
                if (num == 0) {
                    break;
                }
                m = sc.next();
                res += calculoMedio(num, m);
            }
            System.out.println(calcularRes(res));
        }

    }

}

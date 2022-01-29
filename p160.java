package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p160 {

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

    static boolean check(int[][] a) {
        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[j][i] != 0) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            return true;
        } else {
            for (int i = 0; i < a[0].length; i++) {
                for (int j = i + 1; j < a[0].length; j++) {
                    if (a[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int matriz = sc.nextInt();
        while (!(matriz == 0)) {
            int[][] a = new int[matriz][matriz];
            for (int i = 0; i < matriz; i++) {
                for (int j = 0; j < matriz; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            if (check(a)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            matriz = sc.nextInt();
        }
    }
}

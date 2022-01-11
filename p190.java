package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p190 {

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

        public BigInteger nextBigInteger() {
            return new BigInteger(next());
        }
    }

    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        long n = sc.nextLong();
        long n2 = sc.nextLong();

        while (n >= n2) {
            long res = 1;
            if (n == 0 && n2 == 0) {
                res = 1;
            } else if (!(n == 0 && n2 == 0)) {
                for (long i = n; i != n2; i--) {
                    res *= i;
                }
            }
            System.out.println(res);
            n = sc.nextLong();
            n2 = sc.nextLong();
        }
    }
}

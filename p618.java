package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p618 {

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

    static void solve(int[] arr, int left, int right) {
        int sum = 0;
        if (left < right) {
            for (int i = left + 1; i < right; i++) {
                sum += arr[i];
            }
        } else {
            for (int i = left; i >= right; i--) {
                sum -= arr[i];
            }
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        FastReader s = new FastReader();
        int n;
        int[] arr;

        while (true) {
            n = s.nextInt();
            if (n == 0) {
                break;
            }

            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }

            n = s.nextInt();
            while (n-- != 0) {
                solve(arr, s.nextInt() - 1, s.nextInt() - 1);
            }
            System.out.println("---");
        }
    }
}

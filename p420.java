package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p420 {

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

        int C = s.nextInt();
        int target, sum, res;
        LinkedList<Integer> stack = new LinkedList<>();
        char[] input;

        while (C-- != 0) {
            target = s.nextInt();
            input = s.next().toCharArray();

            res = sum = 0;
            for (char c : input) {
                int n = Integer.parseInt(c + "");
                sum += n;
                stack.addLast(n);
                if (sum == target) {
                    res++;
                }
                while (sum > target) {
                    sum -= stack.removeFirst();
                    if (sum == target) {
                        res++;
                    }
                }
            }
            System.out.println(res);
            stack.clear();
        }
    }
}

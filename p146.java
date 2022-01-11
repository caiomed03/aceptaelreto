package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class p146 {

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

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();

        while (n != 0) {
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 1; i < n + 1; i++) {
                a.add(i);
            }
            int m = 2;
            ArrayList<Integer> aabb = new ArrayList<>();
            while (a.size() >= m) {
                for (int i = 0; i < a.size(); i++) {
                    if (i % m != 0) {
                        aabb.add(a.get(i));
                    }
                }
                a.clear();
                a.addAll(aabb);
                aabb.clear();
                m++;
            }
            for (int i = a.size()-1; i >-1; i--) {
                if(i==a.size()-1 && a.size()==1) System.out.print(n+": "+a.get(i));
                else if(i==a.size()-1) System.out.print(n +": " + a.get(i) + " ");
                else if(i==0) System.out.print(a.get(i));
                else System.out.print(a.get(i) + " ");
            }
            System.out.println("");
            n = sc.nextInt();

        }
    }
}

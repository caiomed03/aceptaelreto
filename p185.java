package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class p185 {

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
        FastReader sc = new FastReader();
        int potitos = Integer.parseInt(sc.next());
        while (!(potitos == 0)) {
            TreeSet<String> ingredientesSI = new TreeSet<>();
            TreeSet<String> ingredientesNO = new TreeSet<>();
            for (int i = 0; i < potitos; i++) {
                String tomado = sc.next();
                if (tomado.equals("SI:")) {
                    String aux = sc.next();
                    while (!aux.equals("FIN")) {
                        ingredientesSI.add(aux);
                        aux = sc.next();
                    }
                } else {
                    String aux = sc.next();
                    while (!aux.equals("FIN")) {
                        ingredientesNO.add(aux);
                        aux = sc.next();
                    }
                }
            }
            ingredientesNO.removeAll(ingredientesSI);
            ArrayList<String> sol = new ArrayList<>(ingredientesNO);
            if(sol.isEmpty()) System.out.println("");
            for (int i = 0; i < sol.size(); i++) {
                if (i == sol.size() - 1) {
                    System.out.println(sol.get(i));
                } else {
                    System.out.print(sol.get(i) + " ");
                }
            }
            potitos = Integer.parseInt(sc.next());
        }

    }
}

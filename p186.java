package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p186 {

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

    public static int mayor(ArrayList numeros) {
        int mayor = (int) numeros.get(0);
        for (int x = 1; x < numeros.size(); x++) {
            if ((int) numeros.get(x) > mayor) {
                mayor = (int) numeros.get(x);
            }
        }
        return mayor;
    }

    public static int check(ArrayList a) {
        int mayor = mayor(a);
        for (int i = 0; i < a.size(); i++) {
            if ((int) a.get(i) == mayor && a.indexOf(mayor) != i) {
                return -1;
            }
        }
        return a.indexOf(mayor(a)) + 1;
    }

    public static ArrayList a(ArrayList a, int equipos) {
        ArrayList<Integer> aa = new ArrayList<>();

        for (int i = 0; i < equipos; i++) {
            aa.add(0);
        }

        for (int i = 0; i < a.size(); i++) {
            aa.set(((int) a.get(i) - 1), aa.get((int) a.get(i) - 1) + 1);
        }

        return aa;
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int equipos = sc.nextInt(), nGlobos = sc.nextInt();

        while (!(equipos == 0 && nGlobos == 0)) {
            ArrayList<Integer> puntuaciones = new ArrayList<>();
            for (int i = 0; i < nGlobos; i++) {
                puntuaciones.add(sc.nextInt());
                sc.next();
            }
            ArrayList<Integer> aux = a(puntuaciones, equipos);
            int res = check(aux);
            if (res == -1) {
                System.out.println("EMPATE");
            } else {
                System.out.println(res);
            }
            equipos = sc.nextInt();
            nGlobos = sc.nextInt();
        }
    }
}

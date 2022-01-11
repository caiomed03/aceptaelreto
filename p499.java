package com.caiomed03.trabajo2Ev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p499 {

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
        int nFilas = sc.nextInt(), nColumnas = sc.nextInt(), nModificaciones = sc.nextInt();

        while (!(nFilas == 0 && nColumnas == 0 && nModificaciones == 0)) {
            int[][] matriz = new int[nFilas+1][nColumnas];

            for (int i = 0; i < nModificaciones; i++) {
                int indiceColumna = sc.nextInt(), primeraFila = sc.nextInt(), ultimaFila = sc.nextInt(),
                        valorAAñadir = sc.nextInt();

                matriz[primeraFila][indiceColumna] += valorAAñadir;
                matriz[ultimaFila+1][indiceColumna] += -(valorAAñadir);
            }
            for (int i = 0; i < nColumnas; i++) {
                int val = 0;
                for (int j = 0; j < nFilas; j++) {
                    val += matriz[j][i];
                    matriz[j][i] = val;
                }
            }
            for (int i = 0; i < nFilas; i++) {
                for (int j = 0; j < nColumnas; j++) {
                    if (j == 0) {
                        System.out.print(matriz[i][j]);
                    } else {
                        System.out.print(" "+matriz[i][j]);
                    }
                }
                System.out.println("");
            }
            nFilas = sc.nextInt();
            nColumnas = sc.nextInt();
            nModificaciones = sc.nextInt();
        }
    }
}

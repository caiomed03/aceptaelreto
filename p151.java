package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p151 {

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
    public static boolean checkDemas(int[][] a, int fila){
        for(int i=0; i<fila; i++){
            for(int j=0; j<fila; j++){
                if(i==j) continue;
                if(a[i][j] != 0) return false;
            }
        }
        return true;
    }
    public static boolean check1(int[][] a){
        for(int i=0; i<a.length; i++) if(a[i][i]!=1) return false;
        return true;
    }
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int fila = sc.nextInt();

        while (!(fila == 0)) {
            int[][] matriz = new int[fila][fila];

            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < fila; j++) {
                    matriz[i][j] = sc.nextInt();
                }
            }
            boolean chec = checkDemas(matriz, fila);
            if(check1(matriz) && checkDemas(matriz, fila)) System.out.println("SI");
            else System.out.println("NO");

            fila = sc.nextInt();
        }
    }
}


package com.caiomed03.aceptaelreto;

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
    }
    public static void main(String[] args){
        FastReader sc = new FastReader();
        int nFilas = sc.nextInt(), nColumnas = sc.nextInt(), nModificaciones = sc.nextInt();
        
        while (!(nFilas == 0 && nColumnas == 0 && nModificaciones == 0)) {
            int[][] matriz = new int[nFilas][nColumnas];
            for(int i=0; i<nModificaciones; i++){
                int indiceColumna = sc.nextInt();
                int indicePrimeraFila = sc.nextInt();
                int indiceUltimaFila = sc.nextInt();
                int valorAAñadir = sc.nextInt();
                
                for(int j=indicePrimeraFila; j<indiceUltimaFila+1; j++){
                    matriz[j][indiceColumna] += valorAAñadir;
                }
            }
            
            for(int i=0; i<nFilas; i++){
                for(int j=0; j<nColumnas; j++){
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.println("");
            }
            nFilas = sc.nextInt();
            nColumnas = sc.nextInt();
            nModificaciones = sc.nextInt();
        }
    }
}


package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p158 {
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
        int casosPrueba = sc.nextInt();
            
        for (int i = 1; i < casosPrueba+1; i++) {
            int altos = 0;
            int bajos = 0;
            int muros = sc.nextInt();
            int primero = sc.nextInt();
            int segundo;
            for(int j=0; j<muros-1; j++){
                segundo = sc.nextInt();
                if(primero>segundo){
                    bajos++;
                    primero = segundo;
                }
                else if(primero<segundo){
                    altos++;
                    primero = segundo;
                }
            }
            System.out.println(altos+" "+bajos);
        }
    }
}

package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p112 {

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

        double distanciaEnKM = sc.nextDouble() / 1000;
        double velocidadMax = sc.nextDouble();
        double tiempoEnHoras = sc.nextDouble() / 3600;
        while (!(distanciaEnKM == 0 && velocidadMax==0 && tiempoEnHoras==0)) {
            if(distanciaEnKM<=0 || velocidadMax<=0 || tiempoEnHoras<=0){
                System.out.println("ERROR");
            }
            else{
                double velocidadCoche = distanciaEnKM/tiempoEnHoras;
                if(velocidadCoche<velocidadMax) System.out.println("OK");
                else{
                    velocidadMax = velocidadMax*1.2;
                    if(velocidadCoche<velocidadMax) System.out.println("MULTA");
                    else System.out.println("PUNTOS");
                }
            }
            
            distanciaEnKM = sc.nextDouble() / 1000;
            velocidadMax = sc.nextDouble();
            tiempoEnHoras = sc.nextDouble() / 3600;
        }
    }
}

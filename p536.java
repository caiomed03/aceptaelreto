package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p536 {

    static class Terreno {

        String nombre;
        int size;
        int cantidadAbono;
        int aguaNecesitada;
        int distancia;

        public Terreno(int size, int cantidadAbono, int aguaNecesitada, int distancia, String nombre) {
            this.nombre = nombre;
            this.size = size;
            this.cantidadAbono = cantidadAbono;
            this.aguaNecesitada = aguaNecesitada;
            this.distancia = distancia;
        }

    }

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

         int size, abono, agua, distancia;
        String nombre;
        Terreno res;

        while (s.hasNext()) {

            res = null;

            for (int i = s.nextInt(); i > 0; i--) {
                String[] datos = s.nextLine().split(" ");
                size = Integer.parseInt(datos[0]);
                abono = Integer.parseInt(datos[1]);
                agua = Integer.parseInt(datos[2]);
                distancia = Integer.parseInt(datos[3]);
                nombre = "";
                for(int j=4; j<datos.length; j++){
                    nombre += datos[j] +" ";
                }

                if (res == null) {
                    res = new Terreno(size, abono, agua, distancia, nombre);
                }
                else {
                    if (res.size == size) {
                        if (res.aguaNecesitada == agua) {
                            if (distancia == res.distancia) {
                                if (abono < res.cantidadAbono) {
                                    res = new Terreno(size, abono, agua, distancia, nombre);
                                }
                            }
                            else if (distancia < res.distancia) {
                                res = new Terreno(size, abono, agua, distancia, nombre);
                            }
                        }
                        else if (agua < res.aguaNecesitada) {
                            res = new Terreno(size, abono, agua, distancia, nombre);
                        }
                    }
                    else if (size > res.size) {
                        res = new Terreno(size, abono, agua, distancia, nombre);
                    }
                }

            }

            System.out.println( res.nombre.trim() );
        }
    }
}

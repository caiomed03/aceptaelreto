package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p611 {

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
    static class Res{
        private int año;
        private String nombre;
        
        public Res(int año, String nombre){
            this.año = año;
            this.nombre = nombre;
        }
        
        public String getNombre(){
            return nombre;
        }
        public int getAño(){
            return año;
        }
        
    }
    public static void main(String[] args) {
        FastReader sc = new FastReader();

        while (sc.hasNext()) {
            String[] datos = sc.nextLine().split(" ");
            Res aa = null;
            int añoNombramiento = Integer.parseInt(datos[0]);
            String nombre="";
            int cont=0;
            for(int i=1; i<datos.length; i++){
                nombre += datos[i] +" ";
            }
            int nNovelas = sc.nextInt();
            for(int i=0; i<nNovelas; i++){
                String[] libro = sc.nextLine().split(" ");
                int año = Integer.parseInt(libro[0]);
                String nombreLibro = "";
                if(año>=añoNombramiento) cont++;
                for(int j=1; j<libro.length; j++){
                    if(j!=libro.length-1) nombreLibro+=libro[j]+ " ";
                    else nombreLibro+=libro[j];
                }
                if(aa==null && año>=añoNombramiento){
                    aa = new Res(año, nombreLibro);
                }
                else if(aa!=null && año>=añoNombramiento){
                    if(año-añoNombramiento<aa.getAño()-añoNombramiento){
                        aa = new Res(año, nombreLibro);
                    }
                }
            }
            if(aa!=null && cont!=nNovelas) System.out.println(aa.getNombre());
            else if(aa!=null && cont==nNovelas) System.out.println("TODAS");
            else System.out.println("NINGUNA");
        }
    }
}


package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p446 {
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
    public static boolean check(String[] a, String b){
        for(int i=0; i<a.length-1;i++){
            if(a[i].equals(b)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        FastReader sc = new FastReader();
        int casosPrueba = sc.nextInt();
        
        for (int i = 0; i < casosPrueba; i++) {
            String nombreReal = sc.next();
            int nNombres = sc.nextInt();
            String[] nombres = new String[nNombres];
            
            for(int j=0; j<nNombres; j++){
                nombres[j] = sc.next();
            }
            String aux = nombres[nombres.length-1];
            if(nNombres==1) System.out.println("FALSA");
            else if(aux.equals(nombreReal) && check(nombres, nombreReal)) System.out.println("VERDADERA");
            else System.out.println("FALSA");
            
        }
    }
}

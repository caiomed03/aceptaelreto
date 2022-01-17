
package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class p521 {
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
    public static void main(String[] args){
        FastReader sc = new FastReader();
        int nPisos = sc.nextInt(), nViviendasPorPiso = sc.nextInt(), nAsistentes = sc.nextInt();
        
        while (!(nPisos == 0 && nViviendasPorPiso == 0 && nAsistentes == 0)) {
            HashSet<String> asistente = new HashSet<>();
            for(int i=0; i<nAsistentes; i++){
                String aux = sc.nextInt() + sc.next();
                asistente.add(aux);
            }
            
            int totalViviendas = nPisos*nViviendasPorPiso;
            if(asistente.size()*2>=totalViviendas) System.out.println("EMPEZAMOS");
            else System.out.println("ESPERAMOS");
            nPisos = sc.nextInt();
            nViviendasPorPiso = sc.nextInt();
            nAsistentes = sc.nextInt();
        }
    }
}

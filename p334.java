package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p334 {

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
        int casosPrueba = sc.nextInt();

        for (int i = 0; i < casosPrueba; i++) {
            String s1 = sc.nextLine();
            String aux="";
            if(s1.length()>=2) aux = s1.substring(0, 3).toLowerCase();
            String aux2;
            if(s1.length()>=2)  aux2 = s1.substring(s1.length()-2, s1.length()).toLowerCase();
            else aux2 = s1.charAt(0)+"";
            aux2 = aux2.toLowerCase();
            String aux3 = s1.charAt(s1.length()-1) + "";
            if (aux2.equals("ix")) {
                if (aux.equals("mac")) {
                    System.out.println("MULATO");
                } else {
                    System.out.println("GALO");
                }
            } else if (aux2.equals("us") || aux2.equals("um")) {
                if (aux.equals("mac")) {
                    System.out.println("MULATO");
                } else {
                    System.out.println("ROMANO");
                }
            } else if (aux2.equals("ic")) {
                if (aux.equals("mac")) {
                    System.out.println("MULATO");
                } else {
                    System.out.println("GODO");
                }
            }
            else if(aux2.equals("as")){
                if(aux.equals("mac")) System.out.println("MULATO");
                else System.out.println("GRIEGO");
            }
            else if(aux2.equals("af")){
                if(aux.equals("mac")) System.out.println("MULATO");
                else System.out.println("NORMANDO");
            }
            else if(aux2.equals("is") || aux2.equals("os") || aux2.equals("ax")){
                if(aux.equals("mac")) System.out.println("MULATO");
                else System.out.println("BRETON");
            }
            else if(aux2.equals("ez")){
                if(aux.equals("mac")) System.out.println("MULATO");
                else System.out.println("HISPANO");
            }
            else if(aux3.equals("A")){
                if(aux.equals("mac")) System.out.println("MULATO");
                else System.out.println("INDIO");
            }
            else{
                if(aux.equals("mac")) System.out.println("PICTO");
                else System.out.println("PLUS ULTRA");
            }
        }
    }
}

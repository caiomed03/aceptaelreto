
package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p518 {
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
        String a  =sc.next();
        
        while (!(a.equals("0.00"))) {
            int primeraParte = Integer.parseInt(a.substring(0, a.indexOf(".")));
            int segundaParte = Integer.parseInt(a.substring(a.indexOf(".")+1, a.length()));
            if(primeraParte==1 || primeraParte==3 || primeraParte==5 || primeraParte==7 || primeraParte==8 || primeraParte==10 ||primeraParte==12){
                if(segundaParte>0 && segundaParte<32) System.out.println("SI");
                else System.out.println("NO");
            }
            else if(primeraParte==2){
                if(segundaParte>0 && segundaParte<29) System.out.println("SI");
                else System.out.println("NO");
            }
            else if(primeraParte==4 || primeraParte==6 ||primeraParte==9 || primeraParte==11){
                if(segundaParte>0 && segundaParte<31) System.out.println("SI");
                else System.out.println("NO");
            }
            else System.out.println("NO");
            a = sc.next();
        }
    }
}

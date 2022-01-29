
package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p300 {
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
        int casosPrueba = sc.nextInt();
        
        while (casosPrueba-- != 0) {
            String s1 = sc.next();
            boolean a,e, i, o, u;
            a=e=i=o=u=false;
            for(int j=0; j<s1.length(); j++){
                if(s1.charAt(j)=='a') a = true;
                else if(s1.charAt(j)=='e') e= true;
                else if(s1.charAt(j)=='i') i= true;
                else if(s1.charAt(j)=='o') o=true;
                else if(s1.charAt(j)=='u') u=true;
            }
            if(a && e && i && o && u) System.out.println("SI");
            else System.out.println("NO");
        }
    }
}

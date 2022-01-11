
package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p124 {
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
     public static int acarreos(String s1, String s2)
    {
        int cuenta=0; 
        int acarreo=0;
        int i=0; 
        boolean terminado=false;
        while (!terminado)
        {
            
            
            int i1=i<s1.length()?s1.charAt(s1.length()-i-1)-'0':0; 
            int i2=i<s2.length()?s2.charAt(s2.length()-i-1)-'0':0;
            int suma=acarreo+i1+i2; 
            acarreo=suma>=10?1:0; 
            cuenta+=acarreo;
            i++; 
            
            terminado=!(acarreo>0) && (i>=s1.length() || i>s2.length());
        }
        return cuenta;
    }
     public static void main(String[] args)
    {
        FastReader sc = new FastReader();
        boolean terminar=false;
        do
        {
            String s1=sc.next(); 
            String s2=sc.next(); 
            terminar=s1.equals("0")&&s2.equals("0");
            if (!terminar)
            {
                System.out.println(acarreos(s2,s1));
            }
        } while (!terminar);
        
    }
}

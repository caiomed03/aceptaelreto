
package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p157 {
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
        int dia, mes, casosPrueba, remaining=0;
        FastReader sc = new FastReader();
        
        casosPrueba = sc.nextInt();
        
        for(; casosPrueba!=0; casosPrueba--){
            dia = sc.nextInt();
            mes = sc.nextInt();
            if(mes==12){
                remaining += 31-dia;
            }
            else{
                for(; mes<12; mes++){
                    if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10){
                        remaining+=31;
                    }
                    else if(mes==2){
                        remaining+=28;
                    }
                    else{
                        remaining += 30;
                    }
                }
                remaining += 31 - dia;
            }
            System.out.println(remaining);
            remaining = 0;
        }
        
    }
}

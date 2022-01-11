
package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p363 {
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
        FastReader sc = new FastReader();
        int entrenamiento = sc.nextInt();
        
        while (!(entrenamiento == 0)) {
            int nComidas = sc.nextInt();
            int sum = 0;
            for(int i=0; i<nComidas; i++){
                sum += sc.nextInt();
            }
            if(sum<=entrenamiento) System.out.println("1");
            else if(sum>entrenamiento && sum%entrenamiento!=0) System.out.println(sum/entrenamiento+1);
            else if (sum>entrenamiento && sum%entrenamiento==0) System.out.println(sum/entrenamiento);
            entrenamiento = sc.nextInt();
        }   
    }
}

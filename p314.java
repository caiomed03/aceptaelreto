
package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p314 {
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
        int casosPrueba = sc.nextInt();
        
        for (int i = 0; i < casosPrueba; i++) {
            int nTemp = sc.nextInt();
            int[] temp = new int[nTemp];
            for(int j=0; j<nTemp; j++){
                temp[j] = sc.nextInt();
            }
            
            int contP = 0;
            int contV = 0;
            
            for(int j=1; j<nTemp-1; j++){
                if(temp[j]>temp[j-1] && temp[j]>temp[j+1]) contP++;
                else if(temp[j]<temp[j-1] && temp[j]<temp[j+1]) contV++;
            }
            
            System.out.println(contP + " " + contV);
        }
    }
}

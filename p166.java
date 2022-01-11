
package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p166 {
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
        int canalEstoy = sc.nextInt(), canalQuieroEstar = sc.nextInt();
        
        while(!(canalEstoy==0 && canalQuieroEstar==0)){
            if(Math.abs(canalEstoy+99-canalQuieroEstar)<Math.abs(canalEstoy-canalQuieroEstar)){
                System.out.println(Math.abs(canalEstoy+99-canalQuieroEstar));
            }
            else if(Math.abs(99-canalEstoy+canalQuieroEstar)<Math.abs(canalEstoy-canalQuieroEstar)){
                System.out.println(Math.abs(99-canalEstoy+canalQuieroEstar));
            }
            else{
                System.out.println(Math.abs(canalEstoy-canalQuieroEstar));
            }
            
            canalEstoy = sc.nextInt();
            canalQuieroEstar = sc.nextInt();
        }
    }
}

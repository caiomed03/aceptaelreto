package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class p268 {

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

        int nPlatos = sc.nextInt();
        int nCoronas = sc.nextInt();

        while (!(nPlatos == 0 && nCoronas == 0)) {
            ArrayList<Integer> platos = new ArrayList<>();
            ArrayList<Integer> coronas = new ArrayList<>();
            TreeMap<Double, String> sol = new TreeMap<>();
            for (int i = 0; i < nPlatos; i++) {
                platos.add(sc.nextInt());
            }
            for (int i = 0; i < nCoronas; i++) {
                coronas.add(sc.nextInt());
            }

            for (int i = 0; i < nPlatos; i++) {
                for (int j = 0; j < nCoronas; j++) {
                    double aux = (double)platos.get(i)/coronas.get(j);
                    String aux2 = platos.get(i) + "-" + coronas.get(j);
                    sol.put(aux, aux2);
                }
            }
            
            ArrayList<String> sol2 = new ArrayList<>(sol.values());
            for(int i=0; i<sol2.size(); i++){
                if(i==sol2.size()-1) System.out.println(sol2.get(i));
                else System.out.print(sol2.get(i) + " ");
            }
            
            nPlatos = sc.nextInt();
            nCoronas = sc.nextInt();
        }
    }
}

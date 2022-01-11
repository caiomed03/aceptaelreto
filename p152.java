package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

public class p152 {

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
        FastReader entrada = new FastReader();
        int casos = entrada.nextInt();

        while (casos != 0) {
            int mayor = 0;
            String moda = "";
            HashMap<String, Integer> lista = new HashMap<>(); // Clave 

            for (int i = 0; i < casos; i++) {
                String numeroStr = entrada.next();
                if (!(lista.containsKey(numeroStr))) {
                    String num = String.valueOf(numeroStr);
                    lista.put(num, 1);
                } else {
                    String num = String.valueOf(numeroStr);
                    lista.put(num, lista.get(num) + 1);
                }

                Set<String> claves = lista.keySet();
                for (String clave : claves) {
                    int repeticiones = lista.get(clave);
                    if (repeticiones > mayor) {
                        moda = clave;
                        mayor = repeticiones;
                    }
                }
            }
            System.out.println(moda);
            casos = entrada.nextInt();
        }
    }
}

package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p106 {

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
        String a = sc.next();
        while (!(a.equals("0"))) {
            int digitoControl = Character.getNumericValue(a.charAt(a.length() - 1));
            int sum = 0;
            String aux = "";
            int cant0;
            if (a.length() < 8) {
                cant0 = 8 - a.length();
                for (int i = 0; i < cant0; i++) {
                    aux += "0";
                }
                aux += a;
            } else if (a.length() > 8 && a.length() < 13) {
                cant0 = 13 - a.length();
                for (int i = 0; i < cant0; i++) {
                    aux += "0";
                }
                aux += a;
            } else aux = a;
            for (int i = aux.length() - 2, j = 1; i != -1; i--, j++) {
                if (j % 2 == 0) {
                    sum += Character.getNumericValue(aux.charAt(i));
                } else {
                    sum += Character.getNumericValue(aux.charAt(i)) * 3;
                }
            }
            if ((sum + digitoControl) % 10 == 0 && aux.length() == 13) {
                System.out.print("SI ");
                if (aux.charAt(0) == '0') {
                    System.out.println("EEUU");
                } else if (aux.charAt(0) == '3' && aux.charAt(1) == '8' && aux.charAt(2) == '0') {
                    System.out.println("Bulgaria");
                } else if (aux.charAt(0) == '5' && aux.charAt(1) == '0') {
                    System.out.println("Inglaterra");
                } else if (aux.charAt(0) == '5' && aux.charAt(1) == '3' && aux.charAt(2) == '9') {
                    System.out.println("Irlanda");
                } else if (aux.charAt(0) == '5' && aux.charAt(1) == '6' && aux.charAt(2) == '0') {
                    System.out.println("Portugal");
                } else if (aux.charAt(0) == '7' && aux.charAt(1) == '0') {
                    System.out.println("Noruega");
                } else if (aux.charAt(0) == '7' && aux.charAt(1) == '5' && aux.charAt(2) == '9') {
                    System.out.println("Venezuela");
                } else if (aux.charAt(0) == '8' && aux.charAt(1) == '5' && aux.charAt(2) == '0') {
                    System.out.println("Cuba");
                } else if (aux.charAt(0) == '8' && aux.charAt(1) == '9' && aux.charAt(2) == '0') {
                    System.out.println("India");
                } else {
                    System.out.println("Desconocido");
                }
            } else if ((sum + digitoControl) % 10 == 0 && aux.length() == 8) System.out.println("SI");
            else System.out.println("NO");
            

            a = sc.next();
        }
    }
}

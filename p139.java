package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class p139 {

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

    public static int count(String num) {
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += Integer.parseInt("" + num.charAt(i));
            if (sum > 1) {
                return sum;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        FastReader sc = new FastReader();

        int num, digito;
        String temp;
        int suma;
        int compare;
        Set<Integer> set;

        while (true) {

            num = sc.nextInt();
            if (num == 0) {
                break;
            }

            set = new TreeSet<>();
            set.add(num);

            if (num == 1) {
                System.out.println(num + " -> cubifinito.");
            } else {

                System.out.print(num + " - ");
                while (true) {

                    suma = 0;
                    temp = String.valueOf(num);
                    for (int i = temp.length() - 1; i >= 0; i--) {
                        digito = Integer.parseInt("" + temp.charAt(i));
                        suma += digito * digito * digito;
                    }

                    if (suma == 1) {
                        System.out.println(suma + " -> cubifinito.");
                        break;
                    } else if (set.contains(suma)) {
                        System.out.println(suma + " -> no cubifinito.");
                        break;
                    } else {
                        set.add(suma);
                        num = suma;
                        System.out.print(suma + " - ");
                    }

                }

            }

        }

    }

}

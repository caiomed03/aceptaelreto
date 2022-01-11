package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p523 {

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
        Scanner sc = new Scanner(System.in);
        int casosPrueba = sc.nextInt();

        for (int i = 0; i < casosPrueba; i++) {
            String matriculaEdu = sc.next();
            String letrasEdu = matriculaEdu.substring(4, matriculaEdu.length());
            int numerosEdu = Integer.parseInt(matriculaEdu.substring(0, 4));
            String aux = sc.next();
            int masModerno = 0;
            int masViejo = 0;
            while (!aux.equals("0")) {
                String letras = aux.substring(4, aux.length());
                int numeros = Integer.parseInt(aux.substring(0, 4));
                if (letrasEdu.compareTo(letras) != 0) {
                    if (letrasEdu.compareTo(letras)>0) {
                        masModerno++;
                    } else {
                        masViejo++;
                    }
                } else {
                    if(numerosEdu>numeros) masModerno++;
                    else masViejo++;
                }
                aux = sc.next();
            }
            System.out.println(masModerno + " " + masViejo);
        }
    }
}

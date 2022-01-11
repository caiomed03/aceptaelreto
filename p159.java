package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p159 {

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
        String hora1 = sc.next();
        String hora2 = sc.next();
        String n = sc.next();

        while (!(hora1.equals("24:00") && hora2.equals("24:00"))) {
            int hora = Integer.parseInt(hora1.substring(0, 2));
            int minuto = Integer.parseInt(hora1.substring(3, hora1.length()));
            String aux = "";
            int cont = 0;
            for (int i = minuto; !aux.equals(hora2); i++) {
                if (i > 59) {
                    i = 0;
                    hora++;
                    if (hora < 10 && i < 10) {
                        aux = "0" + hora + ":0" + i;
                    } else if (hora > 9 && i < 10) {
                        aux = hora + ":0" + i;
                    } else {
                        aux = hora + ":" + i;
                    }

                } else {
                    if (hora < 10 && i < 10) {
                        aux = "0" + hora + ":0" + i;
                    } else if (hora > 9 && i < 10) {
                        aux = hora + ":0" + i;
                    } else {
                        aux = hora + ":" + i;
                    }
                }
                if (aux.contains(n)) {
                    cont++;
                }
            }
            System.out.println(cont);

            hora1 = sc.next();
            hora2 = sc.next();
            n = sc.next();
        }
    }
}

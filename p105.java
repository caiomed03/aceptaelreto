package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class p105 {

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

    public static float mediaSemanal(ArrayList<Float> a) {
        float sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
        }
        return sum / a.size();
    }

    public static String determinadorMediaSemanal(ArrayList<Float> a) {
        float media = mediaSemanal(a);

        if (a.get(a.size() - 1) > media) {
            return "SI";
        } else {
            return "NO";
        }
    }

    public static String determinadorDiaMenor(ArrayList<Float> a) {
        int posNumMenor = extraedorDeLaPosicionDelNumeroMenor(a);
        switch (posNumMenor) {
            case 0:
                return "MARTES";
            case 1:
                return "MIERCOLES";
            case 2:
                return "JUEVES";
            case 3:
                return "VIERNES";
            case 4:
                return "SABADO";
            case 5:
                return "DOMINGO";
            default:
                return "AA";
        }
    }

    public static String determinadorDiaMayor(ArrayList<Float> a) {
        int posNumMayor = extraedorDeLaPosicionDelNumeroMayor(a);
        switch (posNumMayor) {
            case 0:
                return "MARTES";
            case 1:
                return "MIERCOLES";
            case 2:
                return "JUEVES";
            case 3:
                return "VIERNES";
            case 4:
                return "SABADO";
            case 5:
                return "DOMINGO";
            default:
                return "AA";
        }
    }

    public static int extraedorDeLaPosicionDelNumeroMenor(ArrayList<Float> a) {
        float menor = numeroMenor(a);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == menor) {
                return i;
            }
        }
        return 0;
    }

    public static float numeroMenor(ArrayList<Float> a) {
        float aux = Float.MAX_VALUE;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < aux) {
                aux = a.get(i);
            }
        }
        return aux;
    }

    public static int extraedorDeLaPosicionDelNumeroMayor(ArrayList<Float> a) {
        float mayor = numeroMayor(a);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == mayor) {
                return i;
            }
        }
        return 0;
    }

    public static float numeroMayor(ArrayList<Float> a) {
        float aux = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > aux) {
                aux = a.get(i);
            }
        }
        return aux;
    }

    public static void main(String[] args) {
        float n2;
        int contador = 0;
        String n, res = "";
        ArrayList<Float> valores = new ArrayList<>();
        ArrayList<Float> aux = new ArrayList<>();
        FastReader sc = new FastReader();

        n = sc.next();

        while (!"-1".equals(n)) {
            n2 = Float.valueOf(n);
            valores.add(contador, n2);
            n = sc.next();
            contador++;
        }

        for (int i = 0; i < valores.size(); i += 6) {
            if (i == 0) {
                for (int j = 0; j < 6; j++) {
                    aux.add(j, valores.get(j));
                }
            } else {
                aux = new ArrayList(1);
                for (int j = 0; j < 6; j++) {
                    aux.add(j, valores.get(i + j));
                }
            }
            res += determinadorDiaMayor(aux) + " " + determinadorDiaMenor(aux) + " " + determinadorMediaSemanal(aux) + "\n";
        }
        System.out.print(res);
    }
}

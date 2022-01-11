package com.caiomed03.aceptaelreto;

//
//package com.caiomed03.aceptaelreto;
//
//import java.util.Scanner;
//
//public class p230 {
//    public static int mayorQue(int [] a, int b, int index){
//        int sum=0;
//        for(int i=index; i<a.length; i++){
//            if(b>a[i]){
//                sum++;
//            }
//        }
//        return sum;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int nEdades = sc.nextInt();
//        
//        while (nEdades != 0) {
//            int[] edad = new int[nEdades];
//            for(int i=0; i<nEdades; i++){
//                edad[i] = sc.nextInt();
//            }
//            int sum = 0;
//            for(int i=0; i<nEdades; i++){
//                sum += mayorQue(edad, edad[i], i);
//            }
//            System.out.println(sum);
//            nEdades = sc.nextInt();
//        }
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p230 {
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
	public static long MergeSort(int[] v, int ini, int fin) {
		if (ini == fin) return 0;
		int m = (ini + fin) / 2;
		long coste = MergeSort(v, ini, m);
		coste += MergeSort(v, m+1, fin);
		int izq = ini, der = m+1, general = ini;
		fin++;
		int[] w = new int[fin - ini];
		while (izq != m+1 && der != fin) {
			if (v[izq] <= v[der]) {
				w[general] = v[izq];
				izq++;
			}
			else {
				w[general] = v[der];
				coste += der - general;
				der++;
			}
			general++;
		}
		while (izq != m+1) {
			w[general] = v[izq];
			izq++;
			general++;
		}
		while (der != fin) {
			w[general] = v[der];
			der++;
			general++;
		}
		general = ini;
		while (general != fin) {
			v[general] = w[general - ini];
			general++;
		}
		fin--;
		return coste;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		while (n != 0) {
			int num;
			int[] v = new int[n];
			for (int i = 0; i < n; i++) {
				num = sc.nextInt();
				v[i] = num;
			}
			int ini = 0;
			n--;
			System.out.println(MergeSort(v, ini, n));
			n = sc.nextInt();
		}
	}
}

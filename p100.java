package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p100 {

    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
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
    public static String numeroDesc(String a){
        // Ordeno los digitos del string de forma descendente
        char[] aux = a.toCharArray();
        Arrays.sort(aux);
        return (new StringBuilder(new String(aux)).reverse().toString());
    }
    public static String numeroAsc(String a){
        // Ordeno los digitos del string de forma ascendente
        char[] aux = a.toCharArray();
        Arrays.sort(aux);
        return (new String(aux));
    }
    public static String Izquierda0(String a){
        String aux = "";
        int cant0 = 4-a.length();
        for(int i=0; i<cant0; i++) aux+=0;
        return aux+=a;
    }
    public static boolean check(String a){
        return a.charAt(0)==a.charAt(1) && a.charAt(1)==a.charAt(2) && a.charAt(2)==a.charAt(3);
    }
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int casosPrueba = Integer.parseInt(sc.nextLine());
        while (casosPrueba-- != 0) {
            String numero = sc.nextLine();
            
            // Si el numero es menor de 1000, se le añade la cantidad de ceros
            // necesarios.
            if(numero.length()<4) numero = Izquierda0(numero);
            // repdigits
            if(check(numero)){System.out.println("8"); continue;}
            int cont=0;
            // Funcion principal
            while(!numero.equals("6174")){
                if(numero.length()<4) numero = Izquierda0(numero);
                numero = String.valueOf(Integer.parseInt(numeroDesc(numero))-Integer.parseInt(numeroAsc(numero)));
                cont++;
            }
            System.out.println(cont);
        }
    }
}

package com.caiomed03.aceptaelreto;

import java.util.Scanner;
import java.util.StringTokenizer;

public class p582 {
    public static int contador2(String sTexto) {
        StringTokenizer tok = new StringTokenizer(sTexto);
        String palabraBuscar = "doong";
        int contador = 0;

        /*
		Bucle while que se repetirá mientras que existan tokens. Dentro del
		bucle se crea un condicional if que compara si el elemento es igual a
		la palabra a buscar. En caso de que así se el contador aumentará en uno
         */
        while (tok.hasMoreTokens()) {
            if (tok.nextElement().equals(palabraBuscar)) {
                contador++;
            }
        }
        return contador;
    }
    public static int contador(String sTexto) {
        StringTokenizer tok = new StringTokenizer(sTexto);
        String palabraBuscar = "doong";
        int contador = 0;

        /*
		Bucle while que se repetirá mientras que existan tokens. Dentro del
		bucle se crea un condicional if que compara si el elemento es igual a
		la palabra a buscar. En caso de que así se el contador aumentará en uno
         */
        while (tok.hasMoreTokens()) {
            if (tok.nextElement().equals(palabraBuscar)) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosPrueba = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < casosPrueba; i++) {
            String s1 = sc.nextLine();
            if (s1.contains("ding-dong")) {
                System.out.println("SALIDA NULA");
            } else if (s1.equals("")) {
                System.out.println("MARISA NARANJO");
            } else if(contador(s1)>=12 && !s1.contains("ding-dong")){
                System.out.println("CORRECTO");
            }
            else if(contador(s1)<12 && !s1.contains("ding-dong")){
                System.out.println("TARDE");
            }
        }
    }
}

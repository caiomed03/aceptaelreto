package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p108 {    
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
        while (sc.hasNext()) {
            double desayunos = 0;
            double comidas = 0;
            double meriendas = 0;
            double cenas = 0;
            double copas = 0;
            double suma = 0;
            int cont0 = 0;
            int contC = 0;

            while (true) {
                // Recojo la línea correspondiente con el split para evitar los espacios de más
                String[] cc = sc.nextLine().split(" ");
                String a = cc[0];
                double b = Double.parseDouble(cc[1]);
                
                // Si se da la condicion de fin de caso de prueba
                if (a.equals("N") && b == 0) {
                    break;
                }
                
                // Segun la letra correspondiente se le asigna el valor de b a 
                // la variable correspondiente. Se tiene un contador denominado
                // como "cont0" para calcular la media.
                switch (a) {
                    case "D": desayunos += b; suma += b; break;
                    case "A": comidas += b; suma += b; contC++; break;
                    case "M": meriendas += b; suma += b; break;
                    case "I": cenas += b; suma += b; break;
                    case "C": copas += b; suma += b; break;
                    default: break;
                }
                cont0++;
            }
            
            // Se determina el menor y mayor.
            double mayor = Math.max(desayunos, Math.max(comidas, Math.max(meriendas, Math.max(cenas, copas))));
            double menor = Math.min(desayunos, Math.min(comidas, Math.min(meriendas, Math.min(cenas, copas))));

            // Segun cual variable sea la mayor se determina si se repite o no y
            // se aplica el formato correspondiente.
            if (mayor == desayunos) {
                if(desayunos!=comidas && desayunos!=cenas && desayunos!=meriendas && desayunos!=copas) System.out.print("DESAYUNOS#");
                else System.out.print("EMPATE#"); 
            }
            else if(mayor==comidas){
                if(comidas!=desayunos && comidas!=cenas && comidas!=meriendas && comidas!=copas) System.out.print("COMIDAS#");
                else System.out.print("EMPATE#");
            }
            else if(mayor==meriendas){
                if(meriendas!=desayunos && meriendas!=cenas && comidas!=meriendas && meriendas!=copas) System.out.print("MERIENDAS#");
                else System.out.print("EMPATE#");
            }
            else if(mayor==cenas){
                if(cenas!=desayunos && meriendas!=cenas && cenas!=meriendas && cenas!=copas) System.out.print("CENAS#");
                else System.out.print("EMPATE#");
            }
            else if(mayor==copas){
                if(copas!=desayunos && copas!=cenas && copas!=meriendas && meriendas!=copas) System.out.print("COPAS#");
                else System.out.print("EMPATE#");
            }
            
            // Lo mismo pero con el menor.
            if (menor == desayunos) {
                if (desayunos != comidas && desayunos != cenas && desayunos != meriendas && desayunos != copas) System.out.print("DESAYUNOS#");
                else System.out.print("EMPATE#");
            }
            else if(menor==comidas){
                if(comidas!=desayunos && comidas!=cenas && comidas!=meriendas && comidas!=copas) System.out.print("COMIDAS#");
                else System.out.print("EMPATE#");
            }
            else if(menor==meriendas){
                if(meriendas!=desayunos && meriendas!=cenas && comidas!=meriendas && meriendas!=copas) System.out.print("MERIENDAS#");
                else System.out.print("EMPATE#");
            }
            else if(menor==cenas){
                if(cenas!=desayunos && meriendas!=cenas && cenas!=meriendas && cenas!=copas) System.out.print("CENAS#");
                else System.out.print("EMPATE#");
            }
            else if(menor==copas){
                if(copas!=desayunos && copas!=cenas && copas!=meriendas && meriendas!=copas) System.out.print("COPAS#");
                else System.out.print("EMPATE#");
            }
            
            // Calculo de la media
            double media = suma/(double) cont0;
            
            // Se determina si las comidas superan la media
            if (comidas/contC > media) System.out.println("SI");
            else System.out.println("NO");
            
        }
    }
}
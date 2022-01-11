package com.caiomed03.aceptaelreto;


import java.util.ArrayList;
import java.util.Scanner;

public class p440 {
    public static ArrayList grupoMásGrande(int[] a){
        ArrayList<Integer> aa = new ArrayList<Integer>();
        for(int i=1; i<a.length; i++){
            if(a[i]>a[i-1]){
                continue;
            }
            else{
                aa.add(a[i]);
            }
        }
        return aa;
    }

    public static void main(String[] args) {
        int nEscaladores;
        int[] velocidades;
        Scanner sc = new Scanner(System.in);

        nEscaladores = sc.nextInt();
        while (nEscaladores != 0) {
            velocidades = new int[nEscaladores];
            for(int i=0; i<nEscaladores; i++){
                velocidades[i] = sc.nextInt();
            }
            ArrayList<Integer> aa = new ArrayList<Integer>();
            aa = grupoMásGrande(velocidades);
            for(int i=0; i<nEscaladores; i++){
                System.out.println(aa.get(i));
            }
            
            nEscaladores = sc.nextInt();
        }
    }
}

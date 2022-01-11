
package com.caiomed03.aceptaelreto;

import java.util.ArrayList;
import java.util.Scanner;

public class p576 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tiempoQueTardaElPadre = sc.nextInt();
        
        while(tiempoQueTardaElPadre != 0){
            ArrayList<Integer> tiempos = new ArrayList<>();
            
            int tiempo = sc.nextInt();
            
            while(tiempo != 0){
                tiempos.add(tiempo);
                tiempo = sc.nextInt();
            }
            int tiempoTotal = 0;
            for(int i=0; i<tiempos.size(); i++){
                tiempoTotal += tiempoQueTardaElPadre*tiempos.get(i);
            }
            int horas = tiempoTotal/3600;
            tiempoTotal -= horas*3600;
            int minutos = tiempoTotal/60;
            tiempoTotal -= minutos*60;
            int segundos = tiempoTotal;
            
            System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
            tiempoQueTardaElPadre = sc.nextInt();
        }
    }
}

package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class LeyendoElDiccionario {

    public static void main(String[] args) {
        int segundosQueTarda, cantidadDeficiones, tiempoTotal = 0, hora, minuto, seg;
        Scanner sc = new Scanner(System.in);

        segundosQueTarda = sc.nextInt();

        while (segundosQueTarda != 0) {
            cantidadDeficiones = sc.nextInt();
            while (cantidadDeficiones != 0) {
                tiempoTotal += cantidadDeficiones * segundosQueTarda;
                cantidadDeficiones = sc.nextInt();
            }
            if(tiempoTotal>60*60-1){
                hora=tiempoTotal/3600;
                tiempoTotal -= hora*3600;
                minuto = tiempoTotal/60;
                seg = tiempoTotal - minuto*60;
                
            }
            else{
                hora=0;
                if(tiempoTotal>59){
                    minuto = tiempoTotal/60;
                    seg = tiempoTotal%60;
                }
                else{
                    minuto=0;
                    seg = tiempoTotal;
                }
            }
            if (hora > 9) {
                System.out.print(hora + ":");
            } else {
                System.out.print("0" + hora + ":");
            }
            if (minuto > 9) {
                System.out.print(minuto + ":");
            } else {
                System.out.print("0" + minuto + ":");
            }
            if (seg > 9) {
                System.out.print(seg);
            } else {
                System.out.print("0" + seg);
            }
            System.out.print("\n");
            
            tiempoTotal = 0;
            segundosQueTarda = sc.nextInt();
        }
    }
}

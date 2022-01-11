package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p437 {

    public static String CalcularTiempo(int tsegundos) {
        int horas = (tsegundos / 3600);
        int minutos = ((tsegundos - horas * 3600) / 60);
        int segundos = tsegundos - (horas * 3600 + minutos * 60);
        if (segundos < 10) {
            return horas + "" + ":" + minutos + "" + ":" + "0" + segundos + "";
        }
        return horas + "" + ":" + minutos + "" + ":" + segundos + "";
    }

    public static void main(String[] args) {
        int casosPrueba, tiempoAnuncio = 0, tiempo1Dia = 86400, horas, minuto, sec, tiempoRes;
        String[] hora;
        Scanner sc = new Scanner(System.in);

        casosPrueba = sc.nextInt();
        for (int i = 0; i < casosPrueba; i++) {
            hora = sc.next().split(":");

            tiempoAnuncio = Integer.parseInt(hora[0]) * 3600 + Integer.parseInt(hora[1]) * 60 + Integer.parseInt(hora[2]);

            tiempoRes = tiempo1Dia - tiempoAnuncio;

            String res = CalcularTiempo(tiempoRes);
            System.out.println(res);

        }
    }
}

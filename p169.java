package com.caiomed03.aceptaelreto;

import java.util.ArrayList;
import java.util.Scanner;

public class p169 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosPrueba = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < casosPrueba; i++) {
            String s1 = sc.nextLine().toLowerCase();
            ArrayList<String> nombres = new ArrayList<>();
            int participantes = 0;
            int hermanos = 0;
            while (!(s1.equals("===="))) {
                nombres.add(s1);
                s1 = sc.nextLine().toLowerCase();
            }
            int cont = 0;
            for (int k = 0; k < nombres.size(); k++) {
                for (int j = k + 1; j < nombres.size(); j++) {
                    String aux = nombres.get(k).substring(0, nombres.get(k).indexOf(","));
                    if (nombres.get(j).contains(aux)) {
                        cont++;
                    }
                }
            }
            if(cont!=0) cont += 1;
            else cont = 0;
            
            participantes = nombres.size();
            
            System.out.println(participantes + " " + cont);

        }
    }
}

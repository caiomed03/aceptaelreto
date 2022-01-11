package com.caiomed03.aceptaelreto;


import java.util.ArrayList;
import java.util.Scanner;

public class p597 {


    public static int aa(ArrayList numeros) {
        int mayor = (int)numeros.get(0);
        // Recorrer arreglo y ver si no es así
        // (comenzar desde el 1 porque el 0 ya lo tenemos contemplado arriba)
        for (int x = 1; x < numeros.size(); x++) {
            if ((int)numeros.get(x)<  mayor) {
                mayor = (int)numeros.get(x);
            }
        }
        return mayor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosPrueba = sc.nextInt();

        for (int i = 0; i < casosPrueba; i++) {
            int nPersonas = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int j = 0; j < nPersonas; j++) {
                a.add(sc.nextInt());
            }
            int cont=0;
            for(int j=0; a.size()!=1;){
                if(a.get(j)!=aa(a)) cont++;
                a.remove(j);
            }
            System.out.println(cont);
        }
    }
}

package com.caiomed03.aceptaelreto;

import java.util.Arrays;
import java.util.Scanner;

public class p305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int ciudades = sc.nextInt();

            int[] atacantes = new int[ciudades];
            int[] defensores = new int[ciudades];

            for (int i = 0; i < ciudades; i++) {
                atacantes[i] = sc.nextInt();
            }
            for (int i = 0; i < ciudades; i++) {
                defensores[i] = sc.nextInt();
            }

            int cont = 0;
            Arrays.sort(atacantes);
            Arrays.sort(defensores);
            /*
            El algoritmo que había pensado es el siguiente:
            Teniendo los dos LinkedList ya ordenados:
                20 30 40 80
                25 35 40 50   (Extraido de la entrada de ejemplo)
            Para maximizar las ciudades aseguradas hay que enviar a cada ciudad aquel
            equipo cuya diferencia con las tropas enemigas sea la menor posible por
            lo que ordenandolos de forma ascendente ya me garantizo eso.
            Con esto, voy comparando las primeras posiciones de ambos LinkedList
            hasta que el LinkedList de defensores esté vacío, si en la ciudad 0 hay
            más tropas enemigas que tropas defensivas, elimino el primero de defensores
            para comprobar si los siguientes son mayores o iguales. Si son mayores o iguales
            elimino ambos ya que ya no me interesan e incremento el contador porque 1 ciudad
            estará defendida. Así hasta que ya no haya tropas defensivas.
            Se ve mejor con el segundo caso de prueba:
                40 50 60 70
                25 30 50 99 (Ya ordenados)
            La primera tropa defensiva no es mayor o igual que la primera ofensiva por lo que
            no valdrá para las posteriores asi que no interesa y lo elimino quedando asi:
                40 50 60 70
                30 50 99
            Pasa lo mismo que antes:
                40 50 60 70
                50 99
            Aqui si es mayor o igual, asi que quitamos ambos e incrementamos el contador:
                50 60 70
                99
            Igual que antes:
                60 70
                
            Ya no hay mas tropas defensivas asi que se muestra las ciudades aseguradas
            que en este caso son 2.
             */
            for (int i = 0, j = 0; j < defensores.length; i++, j++) {
                if (defensores[j] < atacantes[i]) {
                    i--;
                } else {
                    cont++;
                }
            }
            System.out.println(cont);
        }
    }
}

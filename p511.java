package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p511 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int gruposA = sc.nextInt();
            int gruposB = sc.nextInt();
            ArrayList<Integer> vectorA = new ArrayList<>();
            ArrayList<Integer> vectorB = new ArrayList<>();

            for (int i = 0; i < gruposA; i++) {
                int repeticiones = sc.nextInt();
                int numero = sc.nextInt();
                for (int j = 0; j < repeticiones; j++) {
                    vectorA.add(numero);
                }
            }

            for (int i = 0; i < gruposB; i++) {
                int repeticiones = sc.nextInt();
                int numero = sc.nextInt();
                for (int j = 0; j < repeticiones; j++) {
                    vectorB.add(numero);
                }
            }
            int sum = 0;
            for (int i = 0; i < vectorA.size(); i++) {
                sum += (int) vectorA.get(i) * (int) vectorB.get(i);
            }
            System.out.println(sum);

        }
    }
}

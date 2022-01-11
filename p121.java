package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p121 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int envoltoriosParaChicle;
        int chiclePorEnvoltorio;
        int cantidadEnvoltorios;

        envoltoriosParaChicle = sc.nextInt();
        chiclePorEnvoltorio = sc.nextInt();
        cantidadEnvoltorios = sc.nextInt();

        while (!(envoltoriosParaChicle == 0 && chiclePorEnvoltorio == 0 && cantidadEnvoltorios == 0)) {

            int chiclesASumar = cantidadEnvoltorios / envoltoriosParaChicle * chiclePorEnvoltorio;

            if (chiclePorEnvoltorio >= envoltoriosParaChicle) {
                System.out.println("RUINA");
            } else if (chiclesASumar % envoltoriosParaChicle == 0) {
                chiclesASumar += 1;
                System.out.println(chiclesASumar + cantidadEnvoltorios + " " + (chiclesASumar + cantidadEnvoltorios) % envoltoriosParaChicle);
            } else {
                System.out.println(chiclesASumar + cantidadEnvoltorios + " " + chiclesASumar % envoltoriosParaChicle);
            }

            envoltoriosParaChicle = sc.nextInt();
            chiclePorEnvoltorio = sc.nextInt();
            cantidadEnvoltorios = sc.nextInt();
        }

    }
}

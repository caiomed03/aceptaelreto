package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p390 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosPrueba = sc.nextInt();

        for (int i = 0; i < casosPrueba; i++) {
            int magentaDisp = sc.nextInt();
            int amarilloDisp = sc.nextInt();
            int cianDisp = sc.nextInt();
            String colores = sc.next();
            for (int j = 0; j < colores.length(); j++) {
                if (colores.charAt(j) == 'M') {
                    magentaDisp--;
                } else if (colores.charAt(j) == 'A') {
                    amarilloDisp--;
                } else if (colores.charAt(j) == 'C') {
                    cianDisp--;
                } else if (colores.charAt(j) == 'R') {
                    magentaDisp--;
                    amarilloDisp--;
                } else if (colores.charAt(j) == 'N') {
                    magentaDisp--;
                    amarilloDisp--;
                    cianDisp--;
                } else if (colores.charAt(j)=='V') {
                    amarilloDisp--;
                    cianDisp--;
                }
                else if(colores.charAt(j)=='L'){
                    magentaDisp--;
                    cianDisp--;
                }
            }
            if(magentaDisp<0 || amarilloDisp <0 || cianDisp<0){
                System.out.println("NO");
            }
            else{
                System.out.println("SI "+magentaDisp+" "+amarilloDisp+" "+cianDisp);
            }
        }
    }
}

package com.caiomed03.aceptaelreto;

import java.util.Scanner;

public class p188 {

    public static boolean checker(String[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            String sub1 = a[i].substring(a[i].length()-2, a[i].length());
            String sub2 = a[i+1].substring(0, 2);
            if (!sub1.equals(sub2)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] a = sc.nextLine().split(" ");

            if (a.length == 1) {
                System.out.println("SI");
            } else {
                if(checker(a)){
                    System.out.println("SI");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}

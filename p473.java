
package com.caiomed03.aceptaelreto;

import java.util.ArrayList;
import java.util.Scanner;

public class p473 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int balon = sc.nextInt();
        int pas = sc.nextInt();
        while (!(balon == 0 && pas == 0)) {
            ArrayList<Integer> balones = new ArrayList<>();
            for(int i=1; i<=balon; i++) balones.add(i);
            int i=0;
            while(balones.size()>1){
                i+=pas-1;
                i%=balones.size();
                balones.remove(i);
            }
            System.out.println(balones.get(0));
            balon = sc.nextInt();
            pas = sc.nextInt();
        }
    }
}

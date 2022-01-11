
package com.caiomed03.aceptaelreto;

import java.util.ArrayList;
import java.util.Scanner;

public class p616 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nSonidos = sc.nextInt();
        
        while (nSonidos != 0) {
            ArrayList<String> jugada = new ArrayList<>();
            
            for(int i=0; i<nSonidos; i++){
                jugada.add(sc.next());
            }
            ArrayList<String> aux = new ArrayList<>();
            aux.add("POC");
            jugada.removeAll(aux);
            
            int gol1 = 0;
            int gol2 = 0;
            int contPIC = 0;
            char prev = 'N';
           for(int i=0; i<jugada.size(); i++){
                if(jugada.get(i).equals("PIC")){
                    contPIC++;
                }
                if(jugada.get(i).equals("PONG!") && prev=='N' && contPIC%2==1){
                    gol2++;
                    prev='2';
                    contPIC=0;
                    continue;
                }
                else if(jugada.get(i).equals("PONG!") && prev=='N' && contPIC%2==0){
                    gol1++;
                    prev='1';
                    contPIC = 0;
                    continue;
                }
                if(jugada.get(i).equals("PONG!") && prev=='2' && contPIC%2==1){
                    gol1++;
                    prev='1';
                    contPIC=0;
                    continue;
                }
                else if(jugada.get(i).equals("PONG!") && prev=='2' && contPIC%2==0){
                    gol2++;
                    prev='2';
                    contPIC=0;
                    continue;
                }
                if(jugada.get(i).equals("PONG!") && prev=='1' && contPIC%2==1){
                    gol2++;
                    prev='2';
                    contPIC=0;
                    continue;
                }
                else if(jugada.get(i).equals("PONG!") && prev=='1' && contPIC%2==0){
                    gol1++;
                    prev='1';
                    contPIC=0;
                    continue;
                }
                
            }
            System.out.println(gol1 + " " + gol2);
            nSonidos = sc.nextInt();
        }
    }
}

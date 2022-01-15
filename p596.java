
package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p596 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String s1 = sc.next();
            String res = "";
            
            for(int i=0; i<s1.length()-1; i++){
                if(s1.charAt(i+1)=='.' && s1.charAt(i)!='.' && s1.charAt(i+2)=='.'){
                    res += s1.charAt(i);
                }
            }
            System.out.println(res);
        }
    }
}

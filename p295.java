
package com.caiomed03.aceptaelreto;

import java.math.BigInteger;
import java.util.Scanner;

public class p295 {
    public static BigInteger a(BigInteger x, int n){
        if(n==0 && !x.equals(new BigInteger("0"))){
            return new BigInteger("1");
        }
        else{
            return x.mod(new BigInteger("31543")).multiply(x.pow(n-1).mod(new BigInteger("31543"))).mod(new BigInteger("31543"));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger x;
        x = sc.nextBigInteger();
        int n = sc.nextInt();
    
        while (!(x.equals(new BigInteger("0")) && n==0)) {
            if(n==0 && !x.equals(new BigInteger("0"))){
                System.out.println("1");
            }
            else{
                System.out.println(a(x, n));
            }
            x = sc.nextBigInteger();
            n = sc.nextInt();
        }
    }
}

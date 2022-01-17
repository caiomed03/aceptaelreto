package com.caiomed03.aceptaelreto;

import java.util.Scanner;
import java.util.Stack;

public class p141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            boolean flag = true;
            Stack<Character> a = new Stack<>();
            String s1 = sc.nextLine();
            for (int i = 0; i < s1.length(); i++) {
                if(s1.charAt(i)=='(' || s1.charAt(i)=='[' || s1.charAt(i)=='{'){
                    a.push(s1.charAt(i));
                }
                else if(s1.charAt(i)==')'){
                    if(a.isEmpty()){
                        flag = false;
                        break;
                    }
                    else if(a.peek()=='('){
                        a.pop();
                    }
                    else{
                        flag = false;
                        break;
                    }
                }
                else if(s1.charAt(i)==']'){
                    if(a.isEmpty()){
                        flag = false;
                        break;
                    }
                    else if(a.peek()=='['){
                        a.pop();
                    }
                    else{
                        flag = false;
                        break;
                    }
                }
                else if(s1.charAt(i)=='}'){
                    if(a.isEmpty()){
                        flag = false;
                        break;
                    }
                    else if(a.peek()=='{'){
                        a.pop();
                    }
                    else{
                        flag = false;
                        break;
                    }
                }
                else{
                    continue;
                }
            }
            if(flag && a.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

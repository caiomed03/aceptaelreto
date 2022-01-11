
package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class p598 {
    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
        boolean hasNext() {
            if (st != null && st.hasMoreTokens()) {
                return true;
            }
            String tmp;
            try {
                br.mark(1000);
                tmp = br.readLine();
                if (tmp == null) {
                    return false;
                }
                br.reset();
            } catch (IOException e) {
                return false;
            }
            return true;
        }
    }
    public static void main(String[] args){
        FastReader sc = new FastReader();
        
        while (sc.hasNext()) {
            ArrayList<Integer> tallasJugadores = new ArrayList<>();
            ArrayList<Integer> tallasQueContamos = new ArrayList<>();
            int nTallasJugadores = sc.nextInt();
            int nTallasQueContamos = sc.nextInt();
            
            for(int i=0; i<nTallasJugadores; i++) tallasJugadores.add(sc.nextInt());
            for(int i=0; i<nTallasQueContamos; i++) tallasQueContamos.add(sc.nextInt());
            
            for(int i=0; i<tallasJugadores.size(); i++){
                for(int j=0; j<tallasQueContamos.size(); j++){
                    if((int) tallasJugadores.get(i)==(int)tallasQueContamos.get(j)){
                        tallasJugadores.remove(i);
                        tallasQueContamos.remove(j);
                        i=-1;
                        j=0;
                        break;
                    }
                    else if((int) tallasJugadores.get(i)==(int)tallasQueContamos.get(j)-1){
                        tallasJugadores.remove(i);
                        tallasQueContamos.remove(j);
                        i=-1;
                        j=0;
                        break;
                    }
                }
            }
            if(tallasJugadores.size()==1 && tallasJugadores.get(0)==null) System.out.println("0");
            else System.out.println(tallasJugadores.size());
        }
    }
}

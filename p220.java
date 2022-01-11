package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p220{
    static int C=3;
    static int MAXIMO = 31;
    static int[][] calculadora = new int[C][C];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int casos;
		int a, b;
		int i, j;
		int fila, columna;
		int suma;
		int num;
		boolean salir = false;
		boolean resultado;

		st = new StringTokenizer(br.readLine());
		casos = Integer.parseInt(st.nextToken());
		for (i = 0; i < casos; ++i) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			suma = 0;
			num = b;
			// buscar la posicion del num
			i = 0;
			while (i < C && !salir) {
				j = 0;
				while (j < C && !salir) {
					if (calculadora[i][j] == num) {
						salir = true;
					}
					++j;
				}
				++i;
			}
		}
	}
	public static boolean resuelve(int suma, int num) {
		int fila, columna;
		int i , j;
		boolean salir = false;

		inicializarCalculadora();

		// buscar la posicion del num
		i = 0;
		while (i < C && !salir) {
			j = 0;
			while (j < C && !salir) {
				if (calculadora[i][j] == num) {
					fila = i; columna = j;
					salir = true;
				}
				++j;
			}
			++i;
		}
		/*cout << "Numero - " << calculadora[fila][columna] 
			<< " Fila - " << fila << " Columna - " << columna << "\n";
		*/
		return false;

	}

	static boolean resuelveCaso(int suma,int num, int fila, int columna) {
		int i, j;
		boolean resultado;
		// caso base
		if (suma >= MAXIMO)
			return false;
		i = 0;
		while (i < C) {
			//cout << "i - " << i << "\n";
			j = 0;
			while (j < C) {
				//cout << "j - " << j << "\n";
				if (j == columna 
					&& i != fila)
					if (resuelveCaso(suma + calculadora[i][j], calculadora[i][j], i, j))
						return false;
				if (i == fila 
					&& j != columna)
					if (resuelveCaso(suma + calculadora[i][j], calculadora[i][j], i, j))
						return false;
				++j;
			}
			++i;
		}
		return true;
	}

	static void inicializarCalculadora() {
		/*{7,8,9,
		   4,5,6,
		   1,2,3};*/

		int num = 9;
		for (int i = 0; i < C; ++i) {
			for (int j = C - 1; j >= 0; --j) {
				calculadora[i][j] = num;
				--num;
			}
		}
	}
}
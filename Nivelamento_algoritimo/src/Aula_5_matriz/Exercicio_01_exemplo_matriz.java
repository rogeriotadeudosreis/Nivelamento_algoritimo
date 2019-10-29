package Aula_5_matriz;

//Ler uma matriz de 5x5 e descobrir a diagonal principal.

import java.util.Scanner;

public class Exercicio_01_exemplo_matriz {

	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		int linha = 3, coluna = 3;
		int[][] matriz = new int[linha][coluna];
		int i, j;

		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++) {
				System.out.printf("Digite o valor [%d , %d] :", i, j);
				matriz[i][j] = teclado.nextInt();
			}

		}
		System.out.println("Elementos da diagonal principal");
		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++) {

				// esse if abaixo testa se o índice da linha é igual ao da coluna
				// caso verdadeiro, é um elemento da diagonal principal
				// e o imprime os valores

				if (i == j) {
					System.out.printf("Elemento [%d , %d] : %d\n", i, j, matriz[i][j]);
				}
			}

		}

		teclado.close();
	}
}

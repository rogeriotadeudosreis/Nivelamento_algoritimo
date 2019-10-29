package Aula_5_matriz;

//Escrever um programa que leia valores para uma matriz de 6x6
//Calcule a média dos elementos
//Em seguida, percorre a matriz, escrevendo todos os elementos maiores do que a média

import java.util.Scanner;

public class Exercicio_02_exemplo_matriz {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int linha = 3, coluna = 3;
		int matrizB[][] = new int[linha][coluna];
		int i, j, soma = 0, media = 0;

		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++) {
				System.out.printf("Digite o valor [%d,%d] :", i, j);
				matrizB[i][j] = teclado.nextInt();
				soma += matrizB[i][j];

			}
		}
		media = soma / (linha * coluna);
		System.out.println("");
		System.out.printf("A média dos elementos é: %d\n\n", media);

		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++) {

				if (matrizB[i][j] > media) {

					System.out.printf("O elemento maior do que a média é [%d,%d] = %d\n", i, j, matrizB[i][j]);
				}

			}
		}

		teclado.close();
	}
}

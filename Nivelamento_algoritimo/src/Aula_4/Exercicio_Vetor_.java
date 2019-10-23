package Aula_4;

import java.util.Scanner;

public class Exercicio_Vetor_ {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i;
		int vetorA[] = new int[5];
		int vetorB[] = new int[5];
		double vetorC[] = new double[5];

		for (i = 0; i < vetorA.length; i++) {
			System.out.print("Digite um valor inteiro para o vetor A:");
			vetorA[i] = teclado.nextInt();

		}

		System.out.println("-----------------------------------------");

		for (i = 0; i < vetorB.length; i++) {
			System.out.print("Digite um valor inteiro para o vetor B:");
			vetorB[i] = teclado.nextInt();

		}
		System.out.println("-----------------------------------------");

		for (i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}

		for (i = 0; i < vetorA.length; i++) {
			System.out.printf("Na posição %d do vetorA - Temos o valor: %d\n", i, vetorA[i]);
		}
		System.out.println("-----------------------------------------");
		for (i = 0; i < vetorB.length; i++) {
			System.out.printf("Na posição %d do vetorB - Temos o valor: %d\n", i, vetorB[i]);
		}

		System.out.println("-----------------------------------------");
		for (i = 0; i < vetorC.length; i++) {
			System.out.printf("A soma dos elementos dos vetores A e B na posição %d é: %d + %d = %.2f\n", i, vetorA[i],
					vetorB[i], vetorC[i]);
		}

		System.out.println("------------------------------------------");
		for (i = 0; i < vetorC.length; i++) {
			if (vetorC[i] % 2 == 0) {
				System.out.printf("Na posição: %d encontramos o número par: %.2f\n", i, vetorC[i]);

			}
		}
		teclado.close();
	}
}

package Aula_5_matriz;

//Escreva um programa que leia um vetor(ou matriz) com o gabarito de uma valiação com 30 questões.
//Em seguida o programa deverá ler as respostas dos 50 alunos, sendo que a primeira leitura será a
//matrícula do aluno e na sequencia deverá ser lido as suas respostas para as questões.
//O programa deverá imprimir a quantidade de acertos de cada candidato.

import java.util.Scanner;

public class Exercicio_03_exemplo_matriz {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int qtdeQuestoes = 5;// enunciado pede 50 alunos
		int qtdeAlunos = 3;// enunciado pede 30 questões

		String[][] gabarito = new String[1][qtdeQuestoes];
		int[][] matricula = new int[qtdeAlunos][1];
		String[][] respostas = new String[qtdeAlunos][qtdeQuestoes];
		int[][] acertos = new int[qtdeAlunos][1];
		int i, j;
		int qtdeAcerto = 0;

		// abaixo o laço é para a leitura do gabarito
		System.out.printf("-----Leitura do Gabarito-----\n");
		for (i = 0; i < qtdeQuestoes; i++) {
			System.out.printf("Questão %d: ", i + 1);
			gabarito[0][i] = teclado.next();
		}
		System.out.println();
		// laço para a leitura das respostas dos alunos
		System.out.println("-----Leitura das Respostas-----");
		System.out.println("");
		// laço para a leitura da matrícula do aluno
		for (i = 0; i < qtdeAlunos; i++) {
			System.out.printf("Matrícula do %do aluno: ", i + 1);
			matricula[i][0] = teclado.nextInt();

			qtdeAcerto = 0;

			System.out.println("");
			for (j = 0; j < qtdeQuestoes; j++) {
				System.out.printf("Resposta %d: ", j + 1);
				respostas[i][j] = teclado.next();

				// Verifrica se acertou as questões
				if (respostas[i][j].equalsIgnoreCase(gabarito[0][j])) {
					qtdeAcerto++;
				}

			}
			// Armazena os acertos do aluno em questão
			acertos[i][0] = qtdeAcerto;
			
			System.out.printf("O aluno da matrícula: %d acertou: %d questão(es).\n", matricula[i][0], acertos[i][0]);
			System.out.println("");
		}
		System.out.println("Fim do Programa.");
		teclado.close();
	}
}

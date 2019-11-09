package Aula_5_matriz;

import java.util.Scanner;
public class Exercicio_44_Vetores_alteracoes {

public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);

	int i, menor = 0, maior = 0, posicaoMenor = 0, posicaoMaior = 0, aux;
	int[] vetor = new int[10];
	boolean achou;

	for (i = 0; i < vetor.length; i++) {
		
		
		
		do{
			System.out.printf("Digite o %do número para ser armazenado no vetor[i]:", (i + 1));
			aux = teclado.nextInt();
			achou = false;
			for (int j=0; j<=i; j++){
				if(vetor[j] == aux){
					System.out.println("O número que digitou já existe no vetor");
					achou = true;
				}
			}
		
		}while(achou);
		
		vetor[i] = aux;

		if (i == 0) {
			menor = vetor[i];
			maior = vetor[i];
		}
		if (vetor[i] < menor) {
			menor = vetor[i];
			posicaoMenor = i;

		}
		if (vetor[i] > maior) {
			maior = vetor[i];
			posicaoMaior = i;
		}

	}
	System.out.println();
	System.out.println("----------- RESULTADO SOLICITADO ----------\n");
	System.out.printf("O menor elemento do vetor é %d na posição [%d]\n", menor, posicaoMenor);
	System.out.printf("O maior elemento do vetor é %d na posição [%d]\n", maior, posicaoMaior);
	teclado.close();
}
}

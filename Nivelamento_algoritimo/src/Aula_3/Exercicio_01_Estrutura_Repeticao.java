package Aula_3;

import java.util.Scanner;

public class Exercicio_01_Estrutura_Repeticao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int sexo, sexo_maior_altura, sexo_menor_altura, cont_homem, cont_mulher, resp;
		double altura, media_alt_homem, media_alt_mulher, maior_alt, menor_alt, soma_alt_homem, soma_alt_mulher;
		int cont = 1;
		
		sexo_maior_altura = 0;
		sexo_menor_altura = 0;
		maior_alt = 0;
		menor_alt = 0;
		soma_alt_mulher = 0;
		cont_mulher = 0;
		soma_alt_homem = 0;
		cont_homem = 0;
		resp = 1;

		while (resp != 2) {

			do {
				System.out.print("Usuário, digite o sexo 1 (Masc) ou 2 (Fem):");
				sexo = entrada.nextInt();
				if (sexo != 1 && sexo != 2)
					System.out.print("Sexo inválido !");
			} while (sexo != 1 && sexo != 2);

			System.out.print("Agora digite a altura:");
			altura = entrada.nextDouble();

			if (cont == 1) {
				maior_alt = altura;
				menor_alt = altura;
				sexo_maior_altura = sexo;
				sexo_menor_altura = sexo;

			}
			if (altura > maior_alt) {
				maior_alt = altura;
				sexo_maior_altura = sexo;

			}
			if (altura < menor_alt) {
				menor_alt = altura;
				sexo_menor_altura = sexo;
			}

			if (sexo == 1) {
				cont_homem++;
				soma_alt_homem += altura;

			} else {
				cont_mulher++;
				soma_alt_mulher += altura;

			}

			System.out.println("Quer continuar ? 1 (Sim) ou 2 (Não)");
			resp = entrada.nextInt();
			cont++;
		}

		media_alt_homem = soma_alt_homem / cont_homem;
		media_alt_mulher = soma_alt_mulher / cont_mulher;
		System.out.printf("Média das altura dos homens é: %.2f\n", media_alt_homem);
		System.out.printf("Média das altura das mulheres é: %.2f\n", media_alt_mulher);
		System.out.println();
		System.out.printf("A maior altura é: %.2f, do sexo %d\n", maior_alt, sexo_maior_altura);
		System.out.printf("A menor altura é: %.2f, do sexo %d\n", menor_alt, sexo_menor_altura);

		entrada.close();
	}
}

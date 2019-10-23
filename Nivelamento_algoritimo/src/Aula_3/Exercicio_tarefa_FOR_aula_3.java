package Aula_3;

import java.util.Scanner;

public class Exercicio_tarefa_FOR_aula_3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String nome = "";
		double salariobruto = 0;
		int numdependentes;
		double salariofamilia = 9.58;
		double totalsalariofamilia = 0;
		double salarioliquido;
		double aliqINSS1 = 0.08;
		double aliqINSS2 = 0.09;
		double aliqINSS3 = 0.10;
		double aliqIRRF1 = 0.15;
		double aliqIRRF2 = 0.25;
		double impostoINSS = 0;
		double impostoIRRF = 0;
		int cont;

		for (cont = 1; cont <= 2; cont++) {

			System.out.printf("Digite o nome do %d.o funcionário:", cont);
			nome = teclado.nextLine();
			System.out.printf("O salário bruto do %s é:", nome);
			salariobruto = teclado.nextDouble();
			System.out.printf("Número de dependentes:");
			numdependentes = teclado.nextInt();
			teclado.nextLine();

			if (salariobruto > 0 && salariobruto <= 300) {
				totalsalariofamilia = numdependentes * salariofamilia;
				impostoINSS = salariobruto * aliqINSS1;
				impostoIRRF = salariobruto * aliqIRRF1;

			} else if (salariobruto > 300 && salariobruto <= 500) {
				totalsalariofamilia = numdependentes * salariofamilia;
				impostoINSS = salariobruto * aliqINSS2;
				impostoIRRF = salariobruto * aliqIRRF1;

			} else if (salariobruto > 500 && salariobruto <= 600) {
				totalsalariofamilia = numdependentes * salariofamilia;
				impostoINSS = salariobruto * aliqINSS2;
				impostoIRRF = salariobruto * aliqIRRF2;

			} else {
				totalsalariofamilia = numdependentes * salariofamilia;
				impostoINSS = salariobruto * aliqINSS3;
				impostoIRRF = salariobruto * aliqIRRF2;

			}

			salarioliquido = (salariobruto + totalsalariofamilia) - (impostoINSS + impostoIRRF);
			System.out.println();
			System.out.printf(
					"Nome do funcionário: %s\nSalário bruto: %.2f\nINSS: %.2f\nIRRF: %.2f\nValor total do salário família: %.2f\nSalário líquido: %.2f\n\n",
					nome, salariobruto, impostoINSS, impostoIRRF, totalsalariofamilia, salarioliquido);
		}
		teclado.close();
	}
}

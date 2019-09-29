package Aula_2;

import java.util.Scanner;

public class Pulverizacao {

	public static void main(String[] args) {

		String nome;
		double fixo_min = 1750.00;
		double area;
		double valor_area = 0;
		double total_pagar = 0;
		double tipo1 = 5.00;
		double tipo2 = 10.00;
		double tipo3 = 15.00;
		double tipo4 = 25.00;
		char tipo;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do fazendeiro:");
		nome = teclado.nextLine();
		System.out.println(
				"Digite o tipo de puverização:\n1 - Contra ervas daninhas\n2 - Contra gafanhotos\n3 - Contra broca\n4 - Contra as três pragas"
						+ " ");
		tipo = teclado.next().charAt(0);
		System.out.println("Digite a área a ser pulverizada:");
		area = teclado.nextDouble();

		switch (tipo) {
		case '1':
			valor_area = area * tipo1;
			break;
		case '2':
			valor_area = area * tipo2;
			break;
		case '3':
			valor_area = area * tipo3;
			break;
		case '4':
			valor_area = area * tipo4;
			break;

		default: {
			System.out.println("Tipo de pulverização inválida.");
			break;
		}
		}
		if (area > 300) {
			total_pagar = valor_area * 0.95;
		} else {
			total_pagar = valor_area;

		}
		if (total_pagar > fixo_min) {
			total_pagar = total_pagar - ((total_pagar - fixo_min) * 0.10);

		} else {
			total_pagar = valor_area;
		}

		System.out.printf("O fazendeiro %s, pagará R$ %4.2f pelo serviço de pulverização. ", nome, total_pagar);
		teclado.close();
	}
}

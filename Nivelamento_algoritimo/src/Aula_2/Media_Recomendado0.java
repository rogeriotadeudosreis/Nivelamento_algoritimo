package Aula_2;

import java.util.Scanner;

public class Media_Recomendado0 {

	public static void main(String[] args) {

		double media;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a media do estudante:");
		media = teclado.nextDouble();
		if (media > 10.0 || media < 0) {
			System.out.print("Nota INVÁLIDA.");
			return;
		}
		if (media >= 9.0) {

			System.out.println("Altamente recomendado.");
		} else if (media >= 8.0 && media < 9.0) {
			System.out.println("Fortemente recomendado.");
		} else if (media >= 7.0 && media < 8.0) {
			System.out.println("Recomendado.");
		} else {
			System.out.println("Não recomendado.");
		}
	}
}

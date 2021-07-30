package ExerciciosAula17;

import java.util.Scanner;

/*Altere o programa anterior permitindo ao usuário informar as
populações e as taxas de crescimento iniciais. Valide a entrada e
permita repetir a operação.*/

public class Ex05 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String continuar = "";
		do {

			System.out.println("Digite o país A: ");
			String paisA = scan.next();
			System.out.println("Digite a população:");
			double populacaoA = scan.nextDouble();
			System.out.println("Digite a taxa de crescimento anual:");
			Double taxaA = scan.nextDouble();

			System.out.println("Digite o país B: ");
			String paisB = scan.next();
			System.out.println("Digite a população:");
			double populacaoB = scan.nextDouble();
			System.out.println("Digite a taxa de crescimento anual:");
			Double taxaB = scan.nextDouble();

			int cont = 0;
			boolean crescimentoValido = false;
			while (crescimentoValido == false) {

				if (populacaoA <= populacaoB) {
					populacaoA = (populacaoA / 100) * taxaA + populacaoA;
					populacaoB = (populacaoB / 100) * taxaB + populacaoB;
				} else {
					crescimentoValido = true;
				}
				cont++;

			}
			System.out.println(cont + " Anos");

			System.out.println("Digite s para continuar:");
			continuar = scan.next();
		} while (continuar.equalsIgnoreCase("s"));

	}

}

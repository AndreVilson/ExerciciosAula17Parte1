package ExerciciosAula17;

import java.util.Scanner;

/*Supondo que a população de um país A seja da ordem de 80000
habitantes com uma taxa anual de crescimento de 3% e que a
população de B seja 200000 habitantes com uma taxa de crescimento
de 1.5%. Faça um programa que calcule e escreva o número de anos
necessários para que a população do país A ultrapasse ou iguale a
população do país B, mantidas as taxas de crescimento.*/

public class Ex04 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o país A: ");
		String paisA = scan.next();
		System.out.println("Digite a população:");
		double populacaoA = scan.nextDouble();
		Double taxaA = 0.03;

		System.out.println("Digite o país B: ");
		String paisB = scan.next();
		System.out.println("Digite a população:");
		double populacaoB = scan.nextDouble();
		Double taxaB = 0.015;

		int cont = 0;
		boolean crescimentoValido = false;
		while (crescimentoValido == false) {

			if (populacaoA <= populacaoB) {
				populacaoA = (populacaoA * taxaA) + populacaoA;
				populacaoB = (populacaoB * taxaB) + populacaoB;
			} else {
				crescimentoValido = true;
			}
			cont++;

		}
		System.out.println(populacaoA + ": " + paisA);
		System.out.println(populacaoB + ": " + paisB);
		System.out.println(cont + " Anos");

	}

}

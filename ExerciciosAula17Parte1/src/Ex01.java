package ExerciciosAula17;

import java.util.Scanner;

/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido.*/

public class Ex01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean notaValida = false;

		while (!notaValida){

			System.out.println("Entre com uma Nota de 0 a 10:");
			double nota = scan.nextInt();

			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Você digitou a nota:" + nota);

			} else {
				// notaValida = false
				System.out.println("Nota inválida, digite novamente.");
			}

		} 

	}

}

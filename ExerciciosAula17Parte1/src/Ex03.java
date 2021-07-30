package ExerciciosAula17;

import java.util.Scanner;

/*Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';*/

public class Ex03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String nome = "";
		int idade = 0;
		double salario = 0;
		String sexo = "";
		String estadoCivil = "";

		boolean nomeValido = false;
		while (nomeValido == false) {

			System.out.println("Nome: maior que 3 caracteres");
			 nome = scan.next();

			if (nome.length() > 3) {
				nomeValido = true;
			} else {
				System.out.println("Valor Inválido!");

			}
		}

		boolean idadeValida = false;
		while (idadeValida == false) {

			System.out.println("Idade: entre 0 e 150");
			idade = scan.nextInt();
			if (idade >= 0 && idade <= 150) {
				idadeValida = true;
			} else {
				System.out.println("Valor Inválido!");
			}
		}

		boolean salarioValido = false;
		while (salarioValido == false) {
			System.out.println("Salário: maior que zero");
			 salario = scan.nextDouble();
			if (salario > 0) {
				salarioValido = true;
			} else {
				System.out.println("Valor Inválido!");
			}
		}

		boolean sexoValido = false;
		while (sexoValido == false) {
			System.out.println("Sexo: 'f' ou 'm'");
			sexo = scan.next();
			if (sexo.equalsIgnoreCase("f")) {
				sexoValido = true;
				sexo = "Feminino";
			} else if (sexo.equalsIgnoreCase("M")) {
				sexoValido = true;
				sexo = "Masculino";
			} else {
				System.out.println("Valor Inválido");
			}
		}

		boolean estadoCivilValido = false;
		while (estadoCivilValido == false) {

			System.out.println("Estado Civil: 's' 'c' 'v' 'd'");
			 estadoCivil = scan.next();

			switch (estadoCivil) {

			case "s":
				estadoCivilValido = true;
				estadoCivil = "Solteiro";
				break;
			case "c":
				estadoCivilValido = true;
				estadoCivil = "Casado";
				break;
			case "v":
				estadoCivilValido = true;
				estadoCivil = "Viúvo";
				break;
			case "d":
				estadoCivilValido = true;
				estadoCivil = "Divorciado";
				break;
			case "S":
				estadoCivilValido = true;
				estadoCivil = "Solteiro";
				break;
			case "C":
				estadoCivilValido = true;
				estadoCivil = "Casado";
				break;
			case "V":
				estadoCivilValido = true;
				estadoCivil = "Viúvo";
				break;
			case "D":
				estadoCivilValido = true;
				estadoCivil = "Divorciado";
				break;
			default:
				System.out.println("Valor Inválido!");
			}
		}
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário:" + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
	}

}

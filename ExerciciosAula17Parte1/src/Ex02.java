package ExerciciosAula17;

import java.util.Scanner;

/*Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações.*/

public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		
		boolean senhaValida = false;
		
		

		while (senhaValida == false){

			System.out.println("Digite usuário:");
			String usuario = scan.next();
			
			System.out.println("Digite a senha:");
			String senha = scan.next();

			if (!usuario.equals(senha)) {
				senhaValida = true;
				System.out.println(" senha e usuario ok:");
				
			} else {
				// notaValida = false
				System.out.println("senha inválida, digite novamente.");
			}

		} 

	}

}
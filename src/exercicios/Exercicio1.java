package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua senha: ");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inválida");
			System.out.print("Digite sua senha: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");		
		
		sc.close();

	}

}

package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		System.out.print("Informe o c�digo de combust�vel de sua prefer�ncia: ");
		int tipoCombustivel = sc.nextInt();

		/*
		 * while (tipoCombustivel != 4) { switch (tipoCombustivel) { case 1: alcool +=
		 * 1; System.out.print("Informe o c�digo de combust�vel de sua prefer�ncia: ");
		 * tipoCombustivel = sc.nextInt(); break; case 2: gasolina += 1;
		 * System.out.print("Informe o c�digo de combust�vel de sua prefer�ncia: ");
		 * tipoCombustivel = sc.nextInt(); break; case 3: diesel += 1;
		 * System.out.print("Informe o c�digo de combust�vel de sua prefer�ncia: ");
		 * tipoCombustivel = sc.nextInt(); break;
		 * 
		 * default:
		 * System.out.print("Valor informado n�o existe, informe novamente o c�digo: ");
		 * tipoCombustivel = sc.nextInt(); break; } }
		 */

		while (tipoCombustivel != 4) {
			if (tipoCombustivel == 1) {
				alcool += 1;
			} else if (tipoCombustivel == 2) {
				gasolina += 1;
			} else if (tipoCombustivel == 3) {
				diesel += 1;
			} 
			System.out.println("Informe o c�digo de combust�vel de sua prefer�ncia: ");
			tipoCombustivel = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO!");
		System.out.println("Quantidade de clientes que abasteceram cada tipo de combust�vel:");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();

	}

}

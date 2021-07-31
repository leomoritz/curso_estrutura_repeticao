package exerciciosFor;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int fatorial = 1;
		System.out.print("Informe o número fatorial: ");
		int n = sc.nextInt();

		for (int i = 1; n >= i; i++) {
			
			fatorial = fatorial * i;
		}

		System.out.printf("Fatorial de %d é: %d", n, fatorial);

		sc.close();

	}

}

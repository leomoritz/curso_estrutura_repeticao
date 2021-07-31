package exerciciosFor;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um número para obter seus divisores: ");
		int n = sc.nextInt();

		System.out.printf("Os divisores de %d são:\n", n);
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}

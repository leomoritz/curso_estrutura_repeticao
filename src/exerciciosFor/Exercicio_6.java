package exerciciosFor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de vezes que quer dividir: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Informe o numerador para divisão: ");
			int numerador = sc.nextInt();
			System.out.print("Informe o denominador para divisão: ");
			int denominador = sc.nextInt();

			if (denominador == 0) {
				System.out.println("Divisão impossível!\n\n");
			} else {
				double resultado = (double) numerador / denominador;
				System.out.printf("%.1f\n\n", resultado);

			}

		}

		sc.close();

	}

}

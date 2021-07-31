package exerciciosFor;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de números inteiros:");
		int qtd, in = 0, out = 0;

		qtd = sc.nextInt();

		for (int i = 0; i <= qtd; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();

	}

}

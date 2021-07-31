package exerciciosFor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double mediaPonderada = 0;

		System.out.print("Informe o número de casos: ");
		int numCasos = sc.nextInt();

		for (int i = 0; i < numCasos; i++) {
			System.out.println("Informe 3 notas: ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();

			mediaPonderada = ((x * 2) + (y * 3) + (z * 5)) / 10;
			// mediaPonderada = (x * 2.0 + y * 3.0 + z * 5.0) / 10.0;
			System.out.printf("A média ponderada é: %.1f\n\n", mediaPonderada);

		}

		sc.close();

	}

}

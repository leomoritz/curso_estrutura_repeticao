package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a coordenada X: ");
		int coordenadaX = sc.nextInt();
		System.out.print("Digite a coordenada Y: ");
		int coordenadaY = sc.nextInt();

		while (coordenadaX != 0 && coordenadaY != 0) {
			if (coordenadaX > 0 && coordenadaY > 0) {
				System.out.println("Primeiro");
			} else if (coordenadaX < 0 && coordenadaY < 0) {
				System.out.println("Terceiro");
			} else if (coordenadaY < 0) {
				System.out.println("Quarto");
			} else {
				System.out.println("Segundo");
			}

			System.out.print("Digite a coordenada X: ");
			coordenadaX = sc.nextInt();
			System.out.print("Digite a coordenada Y: ");
			coordenadaY = sc.nextInt();
		}
		
		System.out.println("Fim programa!");

		sc.close();

	}

}

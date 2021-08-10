package ExerciciosAula17;

import java.util.Scanner;

/*Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que
calcule o valor de H com N termos.*/

public class Ex50 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor de n:");
		int n = scan.nextInt();

		double soma = 0;
		double j = 1;

		for (int i = 1; i <= n; i++) {

			System.out.print(" 1/" + i);
			soma += 1 / j;
			j++;
		}

		System.out.println("\nSoma = " + soma);

	}

}

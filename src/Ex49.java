package ExerciciosAula17;

import java.util.Scanner;

/*Faça um programa que mostre os n termos da Série a seguir:
S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
Imprima no final a soma da série.*/

public class Ex49 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite número do termo da série");
		int n = scan.nextInt();

		double soma = 0;
		double k = 1;

		for (int i = 1, j = 1; i <= n; i++, j += 2) {

			System.out.print(i + "/" + j + " + ");
			soma += k / j;
			k++;
		}

		System.out.println("\nSoma = " + soma);

	}

}

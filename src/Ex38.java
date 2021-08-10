package ExerciciosAula17;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Um funcionário de uma empresa recebe aumento salarial anualmente:
Sabe-se que:
. Esse funcionário foi contratado em 1995, com salário inicial de
R$ 1.000,00;
a. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
b. A partir de 1997 (inclusive), os aumentos salariais sempre
correspondem ao dobro do percentual do ano anterior. Faça um
programa que determine o salário atual desse funcionário. Após	 
concluir isto, altere o programa permitindo que o usuário digite o
salário inicial do funcionário.*/

public class Ex38 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o ano de inicio");
		int anoInicio = scan.nextInt();
		System.out.println("Digite o o sálario ínicial");
		double salarioInicial = scan.nextDouble();
		System.out.println("Digite o aumento inicial");
		double aumentoInicial = scan.nextDouble();
		System.out.println("Digite o ano atual");
		int anoAtual = scan.nextInt();
		double salarioAtual = 0;
		DecimalFormat format = new DecimalFormat("###,###.##");

		for (int i = anoInicio; i < anoAtual; i++) {

			salarioAtual = (salarioInicial / 100 * aumentoInicial) + salarioInicial;
			salarioInicial = salarioAtual;
			aumentoInicial += aumentoInicial;
			System.out.println("salario atual " + format.format(salarioAtual));
		}

	}

}

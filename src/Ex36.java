package ExerciciosAula17;

import java.util.Scanner;

/*Desenvolva um programa que faça a tabuada de um número qualquer
inteiro que será digitado pelo usuário, mas a tabuada não deve
necessariamente iniciar em 1 e terminar em 10, o valor inicial e final
devem ser informados também pelo usuário*/

public class Ex36 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o número da tabuada");
		int tabuada = scan.nextInt();
		int inicioTabuada = 0;
		int finalTabuada = 0;

				
				
       boolean entradaValida = true;
		
		while (entradaValida) {

		System.out.println("Digite o ínicio da tabuada");
		inicioTabuada = scan.nextInt();

		System.out.println("Digite o final da tabuada");
		finalTabuada = scan.nextInt();
	
			if (inicioTabuada > finalTabuada) {
				System.out.println("inicio maior que final");
				
			}else {
				entradaValida = false;
			}
			
		}

		System.out.println("Montar a tabuada de: " + tabuada);
		System.out.println("Começar por: " + inicioTabuada);
		System.out.println("Terminar em: " + finalTabuada);
		System.out.println("");

		System.out.println("Vou montar a tabuada de " + tabuada + " começando em " + inicioTabuada
				+ " e terminando em :" + finalTabuada);

		for (int i = inicioTabuada; i <= finalTabuada; i++) {

			int resultado = tabuada * i;
			System.out.println(tabuada + " x " + i + " = " + resultado);

		}

	}

}

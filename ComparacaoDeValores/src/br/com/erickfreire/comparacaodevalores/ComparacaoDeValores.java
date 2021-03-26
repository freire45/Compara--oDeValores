package br.com.erickfreire.comparacaodevalores;

import java.util.Scanner;

/**
 * Programa em Java que compara dois valores
 * @author Erick Freire
 * @version 1 - Criado em 25-03-2021 as 23:28
 */

public class ComparacaoDeValores {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.print("Digite o primeiro valor: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		numero2 = entrada.nextInt();
		
		if(numero1 == numero2)
			System.out.printf("%d == %d%n", numero1, numero2);
		
		if(numero1 != numero2)
			System.out.printf("%d != %d%n", numero1, numero2);
		
		if(numero1 < numero2)
			System.out.printf("%d < %d%n", numero1, numero2);
		
		if(numero1 > numero2)
			System.out.printf("%d > %d%n", numero1, numero2);
		
		if(numero1 <= numero2)
			System.out.printf("%d <= %d%n", numero1, numero2);
		
		if(numero1 >= numero2)
			System.out.printf("%d >= %d%n", numero1, numero2);
	}

}

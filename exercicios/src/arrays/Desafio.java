package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas Notas: ");
		
		int qtdeNotas = entrada.nextInt();
		
		double[] notas = new double[qtdeNotas];
		
		//System.out.println(notas[3]);
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextInt();
		}
		
		System.out.println(Arrays.toString(notas));

		entrada.close();
	}
}
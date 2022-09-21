package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, pos;
		double maior;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		maior = vect[0];
		pos = 0;
		
		for (int i=0; i<n; i++) {
			if (vect[i] > maior) {
				maior = vect[i];
				pos = i;
			}
		}
		
		System.out.println();
		System.out.printf("MAIOR VALOR = %.1f%n", maior);
		System.out.println("POSICAO DO MAIOR VALOR = " + pos);
		
		sc.close();

	}

}

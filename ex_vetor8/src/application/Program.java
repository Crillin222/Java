package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, npares;
		double soma, media;
		
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n= sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		soma = 0;
		media = 0;
		npares = 0;
		
		for (int i=0; i<n; i++) {	
			if (vect[i] % 2 == 0) {
				soma = soma + vect[i];
				npares = npares + 1;
			}
		}
		
		media = soma / npares;
		
		if (soma == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			System.out.printf("MEDIA DOS PARES = %.1f%n", media);
		}
		
		sc.close();

	}

}

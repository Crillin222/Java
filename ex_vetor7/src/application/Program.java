package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma=0, media;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			soma = soma + vect[i];
		}
		
		media = soma / n;
		System.out.printf("MEDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		
		for (int i=0; i<n; i++) {
			if (vect[i] < media) {
				System.out.println(vect[i]);
			}
		}
		
		
		
		
		
		
		
		sc.close();		
	}

}

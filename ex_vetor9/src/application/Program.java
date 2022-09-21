package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, cont, velh;
		String velho = null;
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		cont = 0;
		velh = 0;
		
		for (int i=0; i<n; i++) {
			cont = cont + 1;
			System.out.println("Dados da " + cont + "a pessoa: ");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			if (idade[i] > velh) {
				velh = idade[i];
				velho = nome[i];
			}
		}
		
		System.out.print("PESSOA MAIS VELHA: " + velho);
		
		
		
		
		
		sc.close();

	}

}

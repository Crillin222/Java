package application;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		// Cadastro
		
		System.out.printf("Enter account number: ");
		int numero = sc.nextInt();
		
		System.out.printf("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.printf("Is there a initial deposit (y/n)? ");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 'y') {
			System.out.printf("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			conta = new Conta(name, numero, initialDeposit);
		}
		else {
			conta = new Conta(name, numero);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		conta.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		conta.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(conta);
		
		
		
		sc.close();

	}

}

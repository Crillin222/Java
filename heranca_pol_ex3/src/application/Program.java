package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//STANCING LIST
		List<TaxPayer> list = new ArrayList<>();
		
		//READING NUMBER OF TAX PAYERS
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		//READING TAX PAYERS DATA
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char asnw = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.print("Anual income: ");
			double annualIncome = sc.nextDouble();
			if (asnw == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, annualIncome, healthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				int employee = sc.nextInt();
				list.add(new Company(name, annualIncome, employee));
			}
		}
		
		double sum = 0.0;
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer TaxPayer : list) {
			System.out.printf("Name: $ %.2f\n", TaxPayer.tax());
			sum = sum + TaxPayer.tax();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f\n " + sum);
		
		
		sc.close();

	}

}

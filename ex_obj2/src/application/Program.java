package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.printf("Name: ");
		employee.name = sc.nextLine();
		
		System.out.printf("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.printf("Tax: ");
		employee.tax = sc.nextDouble();
		System.out.println();
		
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.printf("Wich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.printf("Updated data: " + employee);
		
		
		
		
		sc.close();

	}

}

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//CREATING THE EMPLOYEE LIST
		List<Employee> list = new ArrayList<>();
		
		
		//READING NUMBER OF EMPLOYEES
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		//READING EMPLOYEES DATA
		for (int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char asnw = sc.next().charAt(0);
			System.out.print("Name: ");
			//NEXT LINE TO CONSUME THE PENDING LINE BREAK
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			//CHEKING IF THE EMPLOYEE IS OUTSOURCED
			if (asnw == 'y') {
				System.out.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				//STANCING OUTSOURCEDEMPLOYEE INSIDE LIST ADD
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else {
				//STANCING EMPLOYEE INSIDE LIST ADD
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		//PRINTING EMPLOYEES NAMES AND PAYMENT
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		
		
		sc.close();
		

	}

}

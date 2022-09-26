package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//para salvar a data
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//entrando com dados
		System.out.println("Enter department's name: ");
		String departmentName = sc.nextLine();
		
		System.out.println("Enter worker data:");
		System.out.println("Name: ");
		String workerName = sc.nextLine();
		
		System.out.println("Level: ");
		String workerLevel = sc.nextLine();
		
		System.out.println("Base salary: ");
		Double baseSalary = sc.nextDouble();
		
		//instanciando trabalhador
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		//lendo quantidade de contratos
		System.out.println("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		//for para cada contrato
		for (int i=1; i<=n; i++) {
			System.out.println("Enter contract #" + i + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			//lendo data
			Date contractDate = sdf.parse(sc.next());
			//
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			//instanciando contrato
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			//
		}
		
		System.out.println();
		
		//entrando com dados de data
		System.out.println("Enter month and year to calculate income (MM/YYYY)");
		String monthAndYear = sc.next();
		//recortando os dados e guardando o mes
		//0, 2 significa que o recorte sera feito na pos 1 = M e o 2 e onde nao le mais = M
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		//recortando ano
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		//printando dados
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		
		sc.close();
		

	}

}

package application;

import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		System.out.println("Nome do aluno: ");
		aluno.nome = sc.nextLine();
		
		System.out.println("Notas: ");
		aluno.a = sc.nextDouble();
		aluno.b = sc.nextDouble();
		aluno.c = sc.nextDouble();
		
		System.out.printf("Nota Final = %.2f%n", aluno.finalGrade());
		
		if (aluno.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("Missing Points = : %.2f%n", aluno.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		
		
		
		
		sc.close();
	}

}

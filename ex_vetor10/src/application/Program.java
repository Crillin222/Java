package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, contador;
		double media=0;
		
		System.out.print("Quantos alunos serão digitados? ");
		n = sc.nextInt();
		
		contador = 0;
		String[] aluno = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		
		for (int i=0; i<n; i++) {
			contador = contador + 1;
			System.out.println("Digite nome, primeira e segunda nota do " + contador + "o aluno:");
			sc.nextLine();
			aluno[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados: ");
		
		 for (int i=0; i<n; i++) {
		        media = (nota1[i] + nota2[i]) / 2;

		        if(media >= 6.0) {
		            System.out.printf("%s\n", aluno[i]);
		        }
		    }
		
		sc.close();

	}

}

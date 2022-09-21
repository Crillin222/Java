import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int inicio, fim;
		inicio = sc.nextInt();
		fim = sc.nextInt();
		
		int duracao;
		
		if (inicio < fim) {
			duracao = fim - inicio;
		}
		else {
			duracao = 24 - inicio + fim;
		}
		
		System.out.println("O jogo durou " + duracao + " hora(s)");
					
		sc.close();

	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int A = 0;
		int G = 0;
		int D = 0;
		
		while (x != 4) {
			if (x == 1) {
				A = A + 1;
			}
			else if (x == 2) {
				G = G + 1;	
			}
			else if (x == 3) {
				D = D + 1;
			}
			else {
			}
			x = sc.nextInt();
		}
		
		System.out.println("Muito obrigado");
		System.out.println("Alcool: " + A);
		System.out.println("Gasolina: " + G);
		System.out.println("Diesel " + D);
		
		
		
		sc.close();

	}

}

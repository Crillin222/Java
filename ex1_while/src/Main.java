import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x;
		x = sc.nextInt();
		
		while (x != 2002) {
			System.out.println("Senha invalida");
			x = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
		
		
		sc.close();
		
		
	}

}

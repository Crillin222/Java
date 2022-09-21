import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double raio, area, pi;
		pi = 3.14159;
		
		
		raio = sc.nextDouble();
		area = pi * raio * raio;
		
		System.out.printf("Area = %.4f%n", area);
		
		
		sc.close();
		

	}

}

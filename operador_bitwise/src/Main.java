import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000;
		int n = sc.nextInt();
		
		
		if ((n & mask) != 0) {
			System.out.println("Sexto bit é verdadeiro");
		}
		else {
			System.out.println("Sexto bit é falso");
		}
		
		sc.close();

	}

}

package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println("End of program");
		

	}
	
	public static void method1() {
		System.out.println("****METHOD1 START****");
		method2();
		System.out.println("****METHOD1 END****");
	}

	public static void method2() {
		System.out.println("****METHOD2 START****");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			}
			//IF THE POSITION ENTERED DIDNT EXIST
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid Position");
				e.printStackTrace();
				sc.next();
			}
			//IF THE POSITION ENTERED ISNT A NUMBER
			catch (InputMismatchException e) {
				System.out.println("Input error");
			}
		
		sc.close();
		System.out.println("****METHOD2 END****");
	}
	
}

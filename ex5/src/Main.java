import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num, hora;
		double vph, salario;
		
		num = sc.nextInt();
		hora = sc.nextInt();
		vph = sc.nextDouble();
		
		salario = hora * vph ;
		
		System.out.println("Numero = " + num);
		System.out.printf("Salario = RS %.2f%n", salario);
		
		sc.close();

	}

}

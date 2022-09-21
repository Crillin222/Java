
public class ex {

	public static void main(String[] args) {
		
		String produto1 = "Computador";
		String produto2 = "Escrivaninha";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.println("Produtos:");
		System.out.printf("%s, tem o preco de R$%.2f.%n%s, tem o preco de R$%.2f.%n", produto1, preco1, produto2, preco2);
		
		System.out.println();
		
		System.out.printf("Arquivos: %d anos de idade, Codigo: %d e genero: %s.%n", idade, codigo, genero);
		
		System.out.println();
		
		System.out.printf("Medida com oito casas decimais: %.8f%nArredondado (tres casas decimais): %.3f", medida, medida);
		
		
		

	}

}

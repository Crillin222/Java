package application;

import java.util.Locale;

import entities.Endereco;
import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		//Instanciando objeto funcionario
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		
		//Instanciando objetos do tipo endereco
		Endereco enderecoFuncionario1 = new Endereco("Rua um", 80, "Bairro do Minuto", "Cidade do Teste", "PE", 
				"50.000-000");
		Endereco enderecoFuncionario2 = new Endereco("Rua dois", 99, "Bairro Tres", "Nova Cidade", "PE",
				"50.000-000");
		
		//Atribuindo enderecos a funcionarios
		funcionario1.setEndereco(enderecoFuncionario1);
		funcionario2.setEndereco(enderecoFuncionario2);
		
		
		//Colocando valores nos funcionarios
		funcionario1.setNome("Robson Medeiros");
		funcionario1.setSalario(1500.00);
		
		funcionario2.setNome("Wagner Medeiros");
		funcionario2.setSalario(2000.00);
		
		//Printando os valores
		
		System.out.println("------------------------------------------------------------");
		
		
		System.out.println("Nome do funcionario 1: " + funcionario1.getNome());
		System.out.println("Salario do funcionario 1: " + funcionario1.getSalario());
		System.out.println("Endereco do funcionario 1:");
		System.out.println(funcionario1.getEndereco().getRua());
		System.out.println("Numero: " + funcionario1.getEndereco().getNumero());
		System.out.println("Bairro: " + funcionario1.getEndereco().getBairro());
		System.out.println("Cidade: " + funcionario1.getEndereco().getCidade());
		System.out.println("Estado: " + funcionario1.getEndereco().getEstado());
		System.out.println("CEP: " + funcionario1.getEndereco().getCep());
		
		System.out.println("------------------------------------------------------------");
		System.out.println("------------------------------------------------------------");
		
		
		System.out.println("Nome do funcionario 2: " + funcionario2.getNome());
		System.out.println("Salario do funcionario 2: " + funcionario2.getSalario());
		System.out.println("Endereco do funcionario 2:");
		System.out.println(funcionario2.getEndereco().getRua());
		System.out.println("Numero: " + funcionario2.getEndereco().getNumero());
		System.out.println("Bairro: " + funcionario2.getEndereco().getBairro());
		System.out.println("Cidade: " + funcionario2.getEndereco().getCidade());
		System.out.println("Estado: " + funcionario2.getEndereco().getEstado());
		System.out.println("CEP: " + funcionario2.getEndereco().getCep());
		

	}

}

package entities;

public class Produto {
	
	//atributos
	public String nome;
	public String marca;
	public double valor;
	
	//construtures
	public Produto() {
		
	}
	
	public Produto(String nome) {
		this.nome = nome;
	}
	
	public Produto(String nome, String marca) {
		this.nome = nome;
		this.marca = marca;
	}
	
	public Produto(String nome, String marca, float valor) {
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
	}
	
}

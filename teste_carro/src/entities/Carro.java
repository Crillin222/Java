package entities;

public class Carro {
	
	//atributos
	public String nome;
	public String marca;
	public int ano;
	public int vel;
	
	//metodos
	public void acelerar(int aceleracao) {
		vel += aceleracao;
	}
	
	public void freiar(int reduzir) {
		vel -= reduzir;
	}
	
	public void buzinar() {
		System.out.println("bibibi");		
	}
	

}

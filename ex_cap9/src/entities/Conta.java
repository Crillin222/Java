package entities;

public class Conta {
	
	// Atributos
	
	private String name;
	private int numero;
	private double saldo;
	
	// Construtores
	
	public Conta(String name, int numero, double initialDeposit) {
		this.name = name;
		this.numero = numero;
		deposit(initialDeposit);
	}
	
	public Conta (String name, int numero) {
		this.name = name;
		this.numero = numero;
	}
	
	// Gets e Sets

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	// Metodos
	
	public void deposit(double valor) {
		this.saldo += valor;
	}
	
	public void withdraw(double valor) {
		this.saldo -= valor + 5.0;
	}
	
	public String toString( ) {
		return "Account "
				+ numero
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+String.format("%.2f", saldo);
	}
		
}

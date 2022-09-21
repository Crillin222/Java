package entities;

public class Aluno {
	
	public String nome;
	public double a;
	public double b;
	public double c;
	
	public double finalGrade() {
		return a + b + c;
	}
	
	public double missingPoints( ) {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		}
		else {
			return 0.0;
		}
	}
	

}

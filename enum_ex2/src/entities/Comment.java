package entities;

public class Comment {
	
	//Atributos
	private String text;
	
	//Construtor padrao
	public Comment() {
	}
	
	//Construtor com argumento
	public Comment(String text) {
		this.text = text;
	}

	
	//Getters e Setters
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
	
	
	

}

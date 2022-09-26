package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	//Criando simple date format
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	//Atributos
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	//Um post pode ter varios comentarios entao e criado uma lista
	private List<Comment> comments = new ArrayList<>();
	
	//Construtor padrao
	public Post() {
	}

	//Construtor com argumento (nao colocar a lista)
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	
	//Getters e setters (Deletar setcoment)
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}
	
	//Metodo para adicionar comentario
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	//Metodo para remover comentario
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	
	//Metodo toString
	public String toString() {
		//Declarando objeto do tipo stringBuilder
		StringBuilder sb = new StringBuilder();
		//objeto sb permitira concatenar strings com a funcao append
		//append significa acrescentar no final
		// \n quebra a linha
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		
		//Mostrar cada comentario associado ao post
		for (Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		//sb.toString converte stringBuilder para toString
		return sb.toString();
	}
	
	

}

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		//Criando simple date format
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//Criando objeto comentario
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		
		//Criando post
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"),
				"Traveling to New Zealand",
				"Im going to visit this wonderful country!",
				12);
		
		//Adicionando os comentarios
		p1.addComment(c1);
		p1.addComment(c2);
		
		//Criando mais objetos comentario
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the force be with you");
		
		//Criando post
		Post p2 = new Post(
				sdf.parse("28/07/2018 23:14:19"),
				"Good night guys",
				"See you tomorrow",
				5);
		
		//Adicionando comentarios
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		
		
	}

}

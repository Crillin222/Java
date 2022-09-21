package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		
		
		//adicionar a lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		
		//adicionar na lista na posicao
		list.add(2, "Marco");
		
		//mostrar tamanho da lista
		System.out.println(list.size());
		
		//remover da lista por dado ou posicao
		list.remove("Anna");
		list.remove(1);
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------");
		
		
		//remover por predicado
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------");
		
		//encontrar posicao de elemento
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("---------------");
		
		//filtrar lista
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		//encontrar primeiro elemento
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);		
				
		
		
				
	}

}

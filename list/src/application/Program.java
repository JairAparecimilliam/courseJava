package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		// adiciona nomes na lista
		list.add("Alex");
		list.add("Bob");
		list.add("Gertude");
		list.add("Manoel");
		list.add("Pele");
		list.add("Jose");
		list.add("Elias");
		list.add(0, "JAIR");

		
		//tamanho da lista
		System.out.println(list.size());
		
		int i = 0;
		// percorre a lista e imprime os elementos na posicao X
		for (String x : list) {
			System.out.println((i++) + " ->" + x);
		}
	}

}

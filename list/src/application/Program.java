package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		// adiciona nomes na lista
		list.add("Alex");
		list.add("Amanda");
		list.add("Bob");
		list.add("Gertude");
		list.add("Manoel");
		list.add("Pele");
		list.add("Jose");
		list.add("Elias");
		list.add(0, "JAIR");

		int i = 0;
		// percorre a lista e imprime os elementos na posicao X
		for (String x : list) {
			System.out.println((i++) + " ->" + x);
		}

		System.out.println("-----------------------------");

		// remove String nome
		list.remove("Gertude");

		// remove by position
		list.remove(5);

		// tamanho da lista
		System.out.println(list.size());

		i = 0;
		// percorre a lista e imprime os elementos na posicao X
		for (String x : list) {
			System.out.println((i++) + " ->" + x);
		}

		System.out.println("--------------------------");
		// remove all predicate x where charAt 0 =="M"
		list.removeIf(x -> x.charAt(0) == 'M');

		i = 0;
		// percorre a lista e imprime os elementos na posicao X
		for (String x : list) {
			System.out.println((i++) + " ->" + x);
		}
		System.out.println("--------------------------");

		System.out.println("Index of Elias: " + list.indexOf("Elias"));

		System.out.println("--------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		// percorre a lista e imprime chracter predicate filter
		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("--------------------------");
		//find first predicate whith chracter 'A'
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

		System.out.println(name);
	}
}

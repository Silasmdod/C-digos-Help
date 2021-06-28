package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		/*
		String[] vect = new String[] {"Maria", "bob", "alex"};
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
			
		}
		//esse � o for each
		System.out.println("---------------");
		//leitura do c�digo
		//Para cada objeto no obj contido no vetor vect fa�a
		for (String obj : vect) {
			System.out.println(obj);
		}
*/
		List<String> list = new ArrayList<>(); 
		list.add("Maria");
		list.add("Alexa");
		list.add("Jennifer");
		list.add("Pedro");
		list.add("Ricardo");
		list.add(2, "Marco");//adicionando marco antes de jennifer
		//list.remove("Maria");//removendo tamb�m d� para remover pelo indice
		//list.removeIf(x -> x.charAt(0) == 'M');//removendo pelos predicados
		
		System.out.println(list.size());//para ver o tamanho da lista
		for (String x : list) {
			System.out.println(x);
			
		}
		System.out.println("---------------------");
		System.out.println("Index of Jennifer:" + list.indexOf("Jennifer"));//para encontrar a pessoa ou o que est� guardado na lista
		System.out.println("Index of jo�o" + list.indexOf("jo�o"));
		
		
		
		System.out.println("---------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());//aqui convertemos para stream para filtrar uma informa��o para transformar em tipo lista
		//coletamos com o collect e transformamos em tolist 
		for (String x : result) {
			System.out.println(x);
			
		}
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		//Esta opera��o acima � para encontrar a pessoa como predicado da letra A
		System.out.println(name);
		
		
		
		
		
		
		
		
		
		
	}

}

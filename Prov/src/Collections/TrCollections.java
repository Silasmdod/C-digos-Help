package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class TrCollections {
	public static void main(String[] args) {
		Collection colecaoArrayList = new ArrayList();
		colecaoArrayList.add("M");
		colecaoArrayList.add("A");
		colecaoArrayList.add("U");
		colecaoArrayList.add("U");
		System.out.println(colecaoArrayList.toString());
		System.out.println(colecaoArrayList.isEmpty());
		System.out.println(colecaoArrayList.contains("U"));
		colecaoArrayList.remove("U");
		System.out.println(colecaoArrayList.toString());
		System.out.println();
		
		Collection colecaozinha = new ArrayList();
		colecaozinha.add("Suco");
		colecaozinha.add("Jarra");
		colecaozinha.add(3);
		System.out.println(colecaozinha.toString());
		System.out.println(colecaozinha.isEmpty());
		System.out.println(colecaozinha.contains(3));
		colecaozinha.removeAll(colecaozinha);
		System.out.println(colecaozinha.toString());
		
	}

}

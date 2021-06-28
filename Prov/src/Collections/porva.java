package Collections;

import java.util.TreeSet;

public class porva {
	public static void main(String[] args) {
		TreeSet colecaoSet = new TreeSet<>();
		colecaoSet.add("M");
		colecaoSet.add("A");
		colecaoSet.add("U");
		colecaoSet.add("B");
		colecaoSet.add("G");
		colecaoSet.add("L");
		colecaoSet.add("S");
		colecaoSet.add("P");
		colecaoSet.add("E");
		colecaoSet.add("T");
		colecaoSet.add("N");

		System.out.println(colecaoSet.contains("U"));
		//colecaoSet.remove("M");
		System.out.println(colecaoSet.toString());
		for(int i=0; i< 10; i++ ) {
			System.out.println(colecaoSet[i]);
		}

	}

}

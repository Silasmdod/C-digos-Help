package Aplicattion;

public class LacoForEach {
	public static void main(String[] args) {
		
		String[] vect = new String[] {"Alex, maria, joana"};

		//for normal
		
		for ( int i=0 ; i < vect.length ; i++ ) {
			System.out.println(vect[i]);
			
		}
		
		
		
		
		
		//usando o for each
		System.out.println("=============================");
		for ( String obj : vect) {
			System.out.println(obj);
			
		}
		
	}

}

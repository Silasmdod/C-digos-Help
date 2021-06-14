package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
		String[] vect = sc.nextLine().split(" ");//split para colcoar um espaço
		int position = sc.nextInt();
		System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println();
			System.out.println("posiçãio Inexistente");
			System.out.println();
		}
		catch(java.util.InputMismatchException e) {
			System.out.println();
			System.out.println("Digite a quantidade dos vetores!");
			System.out.println();
		}
	
	System.out.println("Fim do programa meu amigo.");
		
		
	sc.close();	

	}

}

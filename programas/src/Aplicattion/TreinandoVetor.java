/*APRENDENDO VETOR COMO COLOCAR E USAR.
 * Autor: Silas Matheus
 * Data: 21/04/2021
 * 
 */
package Aplicattion;


import java.util.Locale;
import java.util.Scanner;

import Entities.Products;

public class TreinandoVetor {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de produtos");
		System.out.print("Quantidade: ");
		int n = sc.nextInt(); // quantidade de vetores, de capsulas
		System.out.println();
		
		/*String[] nomes = new String[n];
		
		for (int i=0; i<n ; i++ ) {
			System.out.print("Digite 3 nomes:");
			nomes[i] = sc.next();
			System.out.println();
		}
		
		System.out.println("Os nomes da lista são:");
		for (int i=0 ; i<n ; i++) {
		System.out.printf("%s", nomes[i]);
		System.out.println();
		}
		*/
		Products[] vect = new Products[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();//
			System.out.println("Digite o nome do produto");
			System.out.print("Produto:");
			String name = sc.next();
			System.out.println();
			
			System.out.println("Digite o preço");
			System.out.print("Preço:");
			double price = sc.nextDouble();
			vect[i] = new Products(name, price);
			System.out.println();
		}
		
		double sum = 0.0;
		
		for (int i=0; i<vect.length ;i++) {
			sum += vect[i].getPrice();	
			
		}
		
		double avg = sum / vect.length;
		System.out.printf("Média do preço = R$ %.2f%n", avg);
		
		
		
		
		
		sc.close();
	}

}

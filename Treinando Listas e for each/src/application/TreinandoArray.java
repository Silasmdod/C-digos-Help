package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

import Entities.guardando;

public class TreinandoArray {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		boolean stop = true;
		guardando isso = new guardando();
		
		while ( stop == true) {
			try {
		List <String> lista = new ArrayList<>();
		int ctt;
		System.out.println("INICIANDO PROGRAMA de armazenamento de dados");
		System.out.println("OPÇÔES");
		System.out.println("1) Amazenar o nome");
		System.out.println("2) Checar lista");
		System.out.println("3) Remover nome");
		System.out.println("4) Sair");

		System.out.println();
		System.out.print("Escolha: ");
		ctt = sc.nextInt();
			
	
		switch(ctt) {
		
		case 1:
		
			System.out.println();
			System.out.println("Opção 1 escolhida.");
			System.out.println();
			System.out.println("Digite o nome que deseja armazenar");
			System.out.println();
			String name = sc.next();
			System.out.println();
			isso.adicionar(name);
			System.out.println();
			System.out.println("O nome " + name + " Foi adicionado no banco de dados");
			System.out.println();

			isso.getLista();

		
			
			
			 break;
		case 2:
			System.out.println();
			System.out.println("Opção 2 escolhida.");
			for (String x : lista) {
				System.out.println();
				isso.getLista();
				System.out.println();
			}
			
			break;
			
		case 3:
			System.out.println();
			System.out.println("Opção 3 escolhida.");
			System.out.println();
			System.out.println("digite o nome que deseja remover");
			String name2 = sc.next();
			isso.remover(name2);
			System.out.println(lista);

			break;
		case 4:
			System.out.println();
			System.out.println("Opção 4 escolhida.");
			System.out.println();
			System.out.println("Obrigado por usar nosso aplicativo ");
			stop = false;
			
			
			break;
		
		
		}//switch
			} catch (java.util.InputMismatchException e) {
				System.out.println("Digite um número!");
				break;
				
			}
		
		}//while
	
		
		
		
		
		
		/*lista.add("Suco de manga é muito bom");
		for ( String x : lista) {
			System.out.println(x);
		}*/
		
	sc.close();	
	}//public static

}//package

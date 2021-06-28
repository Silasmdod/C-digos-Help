package Aula50;

import java.util.Scanner;

public class UsandoThrows {
	public static void main(String[] args) {
		System.out.println("Entre com um número decimal");
		try {
			double num = leNumero();
			System.out.println("Você digitou " + num);
		} catch (Exception e) {
			System.out.println("Entrada Invalida");
			e.printStackTrace();
		}
		
	}
	public static double leNumero() throws Exception{//chamo o throws Exception para quem for usar ter que tratar esse método
		
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		return num;
	}

}

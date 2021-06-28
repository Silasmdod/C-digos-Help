package Aula50;

import java.util.Scanner;

public class UsandoThrows {
	public static void main(String[] args) {
		System.out.println("Entre com um n�mero decimal");
		try {
			double num = leNumero();
			System.out.println("Voc� digitou " + num);
		} catch (Exception e) {
			System.out.println("Entrada Invalida");
			e.printStackTrace();
		}
		
	}
	public static double leNumero() throws Exception{//chamo o throws Exception para quem for usar ter que tratar esse m�todo
		
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		return num;
	}

}

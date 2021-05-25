package Aplicattion;

import java.util.Locale;
import java.util.Scanner;

import Entities.ContaBancaria;
/*Meu primeiro projeto que consigo fazer tudo sem erro uhuu
 * Porjeto de banco
 * Autor: Silas Matheus
 * Data: 24/04/2021
 */

public class BanksPlay {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x;
		int num;
		char resp = 1;
		char n = 2;
		int numeroconta;
		String nometconta;
		double deposito = 0.0;
		double depositoinicial;
		
		ContaBancaria contabancaria = new ContaBancaria();
		
		while (resp != n) {
		System.out.println("====================================================================");
		System.out.println("---|---|---|---|---BEM VINDO AO BANCO BANKSPLAY---|---|---|---|---");
		System.out.println("====================================================================");
		System.out.println();
		System.out.println("OPÇÕES");
		System.out.println("1 - CADASTRAR");
		System.out.println("2 - EFETUAR DEPÓSITO");
		System.out.println("3 - EFETUAR SAQUE");
		System.out.println("4 - CONSULTAR SALDO");
		System.out.println("5 - MUDAR NOME DA CONTA");
		System.out.println("6 - SAIR");
		System.out.println();
		System.out.print("Digite o número da opção:");
		x = sc.nextInt();
		
		switch(x) {
		case 1:
			System.out.println();
			System.out.println("Opção escolhida: OPÇÃO 1 CADASTRAR");
			System.out.println();
			
			System.out.print("Digite o número da Conta:");
			num = sc.nextInt();
			contabancaria.inserinumeroconta(num); //inserindo com set, pois não consegui fazer a instanciação aqui.
			System.out.println();
		 	
			System.out.print("Digite o nome da conta:");
			nometconta = sc.next();
			contabancaria.setNometconta(nometconta);
			System.out.println();
			
			System.out.print("Você deseja fazer um deposito inicial? sim(s)/não(n):");
			char deseja = sc.next().charAt(0);//essa é a forma para ler um caracter
			if (deseja == 's') {
			
			System.out.println();
			System.out.print("Digite a quantidade a depositar:");
			depositoinicial = sc.nextDouble();
			contabancaria.adddeposito(depositoinicial);//método para depositar ao invés de get, para não deixar o método primitivo aqui
			System.out.println();
			
			
			
			System.out.println();
			System.out.println(contabancaria);//toString
			System.out.println();
			
			}
			else {
			
			
			System.out.println();
			System.out.println(contabancaria);//toString
			System.out.println();
			}
			
			
			break;
		case 2:
			System.out.println();
			System.out.println("Opção escolhida: OPÇÃO 2 DEPOSITAR");
			System.out.println();
			
			System.out.println("Digite a quantidade que deseja depositar");
			System.out.print("Depositar:");
			deposito = sc.nextDouble();
			contabancaria.adddeposito(deposito);//método ao invés de get

			
			System.out.println();
			System.out.println(contabancaria);//toString
			System.out.println();
			
			
			break;
		case 3:
			System.out.println();
			System.out.println("Opção escolhida: OPÇÃO 3 SAQUE");
			System.out.println();
			
			System.out.println("Digite a quantidade que deseja sacar");
			System.out.print("Sacar:");
			deposito = sc.nextDouble();
			contabancaria.retideposito(deposito);//método
			
			System.out.println();
			System.out.println(contabancaria);//to String
			System.out.println();
			
			
			break;
		case 4:
			System.out.println();
			System.out.println("Opção escolhida: OPÇÃO 4 CONSULTAR SALDO");
			System.out.println();
			
			
			System.out.println(contabancaria);//Não consegui criar um método para retornar o saldo
			//achei mais fácil apenas usar o toString
			System.out.println();
			
			break;
		case 5:
			System.out.println();
			System.out.println("Opção escolhida: OPÇÃO 5 MUDAR NOME DA CONTA");
			System.out.println();
			
			System.out.println("Digite o novo nome da sua conta:");
			System.out.print("Nome:");
			nometconta = sc.next();
			contabancaria.mudarnomeconta(nometconta);//método fácil.
			
			System.out.println();
			System.out.println(contabancaria);//toString
			System.out.println();
			
			
			
			
			break;
		case 6:
			System.out.println();
			System.out.println("Opção escolhida: OPÇÃO 6 SAIR");
			System.out.println();
			
			System.out.println("====================================================================");
			System.out.println("---|---|---|---|---OBRIGADO POR USAR A BANKSPLAY---|---|---|---|---");
			System.out.println("====================================================================");
			resp +=1;
			
			break;
			
			
			
		
		}
			
		
		
		
		
		}
		
		
	sc.close();	
	}

}

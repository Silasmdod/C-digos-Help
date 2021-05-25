package Entities;

public class ContaBancaria {
	private int numeroconta;
	private String nometconta;
	private double deposito = 0.0;
	private double depositoinicial = 0.0;
	
	//Construtores
	
	public ContaBancaria() {}
	
	public ContaBancaria(int numeroconta, String nometconta, double depositoinicial) {//construtor sobrecarregado
		this.numeroconta = numeroconta;
		this.nometconta = nometconta;
		this.deposito = depositoinicial;
	}
	
	//getter an setters
	
	public int getNumeroconta() {
		return numeroconta;
	}

	public String getNometconta() {
		return nometconta;
	}

	public void setNometconta(String nometconta) {
		this.nometconta = nometconta;
	}

	public double getDeposito() {
		return deposito;
	}

	//=======metodos
	
	public void adddeposito (double deposito) {
		this.deposito += deposito;	
	}
	
	public void retideposito (double deposito) {
		this.deposito -= deposito;
		this.deposito -= 5;
	}
	
	public void mudarnomeconta(String nometconta) {
		this.nometconta = nometconta;
		
		
	}
	
	public void inserinumeroconta(int num) {
		this.numeroconta = num;
	}
	

	public String toString() {
		return "Número da conta: "
				+ numeroconta
				+", "
				+"Nome da conta: "
				+nometconta
				+", "
				+"Saldo da conta: R$ "
				+ String.format("%.2f", deposito);
	}
	
	

}



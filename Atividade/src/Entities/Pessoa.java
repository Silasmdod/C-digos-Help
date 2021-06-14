package Entities;

public class Pessoa {
	private String pessoa;
	private Integer telefone;
	private String rua;
	private double cep;
	
	
	//constructors
	Pessoa(){}

	public Pessoa(String pessoa, Integer telefone, String rua, double cep) {
		super();
		this.pessoa = pessoa;
		this.telefone = telefone;
		this.rua = rua;
		this.cep = cep;
	}
	//getters and setters

	public String getPessoa() {
		return pessoa;
	}

	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public double getCep() {
		return cep;
	}

	public void setCep(double cep) {
		this.cep = cep;
	}
	
	
	
	

}

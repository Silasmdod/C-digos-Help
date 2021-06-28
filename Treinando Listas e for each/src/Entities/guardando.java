package Entities;

import java.util.ArrayList;
import java.util.List;

public class guardando {
	List <String> lista = new ArrayList<>();
	String name;

	
	public guardando() {}
	
	public guardando(List<String> lista) {
		super();
		this.lista = lista;
	}
	
	
	
	
	
	
	public List<String> getLista() {
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}

	
	
	
	public void adicionar(String name) {
		this.lista.add(name);	
	}
	
	public void remover(String name) {
		this.lista.remove(name);
		
	}

	@Override
	public String toString() {
		return "guardando lista=" + lista;
	}
	
	

}

package application;

import javax.swing.JOptionPane;

import Entities.Pessoa;
import servicos.Fazendo;
import servicos.Pesquisar;

public class Programm {
	public static void main(String[] args) {
		boolean suco = true;
		do{
		int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma op�ao"
				+ "\nOp��o 1: Cadastrar."
				+ "\nOp��o 2: Deletar"
				+ "\nOp��o 3: Pesquisar"
				+ "\nOp��o 4: Alterar"
				+ "\nOp��o 5 Sair"));
		switch (op) {
		case 1: 
			String nome = JOptionPane.showInputDialog("Digite eu nome");
			String telefone = JOptionPane.showInputDialog("Digite seu telefone");
			String endereco = JOptionPane.showInputDialog("Digite seu endere�o");
			Fazendo.cadastroPessoa(new Pessoa( nome, telefone, endereco));
			
			break;
		case 2:
			
			
			break;
		case 3:
			Pesquisar pesquisar = new Pesquisar();
			pesquisar.pesquisar();
			
			break;
		case 4:
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Fim do programa!");
			suco = false;
			break;
		
		default:
			JOptionPane.showMessageDialog(null, "Op��o Inv�lida!");
		}
		
		
		}while(suco == true);
		
		
		
		
	}

}


/*
create table Pessoa(
	id_pessoa serial primary key not null, 
	nome varchar,
	telefone double,
	endereco varchar
	
);

*/
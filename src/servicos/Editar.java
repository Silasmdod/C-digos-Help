package servicos;

import javax.swing.JOptionPane;

public class Editar {
	String sql;
	int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opçao"
			+ "\nOpção 1: Nome."
			+ "\nOpção 2: Telefone"
			+ "\nOpção 3: Endereco"
			+ "\nOpção 4: Sair"));
	public void alterarCadastro() {
		Conexao con = new Conexao();
		
		
				switch() {
					case 1:
						String nome = JOptionPane.showInputDialog("Digite o nome");
						sql = "UPTADE pessoa set nome = '" + nome + "' where pessoa.nome = '"+ nomeBd"'"

						break;
					case 2: 
						break;
					case 3:
						break;
						
				}
}

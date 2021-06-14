package servicos;

import javax.swing.JOptionPane;

public class Deletar {
	
	public boolean deletarCadastro() {
		Conexao con = new Conexao();
		Pesquisar p = new Pesquisar();
		String nome = (JOptionPane.showInputDialog("Digite o Nome do paciente:"));
		try {
			if(nome.pesquisar(p.pesquisar())) {
				JOptionPane.showMessageDialog(null, "CPF não encontrado");
			}else {
				String sql = "delete from pessoas where nome = '" + nome + "'";
				con.executaSQL(sql);
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		return false;
	}
	
	

}



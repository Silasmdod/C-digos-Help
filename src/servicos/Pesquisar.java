package servicos;

import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Pesquisar {
	
	String sql;
	Conexao con = new Conexao();
	String p;
	String nomebd;
	
	
	
	public String getNomebd() {
		return nomebd;
	}



	public void setNomebd(String nomebd) {
		this.nomebd = nomebd;
	}



	public  void pesquisar() {
		
		 p = JOptionPane.showInputDialog("Digite o nome para pesquisa");
		sql = "select * from pessoa where pessoa.nome like '"+ p +"'";
		con.pesquisando(sql);
		ResultSet rs = con.pesquisando(sql);
        String nome = "";
        String endereco = "";
        String telefone = "";
        
        try {
            while (rs.next()){
                nome = rs.getString("nome");
                telefone = rs.getString("telefone");
                endereco = rs.getString("endereco");
            }            
            if(p.equals(nome)) {
            	
            	JOptionPane.showMessageDialog(null,"Nome: " + nome +
                        "\nTelefone: " + telefone +
                        "\nEdereco: " + endereco);            	
            } else {
                JOptionPane.showMessageDialog(null, "Nome de usuário não encontrado!");
            }           	       	     
        }catch (Exception e) {
            e.printStackTrace();
        }
	} 
   }
   


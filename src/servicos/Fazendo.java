package servicos;
import Entities.Pessoa;

public class Fazendo {
    public static void cadastroPessoa(Pessoa p) {
        Conexao con = new Conexao();
        String sql;

        sql = "INSERT INTO pessoa (id_pessoa, nome, telefone,"
                + "endereco)values" + "(default,'"
                + p.getNome() + "','" + p.getTelefone() + "','" + p.getEndereco() + "')";
        con.executaSQL(sql);
        con.fecharConexao();
    }


}

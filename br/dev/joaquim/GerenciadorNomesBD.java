package br.dev.joaquim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorNomesBD implements GerenciadorNomes {
    private String url = "colocar aqui";
    private long contador = 0;

    @Override
    public void salvar(Pessoa pessoa) {
        // Verificar se ja nao existe no banco e se existir atualiza, senao ...
        String sql = "INSERT INTO pessoas VALUES(?,?)";
        try {
            Connection conn = DriverManager.getConnection(this.url);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setLong(1, contador++ );
            pstmt.setString(2, pessoa.getNome());
            pstmt.execute();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Pessoa> obter() {
        String sql = "SELECT * FROM pessoas";
        List<Pessoa> resposta = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection(this.url);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()) {
                String nome = rs.getString("nome");
                long id = rs.getLong("id");
                Pessoa p = new Pessoa();
                p.setId(id);
                p.setNome(nome);
                resposta.add(p);
            }
            return resposta;
        } catch(Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    @Override
    public void apagar(Pessoa pessoa) {
        String sql = "DELETE FROM pessoas WHERE id=?";
        try {
            Connection conn = DriverManager.getConnection(this.url);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setLong(1, pessoa.getId());
            pstmt.execute();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

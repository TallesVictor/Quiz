package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PerguntaDao {

    private Connection connection;

    public PerguntaDao() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
        public ArrayList<Pergunta> RandomizarPergunta() {
        ArrayList<Pergunta> listaPergunta = new ArrayList<>();
        String sql = "SELECT * FROM quiz ORDER BY RAND() LIMIT 10";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pergunta p = preencherPergunta(rs);
                listaPergunta.add(p);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Erro nos respostas cadastradas: " + e.getMessage());
            throw new RuntimeException();
        }
        return listaPergunta;
    }

    public ArrayList<Pergunta> buscarTodos() {
        ArrayList<Pergunta> listaPergunta = new ArrayList<>();
        String sql = "select * from quiz";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pergunta p = preencherPergunta(rs);
                listaPergunta.add(p);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Erro ao buscar: " + e.getMessage());
            throw new RuntimeException();
        }
        return listaPergunta;
    }

    public ArrayList<Pergunta> buscarPorOpcaoCorreta(String oc) {
        ArrayList<Pergunta> listaPergunta = new ArrayList<>();
        String sql = "select * from pergunta where opcaocorreta = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, oc);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pergunta p = preencherPergunta(rs);
                listaPergunta.add(p);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Erro ao buscar: " + e.getMessage());
            throw new RuntimeException();
        }
        return listaPergunta;
    }

    public boolean salvar(Pergunta p) {
        String sql = "insert into pergunta (pergunta, a, b, c, d, opcaocorreta) "
                + "values (?,?,?,?,?,?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, p.getPergunta());
            ps.setString(2, p.getA());
            ps.setString(3, p.getB());
            ps.setString(4, p.getC());
            ps.setString(5, p.getD());
            ps.setString(6, p.getOpcaoCorreta());
            ps.execute();
            ps.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
            throw new RuntimeException();
        }
    }

    public Pergunta buscarPorId(Integer id) {
        Pergunta pergunta = null;
        String sql = "select * from pergunta where id = ? limit 1";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, String.valueOf(id));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                pergunta = preencherPergunta(rs);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Erro ao buscar: " + e.getMessage());
            throw new RuntimeException();
        }
        return pergunta;
    }

    private Pergunta preencherPergunta(ResultSet rs) throws SQLException{
        Integer id = rs.getInt("id");
        String pergunta = rs.getString("pergunta");
        String a = rs.getString("a");
        String b = rs.getString("b");
        String c = rs.getString("c");
        String d = rs.getString("d");
        String opcaoCorreta = rs.getString("opcaocorreta");
        Pergunta p = new Pergunta(id, pergunta, a, b, c, d, opcaoCorreta);
        return p;
    }

    public void excluir(Integer id) {
        String sql = "delete from pergunta where id = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Erro ao excluir: " + e.getMessage());
            throw new RuntimeException();
        }
    }

    public void atualizar(Pergunta p) {
        String sql = "update pergunta set pergunta=?, a=?, b=?, c=?, d=?, opcaocorreta=? where id = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, p.getPergunta());
            ps.setString(2, p.getA());
            ps.setString(3, p.getB());
            ps.setString(4, p.getC());
            ps.setString(5, p.getD());
            ps.setString(6, p.getOpcaoCorreta());
            ps.setInt(7, p.getId());
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Erro ao ataualizar: " + e.getMessage());
            throw new RuntimeException();
        }
    }

    public ArrayList<Pergunta> filtrarPerguntas(String id, String pergunta, String resposta, String opcao) {
        ArrayList<Pergunta> listaPergunta = new ArrayList<>();
        String sql = "select * from pergunta where 1 = 1";

        try {
            if (!"".equals(id)) { sql += " AND id = " + id;}
            if (!"".equals(pergunta)) { sql += " AND pergunta like '%" + pergunta + "%'";}
            if (!"".equals(opcao)) { sql += " AND opcaocorreta = '" + opcao + "'";}
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pergunta p = preencherPergunta(rs);
                listaPergunta.add(p);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Erro ao filtrar: " + e.getMessage());
            throw new RuntimeException();
        }
        return listaPergunta;
    }

}

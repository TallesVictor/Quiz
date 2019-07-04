package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UsuarioDao {

    private Connection connection;

    public UsuarioDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    private Usuario preencherUsuario(ResultSet rs) throws SQLException {
        Integer id = rs.getInt("id");
        String usuario = rs.getString("usuario");
        String senha = rs.getString("senha");
        Usuario u = new Usuario(id, usuario, senha);
        return u;
    }

    public String VerificarUsuario(String usuario, String senha) {
        String sql = "select * from usuario where usuario = ? and senha = ?";
        String loginValido = "invalido";
        while ("invalido".equals(loginValido)) {
            try {
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setString(1, usuario);
                ps.setString(2, senha);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    loginValido = "valido";
                }
                rs.close();
                ps.close();
            } catch (SQLException e) {
                System.out.println("Erro ao buscar: " + e.getMessage());
                throw new RuntimeException();
            }
            return loginValido;
        }
        return loginValido;
    }

}

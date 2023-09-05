package semana22;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.SQLException;

public class ListarAlunos {
    public static void main(String[] args) throws SQLException {
             // 1.Abrir Conexão
          String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
          Connection connection = DriverManager.getConnection(url);

  
          // 2.Executar a consulta e usar os resultados
          String sql = "SELECT *FROM alunos;";

          Statement statement = connection.createStatement();

          ResultSet rs = statement.executeQuery(sql);
         while (rs.next()) {
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            String email = rs.getString("email");
            boolean ativo = rs.getBoolean("ativo");

            System.out.println(id + "," + nome + "," + email + "," + ativo);
            
         }
          // 3. Fechar conexão
          connection.close();
    }
}

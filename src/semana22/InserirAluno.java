package semana22;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InserirAluno {
    public static void main(String[] args) throws SQLException   {
          // 1.Abrir Conexão
          String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
          Connection connection = DriverManager.getConnection(url);
          int id = 1;
          //SQL inject 
          String nome = " Maria da Silva ";
          String email = "maria@email.com";
          boolean ativo = true ;
  
          // 2.Executar a consulta e usar os resultados
          String sql = "INSERT INTO alunos VALUES (?,?,?,?);";
        // INSERT INTO alunos VALUES (1,'Maria da Silva,'maria@...', true);
          PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,id);
        statement.setString(2, nome);
        statement.setString(3, email);
        statement.setBoolean(4, ativo// INSERT INTO alunos VALUES (1,'Maria da Silva,'maria@...', true);
        PreparedStatement statement = connection.prepareStatement(sql);
      statement.setInt(1,id);
      statement.setString(2, nome);
      statement.setString(3, email);
      statement.setBoolean(4, ativo);
;
 
        statement.executeUpdate();

          // 3. Fechar conexão
          statement.close();
          connection.close();
    }
}

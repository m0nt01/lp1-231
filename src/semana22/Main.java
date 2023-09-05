package semana22;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// JDBC -  Java Database Connection 
//- Conjunto de interface e classe para acesso a SGBDs
//Java App --> JDBC --> Driver (biblioteca que implementa JDBC) --> SGBD
// App Desktop           --->                Driver Mysql    --->             MySQL

public class Main{
    public static void main(String[] args) throws SQLException{
        // 1.Abrir Conexão
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection connection = DriverManager.getConnection(url);

        // 2.Executar a consulta e usar os resultados
        String sql = "CREATE TABLE alunos(id INT PRIMARY KEY, nome VARCHAR(100), email VARCHAR (255), ativo BOOLEAN);";
        Statement statement = connection.createStatement();
        statement.execute(sql);

        // 3. Fechar conexão
        statement.close();
        connection.close();
    } 
}
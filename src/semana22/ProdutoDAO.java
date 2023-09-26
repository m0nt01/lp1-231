package semana22;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// DAO = Data Access Object 
public class ProdutoDAO {
      public Produto create(Produto produto) throws SQLException {
        String sql = """
            INSERT INTO alunos (nome, preco, categoria)
            VALUES (?, ?, ?);
        """;
        
        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection
                .prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {
            
            preparedStatement.setString(1, nome);
            preparedStatement.setDouble(2, preco);
            preparedStatement.setString(3, categoria);

            ResultSet rs = statement.getGeneratedKeys();

            if(rs.next()) {
                produto.setId(rs.getInt(1));
            }
   rs.getBoolean("ativo")
            rs.close();

            return produto;
            
        } 
        
    }

    public Produto update(Produto produto) throws SQLException {
        String sql = """
            UPDATE produto
            SET nome = ?, preco = ?, categoria = ?
            WHERE id = ?;
        """;

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {

            statement.setInt(1, produto.getId());
            statement.setString(2, produto.getNome());
            statement.setDouble(3, produto.getPreco());
            statement.setString(3, produto.getCategoria());
            
            int linhasAfetadas = statement.executeUpdate();

            if (linhasAfetadas > 0) {
                return produto;
            }
            
            return null;

        } catch (SQLException e) {
            return null;
        }
    }

    public void delete(Integer id) {
        String sql = "DELETE FROM produto WHERE id = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(Produto produto) {
        delete(produto.getId());
    }

    public Produto findById(Integer id) {
        String sql = "SELECT * FROM produto WHERE id = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return resultSetToAluno(rs);
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }

    public List<Produto> findAll() {
        String sql = "SELECT * FROM produto;";
        List<Produto> produto = new ArrayList<>();

        try (
            Connection connection = Conexao.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
        ) {
            while(rs.next()) {
                produto.add(resultSetToProduto(rs));
            }

            return produto;
        
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        
    }

    private Aluno resultSetToProduto(ResultSet rs) throws SQLException {
        return new Produto(
            rs.getInt("id"),
            rs.getString("nome"),
            rs.getDouble("preco"),
            rs.getString("categoria"),
        );
    }
}
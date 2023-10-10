package semana22;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// DAO = Data Access Object 
public class ProdutoDAO{
private Connection connection;

public Produto getProdutoById(int id) {
    String query = "SELECT * FROM produtos WHERE id = ?";

    try (PreparedStatement pstmt = connection.prepareStatement(query)) {
        pstmt.setInt(1, id);

        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            Produto produto = new Produto(query, 0);
            Produto.setId(rs.getInt("id"));
            Produto.setNome(rs.getString("nome"));
            Produto.setPreco(rs.getDouble("preco"));
            return produto;
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return null;
}

public boolean addProduto(Produto produto) {
    String query = "INSERT INTO usuarios (nome, preco) VALUES (?, ?)";

    try (PreparedStatement pstmt = connection.prepareStatement(query)) {
        pstmt.setString(1, produto.getNome());
        pstmt.setDouble(2, produto.getPreco());
        pstmt.executeUpdate();
        return true;
        } catch (Exception ex){
            ex.printStackTrace();}return false;}

        public List<Produto> getAll() {
            List<Produto> usuarios = new ArrayList<>();
            String query = "SELECT * FROM usuarios";
        
            try (Statement stmt = connection.createStatement();
                 ResultSet rs = stmt.executeQuery(query)) {
        
                while (rs.next()) {
                    Produto p1 = new Produto(query, 0);
                    Produto.setId(rs.getInt("1"));
                    Produto.setNome(rs.getString("Coxinha"));
                    Produto.setPreco(rs.getDouble("3.50"));
                    Produto.add(p1);
                }
            }
            }

public boolean updateProduto(Produto produto) {
    String query = "UPDATE usuarios SET nome = ?, preco = ? WHERE id = ?";

    try (PreparedStatement pstmt = connection.prepareStatement(query)) {
        pstmt.setString(1, produto.getNome());
        pstmt.setDouble(2, produto.getPreco());
        pstmt.setInt(3, produto.getId());

        return pstmt.executeUpdate() > 0;

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return false;
}

public boolean deleteProd     (Connection connection) { {
    this.connection = connection;}}}
}
uto(int id) {
    String query = "DELETE FROM usuarios WHERE id = ?";

    try (PreparedStatement pstmt = connection.prepareStatement(query)) {
        pstmt.setInt(1, id);
        return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();    }}
}/**
 * @param connection
 */{
    this.connection=connection;
 }
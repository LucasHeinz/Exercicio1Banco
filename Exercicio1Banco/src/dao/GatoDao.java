package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Gato;

public class GatoDao {

	private final Connection con;

	public GatoDao(Connection con) {
		this.con = con;
	}
	
	public boolean inserir(String nome, String cor, int numPatas) throws SQLException {
		String sql = "INSERT INTO GATO (GAT_CODIGO, GAT_NOME, GAT_COR, GAT_NUM_PATAS, GAT_SOM) VALUES (SEQ_GATO.nextval, ?, ?, ?, 'Miau')";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setString(2, cor);
		statement.setInt(3, numPatas);

		return statement.executeUpdate() > 0;

	}

	public List<Gato> lista() throws SQLException {
		List<Gato> gatos = new ArrayList<>();

		String sql = "select * from GATO";

		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("GAT_CODIGO");
					String nome = rs.getString("GAT_NOME");
					String cor = rs.getString("GAT_COR");
					int numPatas = rs.getShort("GAT_NUM_PATAS");
					String som = rs.getString("GAT_SOM");

					Gato gato = new Gato(id, nome, cor, numPatas);
					gatos.add(gato);
				}
			}
		}

		return gatos;

	}
	
	public boolean excluir(int id) throws SQLException{
		String sql = "DELETE CACHORRO WHERE GAT_CODIGO = ?";
		 
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);
		 
		return statement.executeUpdate() > 0;
	}
	
}

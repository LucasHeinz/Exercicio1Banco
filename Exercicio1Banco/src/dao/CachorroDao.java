package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Cachorro;

public class CachorroDao {

	private final Connection con;

	public CachorroDao(Connection con) {
		this.con = con;
	}

	public boolean inserir(Cachorro cachorro) throws SQLException {
		String sql = "INSERT INTO CACHORRO (CACH_CODIGO, CACH_NOME, CACH_COR, CACH_NUM_PATAS, CACH_SOM) VALUES (SEQ_CACHORRO.nextval, ?, ?, ?, 'AuAu')";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, cachorro.getNome());
		statement.setString(2, cachorro.getCor());
		statement.setInt(3, cachorro.getPatas());

		return statement.executeUpdate() > 0;

	}
	
	public boolean alterar(Integer codigo, String nome) throws SQLException{
		String sql = "UPDATE CACHORRO SET CACH_NOME = ? WHERE CACH_CODIGO = ?";
		 
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, codigo);
		 
		return statement.executeUpdate() > 0;
	}

	public List<Cachorro> lista() throws SQLException {
		List<Cachorro> cachorros = new ArrayList<>();

		String sql = "select * from CACHORRO";

		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("CACH_CODIGO");
					String nome = rs.getString("CACH_NOME");
					String cor = rs.getString("CACH_COR");
					int numPatas = rs.getShort("CACH_NUM_PATAS");
					String som = rs.getString("CACH_SOM");

					Cachorro cachorro = new Cachorro(id, nome, cor, numPatas, som);
					cachorros.add(cachorro);
				}
			}
		}

		return cachorros;

	}
	
	public boolean excluir(int id) throws SQLException{
		String sql = "DELETE CACHORRO WHERE CACH_CODIGO = ?";
		 
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);
		 
		return statement.executeUpdate() > 0;
	}

}

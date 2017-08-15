package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Animal;
import model.Cachorro;

public class CachorroDao {

	private final Connection con;

	public CachorroDao(Connection con) {
		this.con = con;
	}
	
	public boolean inserir(String nome, String cor, int numPatas) throws SQLException{
		String sql = "INSERT INTO CACHORRO (CACH_CODIGO, CACH_NOME, CACH_COR, CACH_NUM_PATAS, CACH_SOM) VALUES (";
		
		
		
		return false;
		
	}
}

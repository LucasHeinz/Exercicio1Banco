package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.CachorroDao;
import jdbc.ConnectionPoolOracle;
import model.Cachorro;

public class CachorroService {
	
	public void inserir(Cachorro cachorro) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new CachorroDao(con).inserir(cachorro);
		}
	}
	
	public void alterar(Integer codigo, String nome) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new CachorroDao(con).alterar(codigo, nome);
		}
	}
	
	public void excluir(Integer codigo) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new CachorroDao(con).excluir(codigo);
		}
	}

	public List<Cachorro> listarCachorros() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new CachorroDao(con).lista();
		}
	}
	
}

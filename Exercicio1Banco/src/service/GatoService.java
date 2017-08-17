package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.GatoDao;
import jdbc.ConnectionPoolOracle;
import model.Gato;

public class GatoService {

	public void inserir(Gato gato) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new GatoDao(con).inserir(gato);
		}
	}
	
	public void alterar(Integer codigo, String nome) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new GatoDao(con).alterar(codigo, nome);
		}
	}
	
	public void excluir(Integer codigo) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new GatoDao(con).excluir(codigo);
		}
	}
	
	public List<Gato> lista() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new GatoDao(con).lista();
		}
	}
	
}

package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.PorquinhoDaIndiaDao;
import jdbc.ConnectionPoolOracle;
import model.PorquinhoDaIndia;

public class PorquinhoDaIndiaService {

	public void inserir(PorquinhoDaIndia porquinhoDaIndia) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new PorquinhoDaIndiaDao(con).inserir(porquinhoDaIndia);
		}
	}
	
	public void alterar(Integer codigo, String nome) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new PorquinhoDaIndiaDao(con).alterar(codigo, nome);
		}
	}
	
	public void excluir(Integer codigo) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new PorquinhoDaIndiaDao(con).excluir(codigo);
		}
	}
	
	public List<PorquinhoDaIndia> listarPorquinhosDaIndia() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new PorquinhoDaIndiaDao(con).lista();
		}
	}
	
}

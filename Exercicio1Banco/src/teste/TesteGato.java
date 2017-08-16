package teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import jdbc.ConnectionPoolOracle;
import dao.GatoDao;
import model.Gato;

public class TesteGato {

	public static void main(String[] args) throws SQLException {
		try(Connection con = new ConnectionPoolOracle().getConnection()) {
			GatoDao gatoDao = new GatoDao(con);
			
			gatoDao.inserir("Rex", "Cinza", 4);
			
			
		}
	}
}

package teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.CachorroDao;
import jdbc.ConnectionPoolOracle;
import model.Cachorro;

public class TesteCachorro {

	public static void main(String[] args) throws SQLException {
		try(Connection con = new ConnectionPoolOracle().getConnection()) {
			CachorroDao cachorroDao = new CachorroDao(con);
			cachorroDao.inserir("Bobe", "Azul", 4);
			
			List<Cachorro> cachorros = cachorroDao.lista(); 
			for (Cachorro cachorro : cachorros) {
				System.out.println(cachorro);
			}
			
			cachorroDao.excluir(2);
		}
	}
}

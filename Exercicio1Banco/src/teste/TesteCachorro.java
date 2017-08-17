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
			Cachorro cachorro = new Cachorro("Bobe", "Azul", 4);
			cachorroDao.inserir(cachorro);
			
			List<Cachorro> cachorros = cachorroDao.lista(); 
			for (Cachorro cach : cachorros) {
				System.out.println(cach.toString());
			}
			
			cachorroDao.excluir(2);
		}
	}
}

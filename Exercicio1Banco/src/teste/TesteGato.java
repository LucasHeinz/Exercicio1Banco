package teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import jdbc.ConnectionPoolOracle;
import model.Gato;
import service.GatoService;

public class TesteGato {

	public static void main(String[] args) throws SQLException {
		try(Connection con = new ConnectionPoolOracle().getConnection()) {
			Gato gato = new Gato("Rex", "Cinza", 4);
			GatoService gatoService = new GatoService();
			gatoService.inserir(gato);
			
			List<Gato> gatos = gatoService.lista(); 
			for (Gato gat : gatos) {
				System.out.println(gat.toString());
			}
			
			gatoService.excluir(2);
		}
	}
}

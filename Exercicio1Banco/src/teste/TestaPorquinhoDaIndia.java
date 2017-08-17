package teste;

import java.sql.SQLException;
import java.util.List;

import model.PorquinhoDaIndia;
import service.PorquinhoDaIndiaService;

public class TestaPorquinhoDaIndia {

	public static void main(String[] args) throws SQLException {
		List<PorquinhoDaIndia> lPorquinhosDaIndia = new PorquinhoDaIndiaService().listarPorquinhosDaIndia();
		for(PorquinhoDaIndia porquinhoDaIndia : lPorquinhosDaIndia) {
            System.out.println(porquinhoDaIndia.toString());
        }
	}

}

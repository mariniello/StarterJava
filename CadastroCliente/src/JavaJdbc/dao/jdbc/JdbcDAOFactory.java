package JavaJdbc.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import JavaJdbc.dao.ClienteDAO;
import JavaJdbc.dao.DAOFactory;

public class JdbcDAOFactory extends DAOFactory {

	private Connection connection;
	
	public JdbcDAOFactory() {
		try {
			
			//Carregar o Driver, usando o nome do driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Recuperando conexão
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost/cadastro_cliente", "root", "coelho12");
			
		} catch (Exception e) {
			
			throw new RuntimeException("Erro recuperando conexão com o banco", e);
			
		}
	}

	@Override
	public ClienteDAO getClienteDAO() {
		return new JdbcClienteDAO(connection);
	}
}

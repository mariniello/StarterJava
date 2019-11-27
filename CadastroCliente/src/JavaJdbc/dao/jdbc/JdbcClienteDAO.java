package JavaJdbc.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import JavaJdbc.dao.ClienteDAO;
import JavaJdbc.dao.DAOException;
import JavaJdbc.modelo.Cliente;

public class JdbcClienteDAO implements ClienteDAO {

	private Connection connection;
	
	
	
	public JdbcClienteDAO(Connection connection) {
		this.connection = connection;
	}



	@Override
	public void salvar(Cliente cliente) {
		
		try {
		String sql = String.format("insert into cliente (nome) values ('%s')", cliente.getNome());
		
		PreparedStatement ps = this.connection.prepareStatement(sql);
		ps.executeUpdate();
		
		}catch(SQLException e) {
			throw new DAOException("Erro salvando cliente", e);
		} finally {
			try {
			this.connection.close();
			} catch (Exception e) {}
			
		}
		
	}

}

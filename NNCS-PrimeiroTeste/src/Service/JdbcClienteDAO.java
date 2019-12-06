package Service;

import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Funcionario;

public class JdbcClienteDAO implements ClienteDAO {

	private Connection connection;

	public JdbcClienteDAO(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void salvar(Funcionario funcionario) {

		try {
			String sql = String
					.format("INSERT INTO funcionarios (nome, endereco, salario, data, cpf) VALUES (?,?,?,?,?)");

			PreparedStatement ps = this.connection.prepareStatement(sql);

			ps.setNString(1, funcionario.getNome());
			ps.setNString(2, funcionario.getEndereço());
			ps.setDouble(3, funcionario.getSalario());
			ps.setDate(4, funcionario.converteDate(funcionario.getDataNascimento()));
			ps.setNString(5, funcionario.getCpf());

			ps.executeUpdate();

		} catch (SQLException e) {
			throw new DAOException("Erro salvando Funcionario", e);
		} 
		finally {
			try {
				this.connection.close();
			} catch (Exception e) {
			}

		}
	}

	@Override
	public void excluirFuncionario(Funcionario funcionario) {

		try {

			String sql = String.format(
					"DELETE FROM funcionarios WHERE nome = ? AND endereco = ? AND salario = ? AND data = ? AND cpf = ?");

//			String sql = String
//					.format("DELETE FROM funcionarios WHERE cpf = ?");

			PreparedStatement ps = this.connection.prepareStatement(sql);

			ps.setNString(1, funcionario.getNome());
			ps.setNString(2, funcionario.getEndereço());
			ps.setDouble(3, funcionario.getSalario());
			ps.setDate(4, funcionario.converteDate(funcionario.getDataNascimento()));
			ps.setNString(5, funcionario.getCpf());

			ps.executeUpdate();

		} catch (SQLException e) {
			throw new DAOException("Erro excluindo Funcionario", e);
		} finally {
			try {
				this.connection.close();
			} catch (Exception e) {
			}
		}

	}

	@Override
	public void excluirTudoFuncionario() {

		try {
			String sql = String.format("DELETE FROM funcionarios");

			PreparedStatement ps = this.connection.prepareStatement(sql);

			ps.executeUpdate();

		} catch (SQLException e) {
			throw new DAOException("Erro excluindo Tabela Funcionarios", e);
		} finally {
			try {
				this.connection.close();
			} catch (Exception e) {
			}
		}
	}

	@Override
	public void consultarFuncionario(String cpf) {

		try {
			String sql = String.format("SELECT nome, endereco, salario, data, cpf FROM funcionarios WHERE cpf LIKE ?");

			PreparedStatement ps = this.connection.prepareStatement(sql);

			ps.setString(1, cpf);

			ps.execute();

			System.out.println(cpf);

			ResultSet rs = ps.executeQuery();
			List<String> recebeFuncionario = new ArrayList<>();

			while (rs.next()) {
				recebeFuncionario.add(rs.getString(1) + ";" + rs.getString(2) + ";" + rs.getDouble(3) + ";"
						+ rs.getDate(4) + ";" + rs.getString(5) + ";");

			}

			recebeFuncionario.forEach(f -> {
				System.out.println(f);
			});

		} catch (SQLException e) {
			throw new DAOException("Erro ao consultar Tabela Funcionarios", e);
		} finally {
			try {
				this.connection.close();
			} catch (Exception e) {
			}
		}

	}

	@Override
	public void gerarArquivoTodosFuncionarios() {

		try {

			String sql = String.format("SELECT * FROM funcionarios");

			PreparedStatement ps = this.connection.prepareStatement(sql);

			ps.execute();

			ResultSet rs = ps.executeQuery();
			List<String> recebeFuncionario = new ArrayList<>();

			while (rs.next()) {
				recebeFuncionario.add(rs.getString(1) + ";" + rs.getString(2) + ";" + rs.getDouble(3) + ";"
						+ rs.getDate(4) + ";" + rs.getString(5) + ";");

			}

			try (PrintStream writer = new PrintStream("Funcionarios.txt")) {
				recebeFuncionario.forEach(f -> {
					writer.println(f);
				});

			} catch (IOException e) {
				System.err.println("Não conseguiu gravar o arquivo." + e.getMessage());
			}
		} catch (SQLException e) {
			throw new DAOException("Erro salvando arquivo de Funcionarios", e);
		} finally {
			try {
				this.connection.close();
			} catch (Exception e) {
			}

		}
	}

	@Override
	public void aumentarSalarioFuncionario(Funcionario funcionario, double porcentagem) {

		try {

//			UPDATE funcionarios SET salario = salario*10/100 WHERE funcionarios.nome = "Maria" AND funcionarios.cpf = "123789"
			
			String sql = String.format("UPDATE funcionarios SET salario = " + funcionario.aumentarSalario(funcionario, porcentagem) 
			+ " WHERE nome = \"" + funcionario.getNome() + "\" AND cpf = \"" + funcionario.getCpf() + "\"");

			PreparedStatement ps = this.connection.prepareStatement(sql);

			ps.execute();
			
			
		} catch (SQLException e) {
			throw new DAOException("Erro na alteração da Tabela Funcionarios", e);
		} finally {
			try {
				this.connection.close();
			} catch (Exception e) {
			}

		}
	}

	@Override
	public void limparTabelaFuncionarios() {


		try {

			String sql = String.format("TRUNCATE TABLE funcionarios");
			
			PreparedStatement ps = this.connection.prepareStatement(sql);
			
			ps.execute();
			
		}catch (SQLException e) {
			throw new DAOException("Erro ao apagar dados da  Tabela Funcionarios", e);
		} finally {
			try {
				this.connection.close();
			} catch (Exception e) {
			}
		
	}

}
	
	
}

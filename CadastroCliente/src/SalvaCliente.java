import javax.swing.JOptionPane;

import JavaJdbc.dao.ClienteDAO;
import JavaJdbc.dao.DAOFactory;
import JavaJdbc.modelo.Cliente;

public class SalvaCliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		String nome = JOptionPane.showInputDialog(null, "Nome do cliente", "Cadastro de Cliente", JOptionPane.QUESTION_MESSAGE);
		
		
		if (nome != null) {
			
			cliente.setNome(nome);
			
			ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
			clienteDAO.salvar(cliente);
			JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");
			
		}
		
	}
}

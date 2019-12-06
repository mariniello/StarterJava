package Service;

import Model.Funcionario;

public interface ClienteDAO {

	public void salvar(Funcionario funcionario);
	public void excluirFuncionario(Funcionario funcionario);
	public void excluirTudoFuncionario();
	public void consultarFuncionario(String cpf);
	public void gerarArquivoTodosFuncionarios();
	public void aumentarSalarioFuncionario(Funcionario funcionario, double porcentagem);
	public void limparTabelaFuncionarios();
}

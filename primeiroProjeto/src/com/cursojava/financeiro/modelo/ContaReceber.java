package com.cursojava.financeiro.modelo;

public class ContaReceber extends Conta {
	public ContaReceber() {
	
	}
	
	public ContaReceber(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		// chamando o construtor sem parâmetros
		//this(); // rever aula do this para compreende-lo aqui
		
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	public void cancelar() {
		//this();  /// rever aula do this, verificar se é aplicável aqui
		
		if(this.getValor() > 50.000) {
			System.out.println(" Valor superior ao limite de  50.000 mil!");
		} else {
			super.cancelar();
				}
	
	}

	public void setCliente(Cliente cliente) {
		this.cliente.nome = cliente.nome;
	}
}
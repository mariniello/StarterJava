package com.cursojava.financeiro.modelo;

public class ContaPagar extends Conta {

	public ContaPagar() {

	}

	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		// chamando o construtor sem parâmetros
		this(); // rever aula do this para compreende-lo aqui

		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}

	public void pagar() throws OperacaoContaException {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			
			throw new OperacaoContaException("Não pode pagar uma conta que já está paga: "
					+ this.getDescricao() + ".");
			
//			System.out.println("Não pode pagar uma conta que já está paga: " + this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			
			throw new OperacaoContaException("Não é possível pagar uma conta cancelada");
			
//			System.out.println("Não pode pagar uma conta que está cancelada: " + this.getDescricao() + ".");
		} else {
			System.out.println(
					"Pagando conta " + this.getDescricao() + " no valor de " + this.getValor() + " e vencimento em "
							+ this.getDataVencimento() + " do fornecedor " + this.getFornecedor().getNome() + ".");

			// altera situação da conta para PAGA
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}

	public void exibirDetalhes() {
		
		System.out.println("\nConta a Pagar");
		System.out.println("===================================");
		System.out.println("Fornecedor: " + this.getFornecedor().getNome());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Valor: " + this.getValor());
		System.out.println("Data de vencimento: " + this.getDataVencimento());
		System.out.println("Situação: " + this.getSituacaoConta());
		System.out.println("===================================");
		
		
		System.out.println(" Status da conta: " + getSituacaoConta() + " Descrição : " + getDescricao()
		+ " Valor: " + getValor() + "Data de vencimento: " + getDataVencimento() 
		+ "Fornecedor: " + getFornecedor().getNome());
	}

}

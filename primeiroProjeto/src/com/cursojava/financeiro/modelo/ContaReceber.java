package com.cursojava.financeiro.modelo;

public class ContaReceber extends Conta {
	
	
	
	public ContaReceber() {
	
	}
	
	public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
		
		this.cliente = cliente;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		
	}
	
	public void cancelar() throws OperacaoContaException {
	
		
		if(this.getValor() > 50.000d) {
			
			throw new OperacaoContaException("Valor superior ao limite de 50.000mil!");
			
//			System.out.println(" Valor superior ao limite de  50.000 mil!");
		} else {
			super.cancelar();
				}
	
	}
	
	public void receber() throws OperacaoContaException {
		
		
		if (SituacaoConta.RECEBIDA.equals(SituacaoConta.RECEBIDA)) {
			
			throw new OperacaoContaException("Não é possível receber uma conta que já foi recebida!");
			
//			System.out.println("Não pode receber uma conta que já foi recebida: " 
//				+ this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			
			throw new OperacaoContaException("Não é possível receber uma conta cancelada!");
			
//			System.out.println("Não pode receber uma conta que está cancelada: " 
//				+ this.getDescricao() + ".");
		} else {
			System.out.println("Recebendo conta " + this.getDescricao() + " no valor de " 
				+ this.getValor() + " e vencimento em " + this.getDataVencimento() 
				+ " do fornecedor " + this.getFornecedor().getNome() + ".");
				
			// altera situação da conta para PAGA
			this.situacaoConta = SituacaoConta.RECEBIDA;
		}
		
	}


	public void exibirDetalhes() {
		
		System.out.println("\nConta a Receber");
		System.out.println("===================================");
		System.out.println("Cliente: " + this.getCliente().getNome());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Valor: " + this.getValor());
		System.out.println("Data de vencimento: " + this.getDataVencimento());
		System.out.println("Situação: " + this.getSituacaoConta());
		System.out.println("===================================");
		
//		
//		System.out.println(" Status da conta: " + getSituacaoConta() + " Descrição : " + getDescricao()
//		+ " Valor: " + getValor() + "Data de vencimento: " + getDataVencimento());
	}
	
	

	
}
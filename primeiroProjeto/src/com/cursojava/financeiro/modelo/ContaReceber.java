package com.cursojava.financeiro.modelo;

public class ContaReceber extends Conta {
	
	
	
	public ContaReceber() {
	
	}
	
	public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
				
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		
	}
	
	public void cancelar() {
	
		
		if(this.getValor() > 50.000d) {
			System.out.println(" Valor superior ao limite de  50.000 mil!");
		} else {
			super.cancelar();
				}
	
	}
	
	public void receber() {
		
		
		if (SituacaoConta.RECEBIDA.equals(SituacaoConta.RECEBIDA)) {
			System.out.println("Não pode receber uma conta que já foi recebida: " 
				+ this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode receber uma conta que está cancelada: " 
				+ this.getDescricao() + ".");
		} else {
			System.out.println("Recebendo conta " + this.getDescricao() + " no valor de " 
				+ this.getValor() + " e vencimento em " + this.getDataVencimento() 
				+ " do fornecedor " + this.getFornecedor().getNome() + ".");
				
			// altera situação da conta para PAGA
			this.situacaoConta = SituacaoConta.RECEBIDA;
		}
		
	}
	
	

	
}
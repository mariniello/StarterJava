package com.cursojava.financeiro.modelo;

public class RelatorioContas {

	public void exibirListagem(Conta[] contas) {
		
		System.out.println("*************************************");
		System.out.println("RELATÓRIO DE CONTAS A PAGAR E RECEBER");
		System.out.println("*************************************");
		
		
	for(Conta listagem : contas) {
		
		listagem.exibirDetalhes();
		
	}
	
		
	}
}

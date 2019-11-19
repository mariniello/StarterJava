package com.cursojava.financeiro;

import com.cursojava.financeiro.modelo.Cliente;
import com.cursojava.financeiro.modelo.Conta;
import com.cursojava.financeiro.modelo.ContaPagar;
import com.cursojava.financeiro.modelo.ContaReceber;
import com.cursojava.financeiro.modelo.Fornecedor;
import com.cursojava.financeiro.modelo.OperacaoContaException;
import com.cursojava.financeiro.modelo.RelatorioContas;

public class Principal {

	public static void main(String[] args) {
		// instanciando fornecedores
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do João");

		// instanciando clientes
		Cliente atacadista = new Cliente();
		atacadista.setNome("Triângulo Quadrado Atacadista");
		Cliente telecom = new Cliente();
		telecom.setNome("FoneNet Telecomunicações");

		// instanciando contas a pagar
		ContaPagar contaPagar1 = new ContaPagar();
		contaPagar1.setDescricao("Aluguel da matriz");
		contaPagar1.setValor(1230d);
		contaPagar1.setDataVencimento("10/05/2012");
		contaPagar1.setFornecedor(imobiliaria);

		ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do mês", 390d, "19/05/2012");

		// instanciando contas a receber
		ContaReceber contaReceber1 = new ContaReceber();
		contaReceber1.setDescricao("Desenvolvimento de projeto de logística em Java");
		contaReceber1.setValor(89500d);
		contaReceber1.setDataVencimento("23/05/2012");
		contaReceber1.setCliente(atacadista);

		ContaReceber contaReceber2 = new ContaReceber(telecom, "Manutenção em sistema de conta online", 53200d,
				"13/05/2012");

//		 pagamento e cancelamento de contas a pagar
		
		try {
			
		contaPagar1.pagar();
		contaPagar2.cancelar();
		contaReceber1.receber();
		contaReceber2.cancelar();
		
		}catch (OperacaoContaException e){
			System.out.println("Erro de operação de conta:" + e.getMessage());
		}
		
		

		// exibe listagem de todas as contas com detalhamento
		RelatorioContas relatorio = new RelatorioContas();
		Conta[] contas = new Conta[] { contaPagar1, contaPagar2, contaReceber1, contaReceber2 };

		relatorio.exibirListagem(contas);
		
//		Teste para capturar situação de conta.
		
//		System.out.println("Status da conta: " + contaPagar1.getSituacaoConta());
//		
//		System.out.println();
//		
//		System.out.println(" Status da conta: "+ contaPagar2.getSituacaoConta());

	}
}

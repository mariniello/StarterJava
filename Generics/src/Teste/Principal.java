package Teste;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<Funcionario> funcionarios = new ArrayList<>();
		
		funcionarios.add(new Funcionario("João"));
		funcionarios.add(new Funcionario("Maria"));
		
	//	funcionarios.add("ricardo");
		
		for (Funcionario f : funcionarios) {
						
			System.out.println("Nome do funcionário: " + f.getNome());
		}
	}
}

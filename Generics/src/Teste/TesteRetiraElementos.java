package Teste;

import java.util.ArrayList;
import java.util.List;

public class TesteRetiraElementos {

	public static void main(String[] args) throws RetiraElementosExceptions {
		
	
		try {
		List<Funcionario> nomes = new ArrayList<>();
		
		nomes.add(new Funcionario("Ricardo"));
		
		Funcionario f = RetiraElementos.recuperaPrimeiro(nomes);
		
		System.out.println(f.getNome());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}

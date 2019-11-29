package Teste;

import java.util.List;

public class RetiraElementos {

	public static <T> T recuperaPrimeiro( List<T> lista) throws RetiraElementosExceptions{
		
		if(lista.size() == 0) {
			
			throw new IllegalArgumentException("Sua Lista está vazia!");
			
		}
		return lista.get(0);
	}
}

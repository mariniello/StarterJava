package Try_With_Resources_And_Multicast;

import java.util.Scanner;

public class ExemploTry_Multicast {


	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {  // Abre e fecha o Scanner sem necessidade de fazer o close()
		
			System.out.print("Informe seu nome: ");
			String nome = entrada.nextLine();
			
			System.out.print("Informe sua idade: ");
			String idade = entrada.nextLine();
			
			try {
				SalvarAluno.salvar(nome, idade);
			} catch (NegocioException | NumberFormatException e) {                                // Pode usar vários Exceptions no Catch com o |
				System.err.println("Impossível completar operação. Motivo: " + e.getMessage());
			} 
		} 
	}
}

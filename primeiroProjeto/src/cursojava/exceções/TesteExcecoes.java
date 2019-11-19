package cursojava.exceções;

public class TesteExcecoes {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(100);
		
		try {
		cc.depositar(-10);
		//Várias linhas de código...
		
		}catch(IllegalArgumentException e) {
			System.out.println("Você executou uma operação ilegal: " + e.getMessage());
		}
	}
}

package cursoJava.strings;

public class ExemploClasseString8 {

	public static void main(String[] args) {
		String s = "Java";
		//Pega o índice da primeira ocorrencia de "a"
		int indice = s.indexOf('a');
		
		System.out.println(indice);
		
		// Pega o índice a última ocorrencia de "a"
		indice = s.lastIndexOf('a');
		System.out.println(indice);
	}
	
}

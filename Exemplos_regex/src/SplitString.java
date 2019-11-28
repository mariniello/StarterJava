
public class SplitString {

	public static void main(String[] args) {
		
		String texto = "O Java é uma linguagem orientada a objetos.";
		
		String[] palavras = texto.split(" ");
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
		
		
		String texto1 = "O4Java0é5uma6linguagem1orientada3a2objetos.";
		
		String[] palavras1 = texto1.split("\\d");
		for (String palavra : palavras1) {
			System.out.println(palavra);
		}
		
		
	}
}

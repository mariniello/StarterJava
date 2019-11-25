package cursoJava.strings;

public class ExemploCasseSring5 {

	public static void main(String[] args) {
		// public String substring(int beginIndex)
		// public String substring(int beginIndex, int endIndex)
		
		String s = "Desenvolvimento Java";
		// Imprime a substring a partir do índice informado
		System.out.println(s.substring(16));
		System.out.println(s);
		
		//Imprime a substring a partir do índice informado até o limite informado sem constar este último
		String s2 = "Cursos online de desenvolvimento de software";
		System.out.println(s2.substring(7, 12));
		
	}
	
}

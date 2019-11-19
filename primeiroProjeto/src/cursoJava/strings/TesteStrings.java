package cursoJava.strings;

public class TesteStrings {


	public static void main(String[] args) {
		// String, StringBuilder e StringBuffer
		
		String s = "Olá"; // Criada a String "Olá"
		s = s + " Pessoal!";  // Criada a String "Olá Pessoal!"
				
		System.out.println(s);
		
		// StringBuilder é mais performático do que StringBuffer, mas em ambientes concorrentes
		// é melhor trabalhar com StringBuffer
		
		StringBuilder sb = new StringBuilder("Olá"); // Existe a StringBuilder
		sb.append(" Pessoal!"); // Reaproveitando a StringBuilder
		
		String resultado = sb.toString();
		System.out.println("Com StringBuilder: " + resultado);
	}
}

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
		
		// Comparando Strings----------------------------------------------------------
		
		String nome = "Pedro";
		System.out.println(nome.toUpperCase());
		System.out.println(nome);                    // Não altera a variável
		
			
		nome = nome.toUpperCase(); 					// Variável recebe novo atributo
		System.out.println(nome);
		
		String s1 = "Pedro";
		String s2 = "Pedro";
		System.out.println("s1 == s2" + (s1 == s2));
		
		String s3 = new String("Pedro");
		System.out.println("s3 == s1?" + (s3 == s1));
		
		System.out.println("s1.equals(s2)? " + (s1.equals(s2)));
		System.out.println("s3.equals(s1)? " + (s3.equals(s1)));
		
		String s4 = "PedDrO";
		System.out.println("s1.equals(s4)?" + (s1.equals(s4)));
		System.out.println("s1.equalsIgnoreCase(s4)?" + (s1.equalsIgnoreCase(s4)));
	}
}

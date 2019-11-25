package cursoJava.strings;

public class ExemploClasseString7 {

	public static void main(String[] args) {
		String s = "Cursos_online_de_desenvolvimento_de_software";
		
		//Separa a String e coloca em um array
		String[] array = s.split("_");
		for (int i = 0; i < array.length; i++) {
			System.out.println("[" + i + "]=" + array[i]);
		}
	}
	
}

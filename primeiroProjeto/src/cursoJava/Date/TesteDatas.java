package cursoJava.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteDatas {

	public static void main(String[] args) {
		Date hoje = new Date();
		System.out.println(hoje);
		
		//Obtem data e hora de acordo com os parâmetros do formatador
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		System.out.println(formatador.format(hoje));
		
		String dataAniversario = "20/01/1985";
		
		//Formatador imprimindo somente a data
		DateFormat formatador2 = new SimpleDateFormat("dd/MM/yyyy");
		//Formatador imprimindo somente hora
		DateFormat formatador3 = new SimpleDateFormat("HH:mm:ss");
		
		try {
			Date aniversario = formatador2.parse(dataAniversario);
			System.out.println(formatador.format(aniversario));
			System.out.println(formatador2.format(aniversario));
			System.out.println(formatador3.format(hoje));
			
		} catch (ParseException e) {
			System.out.println("Formato de data inválido!");
		}
		
	}
}

package cursoJava.Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteCalendar {

	public static void main(String[] args) {
		
		// Com a classe Calendar posso criar uma data específica ou aterar um já existente
		Calendar c = new GregorianCalendar();
		
		c.set(Calendar.DAY_OF_MONTH, 31);
		c.set(Calendar.MONTH, 0); // O mês começa no 0,, atributo 8, significa mês 9
		c.set(Calendar.YEAR, 2010);
		c.set(Calendar.HOUR_OF_DAY, 10);
		c.set(Calendar.MINUTE, 30);
		c.set(Calendar.SECOND, 0);
		
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//Para formatar a data criado usando o DateFormat
		//O método format recebe um atributo do tipo Date, no entanto o atributo que
		// temos é do tipo Calendar. Para isso usa-se o "c.getTme" do Calendar que 
		// retornará um tipo Date
		System.out.println(formatador.format(c.getTime()));
		
		//ADICIONANDO DIAS 
		
		// Add dias com alteração do mês
		
		c.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println(formatador.format(c.getTime()));
		
		//Add mês à data atual 
		c.add(Calendar.MONTH, 1);
		System.out.println(formatador.format(c.getTime()));
		
		//Diminuindo um mês ( tb serve para dias com .day of month )
		c.add(Calendar.MONTH, -1);
		System.out.println(formatador.format(c.getTime()));
		
		//Rolar dia ( dentro do mesmo mês )
		
		c.roll(Calendar.DAY_OF_MONTH, 1);
		System.out.println(formatador.format(c.getTime()));
		c.roll(Calendar.DAY_OF_MONTH, -2);
		System.out.println(formatador.format(c.getTime()));
		
	}
	
}

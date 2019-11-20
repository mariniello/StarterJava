package cursoJava.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DesafioNumeros {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o valor: ");
		double numeroEntrada = entrada.nextDouble();
		
		BigDecimal b = new BigDecimal(numeroEntrada);
		BigDecimal resultado = b.multiply(BigDecimal.TEN).divide(new BigDecimal(100));
	
		
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		System.out.println("10% do valor: " + formatador.format(resultado));
		
		
		
	}
}

package cursoJava.JOptionPane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ExemploJOptionPane4 {

	public static void main(String[] args) throws Exception{
		
	UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
	
	
		//Entradas com opções para selecionar
		Object[] possibilidades = {"Masculino", "Feminino"};
		String sexo = (String) JOptionPane.showInputDialog(null, "Selecione sexo", "AlgaWorks", JOptionPane.PLAIN_MESSAGE, null
						, possibilidades, possibilidades[0]);
		
		System.out.println("Sexo selecionado: " + sexo);
		
		//Entrada com opção para digitar		
		String nome = (String) JOptionPane.showInputDialog(null, "Digite seu nome", "AlgaWorks", JOptionPane.PLAIN_MESSAGE, null
				, null, null);
		System.out.println("Seu nome é: " + nome);
		
	}
}

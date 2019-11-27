package VarArgs;

public class CorreioEletronico {

	//Recebe um array ilimitado de Strings, devido aos três pontinhos'...'
public void enviarEmails(String... emails) {
		
		// Percorrer todos os emails recebidos
		for (String email : emails) {
			// envia e-mail
			System.out.println("E-mail enviado para " + email);
		}
	}
	
}

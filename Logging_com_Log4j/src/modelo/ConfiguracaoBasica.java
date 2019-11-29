package modelo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class ConfiguracaoBasica {
	
	private static Logger logger = Logger.getLogger(ConfiguracaoBasica.class);

	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		
		logger.info("Começando a aplicação.");
		// codigo da aplicação, etc...
		logger.info("finalizando a aplicação.");
	}
}

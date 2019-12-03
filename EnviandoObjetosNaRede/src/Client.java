import java.io.DataInputStream;
import java.io.InputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws Exception {
		
		Socket socket = new Socket("192.168.0.119", 3333); // Recebe o IP que vai conectar e a porta 
		
		OutputStream saida = socket.getOutputStream();  // Para sair com dados,, pega a saído do socket
		ObjectOutput objectOutput = new ObjectOutputStream(saida); // Para escrever um objeto
		
		Pedido pedido = new Pedido();
		
		pedido.setCodigo(2L);
		pedido.setDescricao("Pasta de dente");
		pedido.setQuantidade(2);
		
		objectOutput.writeObject(pedido);  // Escrevendo o Objeto na saída, para o servidor
		
		InputStream entrada = socket.getInputStream();   // Recebe algo do servidor, pode ser a confirmação do recebimento, ACK
		DataInputStream dataInput = new DataInputStream(entrada);
		System.out.println("Recebeu do servidor: " + dataInput.readUTF());
		
		socket.close();
		
	}
}

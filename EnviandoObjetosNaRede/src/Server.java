import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	
public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(3333); // Cria o serividor na porta e fica escutando
		
		System.out.println("Aguardando conexão...");
		
		
		Socket socket = server.accept(); // Ele para aqui e aguarda conexões, cria o caminho
		
		System.out.println("Conectado a: " + socket.getRemoteSocketAddress());  // Quando conecta ele mostra o IP ao qual está conectado
		
		InputStream entrada = socket.getInputStream();                   //Gera o objeto de entrada		
		ObjectInputStream objectStream = new ObjectInputStream(entrada); // Crias o input o objeto de entrada com um novo InputStream
		
		Pedido pedido = (Pedido) objectStream.readObject(); //Lendo o objeto e guardando na variável
		System.out.println("Codigo: " + pedido.getCodigo());
		System.out.println("Descrição: " + pedido.getDescricao());
		System.out.println("Quantidade: " + pedido.getQuantidade());
		
		OutputStream saida = socket.getOutputStream();  // Mandar mensagem de confirmação , gerando saída
		DataOutput dataOutput = new DataOutputStream(saida); // 
		dataOutput.writeUTF("Recebido com sucesso!");// writeUTF pode escrever com acento
		
		server.close(); // fechar o servidor
	}

}

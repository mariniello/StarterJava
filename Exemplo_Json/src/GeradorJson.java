import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class GeradorJson {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco("Rua das Águas, 10", "Ribeirão Preto", "SP");
		Telefone residencial = new Telefone("RESIDENCIAL", "11 3333-11111");
		Telefone comercial = new Telefone("comercial", "11 3232-22222");
		List<Telefone> telefones = new ArrayList<>();
		telefones.add(residencial);
		telefones.add(comercial);
		
		
		Cliente cliente = new Cliente("João Silva", 28, endereco, telefones);
		
		Gson gson = new Gson();
		String json = gson.toJson(cliente);
		
		System.out.println(json);
		
		System.out.println();
		System.out.println("--------------------------------------------------------");
		System.out.println();
		
		
		Cliente c2 = gson.fromJson(json, Cliente.class);
		
		System.out.println(c2.getNome());
		System.out.println(c2.getTelefones().get(0).getNumero());
		
	}
}

package model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeserializandoObjeto {


	public static void main(String[] args) {
		try (ObjectInput in = new ObjectInputStream(new FileInputStream("joao.obj"))) {
			Pessoa p = (Pessoa) in.readObject();
			System.out.println("Nome: " + p.getNome());
			System.out.println("Idade: " + p.getIdade());
			System.out.println("Profissão: " + p.getProfissao());
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("Erro convertendo para a classe Pessoa");
			e.printStackTrace();
		}
	}
	
}

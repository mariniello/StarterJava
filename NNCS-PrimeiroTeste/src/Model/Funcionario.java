package Model;

import java.time.LocalDate;
import java.util.Date;


public class Funcionario {


	private String nome;
	private String endereço;
	private double salario;
	private LocalDate dataNascimento;
	private String cpf;
	
	
	
	
	public Funcionario(String nome, String endereço, double salario, LocalDate dataNascimento, String cpf) {
		super();
		this.nome = nome;
		this.endereço = endereço;
		this.salario = salario;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
	}


	public Funcionario() {
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereço() {
		return endereço;
	}


	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public LocalDate getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public java.sql.Date converteDate(LocalDate localdate) {
		
		java.sql.Date date = java.sql.Date.valueOf(localdate); // Magic happens here!
       return date;
	}


	public double aumentarSalario(Funcionario funcionario, double porcentagem) {
		return (this.salario + this.salario*(porcentagem/100));
	}
	
	
}

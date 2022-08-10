package entidades;

import java.util.ArrayList;
import java.util.List;

import banco.Conta;

public class Cliente {

	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private List<Conta> contas;
	
	public Cliente() {}

	
	public Cliente(String nome, String cpf, String telefone, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.contas = new ArrayList<Conta>();
	}

	public void addConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public List<Conta> getConta() {
		return this.contas;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [nome = " + nome + ", cpf = " + cpf +
				", telefone = " + telefone + ", email = " + email + " contas = " + contas + "]";
	}
	
	
}

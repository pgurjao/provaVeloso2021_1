package br.edu.infnet.al.provaVeloso2021_1.modelo;

public class Cliente {

	private int idCliente;
	private String nome;
	private String segundoNome;
	private String sobrenome;
	private String telefone;
	private String email;
	private String outrosDetalhes;

	public Cliente(int idCliente, String nome, String sobrenome, String telefone, String email) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
		this.email = email;
	}

	public Cliente(int idCliente, String nome, String email) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
	}

	public Cliente(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public String getNome() {
		return nome;
	}

	public String getSegundo() {
		return segundoNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public String getOutrosDetalhes() {
		return outrosDetalhes;
	}

}

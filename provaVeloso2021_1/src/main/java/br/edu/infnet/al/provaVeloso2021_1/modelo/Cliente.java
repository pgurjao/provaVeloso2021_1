package br.edu.infnet.al.provaVeloso2021_1.modelo;

public class Cliente {
	
	private int idCliente;
	
	private String nome;
	
	private String segundoNome;
	
	private String sobrenome;
	
	private String telefone;
	
	private String email;

	private String outrosDetalhes;

	public Cliente(int customer_id, String first_name, String last_name, String customer_phone, String customer_email) {
		this.idCliente = customer_id;
		this.nome = first_name;
		this.sobrenome = last_name;
		this.telefone = customer_phone;
		this.email = customer_email;
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

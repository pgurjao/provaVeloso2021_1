package br.edu.infnet.al.provaVeloso2021_1.modelo;

public class ItemVenda {

	private int idVenda;
	private int idProduto;
	private int quantidade;
	private String observacoes;

	public int getIdVenda() {
		return idVenda;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public ItemVenda(int idVenda, int idProduto, int quantidade) {
		this.idVenda = idVenda;
		this.idProduto = idProduto;
		this.quantidade = quantidade;
	}
}

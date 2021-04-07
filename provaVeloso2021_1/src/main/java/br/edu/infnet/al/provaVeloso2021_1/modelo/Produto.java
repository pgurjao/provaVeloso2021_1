package br.edu.infnet.al.provaVeloso2021_1.modelo;

public class Produto {

	private int idProduto;
	private int idProdutoPai;
	private int idTipoProduto;
	private int idFornecedor;
	private double preco;
	private int isbn;
	private String autor;
	private long dataPublicacao;
	private String titulo;
	private String nomeComida;
	private String descricaoComida;
	private String sabor;
	private String ingredientes;
	private String outrosDetalhesProduto;
	public int getIdProduto() {
		return idProduto;
	}
	public int getIdProdutoPai() {
		return idProdutoPai;
	}
	public int getIdTipoProduto() {
		return idTipoProduto;
	}
	public int getIdFornecedor() {
		return idFornecedor;
	}
	public double getPreco() {
		return preco;
	}
	public int getIsbn() {
		return isbn;
	}
	public String getAutor() {
		return autor;
	}
	public long getDataPublicacao() {
		return dataPublicacao;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getNomeComida() {
		return nomeComida;
	}
	public String getDescricaoComida() {
		return descricaoComida;
	}
	public String getSabor() {
		return sabor;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public String getOutrosDetalhesProduto() {
		return outrosDetalhesProduto;
	}
//	public Produto(int idProduto, int idTipoProduto, double preco) {
//		this.idProduto = idProduto;
//		this.idTipoProduto = idTipoProduto;
//		this.preco = preco;
//	}
	public Produto(int idProduto, String titulo, double preco) {
		this.idProduto = idProduto;
		this.titulo = titulo;
		this.preco = preco;
	}
	

}

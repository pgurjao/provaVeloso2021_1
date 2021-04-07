package br.edu.infnet.al.provaVeloso2021_1.modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
	
	private int idVenda;
	private int idCliente;
	private int codigoStatus;
	private Date dataCriacao;
	private int totalVenda;
	private String outrosDetalhes;
	private List<ItemVenda> itemVenda = new ArrayList<ItemVenda>();

	public int getIdVenda() {
		return idVenda;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public int getCodigoStatus() {
		return codigoStatus;
	}

	public String getDataCriacao() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		return sdf.format(dataCriacao);
	}

	public int getTotalVenda() {
		return totalVenda;
	}

	public String getOutrosDetalhes() {
		return outrosDetalhes;
	}
	
	public List<ItemVenda> getItemVenda() {
		return itemVenda;
	}

	public void setItemVenda(Produto produto, int quantidade) {
		ItemVenda itemVenda = new ItemVenda(idVenda, produto.getIdProduto(), quantidade);
		this.itemVenda.add(itemVenda);
	}

	public Venda(int idVenda, int idCliente) {
		this.idVenda = idVenda;
		this.idCliente = idCliente;
		Date dataInicial = new Date(System.currentTimeMillis() );
		this.dataCriacao = dataInicial;
	}

}

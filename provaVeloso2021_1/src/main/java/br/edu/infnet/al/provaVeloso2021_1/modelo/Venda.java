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
	private List<ItemVenda> itensVenda = new ArrayList<ItemVenda>();

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
		return itensVenda;
	}

	public void setItemVenda(int idVenda, int idProduto, int quantidade) {
		
		int indiceItemVenda = -1;
//		int idItemVendaMaximo = -1;
		ItemVenda itemVenda = new ItemVenda(this.idVenda, idProduto, quantidade);
		
		if (itensVenda == null || itensVenda.size() == 0 ) {
			itensVenda.add(itemVenda);
		} else {
			for (ItemVenda i : itensVenda) {
				
				if (i.getIdProduto() == idProduto ) {
//					idVenda = i.getIdVenda();
					indiceItemVenda = itensVenda.indexOf(i);
//					Venda venda = new Venda(idVenda, idCliente);
					itensVenda.remove(indiceItemVenda);
					itensVenda.add(itemVenda);
				} // else {
//					idItemVendaMaximo = Math.max(i.getIdVenda(), idItemVendaMaximo);
//				}
			}
			if (indiceItemVenda == -1) {
//				Venda venda = new Venda (idItemVendaMaximo+1, cliente.getIdCliente() );
				itensVenda.add(itemVenda);
			}
		}
	}

	public Venda(int idVenda, int idCliente) {
		this.idVenda = idVenda;
		this.idCliente = idCliente;
		Date dataInicial = new Date(System.currentTimeMillis() );
		this.dataCriacao = dataInicial;
	}

	@Override
	public String toString() {
		return "Venda [idVenda=" + idVenda + ", idCliente=" + idCliente + ", dataCriacao=" + getDataCriacao()
				+ ", itemVenda=" + itensVenda + "]";
	}

	
	
}

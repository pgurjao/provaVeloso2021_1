package br.edu.infnet.al.provaVeloso2021_1.controle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.edu.infnet.al.provaVeloso2021_1.modelo.Cliente;
import br.edu.infnet.al.provaVeloso2021_1.modelo.Venda;

public class VendaCtrl {
	
	private List<Venda> vendas = new ArrayList<Venda>();

	public void criarVenda (Cliente cliente) {
		
		int idVenda = 0;
		int idCliente = cliente.getIdCliente();
		int indiceVenda = -1;
		int idVendaMaximo = -1;
		
		if (vendas == null || vendas.size() == 0 ) {
			Venda venda = new Venda (1, cliente.getIdCliente() );
			vendas.add(venda);
		} else {
			for (Venda v : vendas) {
				
				if (v.getIdCliente() == idCliente) {
					idVenda = v.getIdVenda();
					indiceVenda = vendas.indexOf(v);
					Venda venda = new Venda(idVenda, idCliente);
					vendas.remove(indiceVenda);
					vendas.add(venda);
				} else {
					idVendaMaximo = Math.max(idVenda, idVendaMaximo);
				}
			}
			if (indiceVenda == -1) {
				Venda venda = new Venda (idVendaMaximo+1, cliente.getIdCliente() );
			}
		}
	}
	
	public void exibirVendas () {

		for (Venda v : vendas) {
			System.out.println(v);
		}
	}
	
}

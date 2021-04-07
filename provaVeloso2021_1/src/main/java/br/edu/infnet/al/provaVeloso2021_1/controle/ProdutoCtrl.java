package br.edu.infnet.al.provaVeloso2021_1.controle;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.al.provaVeloso2021_1.modelo.Cliente;
import br.edu.infnet.al.provaVeloso2021_1.modelo.Produto;

public class ProdutoCtrl {
	
	private List<Produto> produtos = new ArrayList<Produto>();

	public void cadastrarProduto (String titulo, double preco) {

		int idProduto = -1;
		int indiceProduto = -1;
		int idProdutoMaximo = -1;

		if (produtos == null || produtos.size() == 0 ) {
			Produto produto = new Produto(1, titulo, preco);
			produtos.add(produto);
		} else {
			for (Produto p : produtos) {

				if (p.getTitulo().equalsIgnoreCase(titulo)) {
					idProduto = p.getIdProduto();
					indiceProduto = produtos.indexOf(p);
					Produto produto = new Produto(idProduto, titulo, preco );
					produtos.remove(indiceProduto);
					produtos.add(produto);
				} else {
					idProdutoMaximo = Math.max(idProduto, idProdutoMaximo);
				}
			}
			if (indiceProduto == -1) {
				Produto produto = new Produto (idProdutoMaximo+1, titulo, preco );
				produtos.add(produto);
			}
		}
	}

	public void exibirProdutos () {

		for (Produto p : produtos) {
			System.out.println(p.toString() );
		}
	}

}

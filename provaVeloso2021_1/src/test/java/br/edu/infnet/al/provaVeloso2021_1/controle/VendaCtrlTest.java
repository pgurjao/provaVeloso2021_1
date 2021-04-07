package br.edu.infnet.al.provaVeloso2021_1.controle;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import br.edu.infnet.al.provaVeloso2021_1.modelo.Cliente;
import br.edu.infnet.al.provaVeloso2021_1.modelo.ItemVenda;

public class VendaCtrlTest {
	
	@Test
	public void isClientInsertWorking() {
		
		
		//monta cenários
		System.out.println("testando VendaCtrl");
		Cliente cliente1 = new Cliente (10, "Alexandre", "a@a.com");
		Cliente cliente2 = new Cliente (20, "Bruna", "b@b.com");
		Cliente cliente3 = new Cliente (30, "Carlos", "c@c.com");
		Cliente cliente4 = new Cliente (40, "Daniela", "d@d.com");
		Cliente cliente5 = new Cliente (50, "Elvis", "e@e.com");
		VendaCtrl vc = new VendaCtrl();
		ProdutoCtrl pc = new ProdutoCtrl();
//		Venda venda = new Venda (0, 0);
//		ItemVenda itemVenda = new ItemVenda (0, 0, 0);
		List<ItemVenda> itensVenda1 = new ArrayList<ItemVenda>();
		List<ItemVenda> itensVenda2 = new ArrayList<ItemVenda>();
		List<ItemVenda> itensVenda3 = new ArrayList<ItemVenda>();
		List<ItemVenda> itensVenda4 = new ArrayList<ItemVenda>();
		List<ItemVenda> itensVenda5 = new ArrayList<ItemVenda>();
		int idProduto;

		//execução da logica
		pc.cadastrarProduto ("Titulo 1", 1.05);
		pc.cadastrarProduto ("Bla 2", 2.05);
		pc.cadastrarProduto ("Cla 3", 3.05);
		pc.cadastrarProduto ("Dla 4", 4.05);
		pc.cadastrarProduto ("Ela 5", 5.05);
		pc.cadastrarProduto ("Fla 6", 6.05);
		pc.cadastrarProduto ("Gla 7", 7.05);
		pc.cadastrarProduto ("Cla 3", 8.05);
		
		vc.criarVenda(cliente1);
		vc.criarVenda(cliente2);
		vc.criarVenda(cliente3);
		vc.criarVenda(cliente4);
		vc.criarVenda(cliente5);
		
		vc.inserirItemVenda(1, 1, 2);
		vc.inserirItemVenda(1, 2, 4);
		vc.inserirItemVenda(2, 3, 6);
		vc.inserirItemVenda(2, 4, 8);
		vc.inserirItemVenda(3, 5, 10);
		vc.inserirItemVenda(4, 1, 3);
		vc.inserirItemVenda(5, 2, 6);
		

		//validação do teste
		System.out.println("exibindo vendas");
		vc.exibirVendas();
		
		itensVenda1 = vc.buscarItensVendaPoridVenda(1);
		itensVenda2 = vc.buscarItensVendaPoridVenda(2);
		itensVenda3 = vc.buscarItensVendaPoridVenda(3);
		itensVenda4 = vc.buscarItensVendaPoridVenda(4);
		itensVenda5 = vc.buscarItensVendaPoridVenda(5);
		
//		itensVenda.stream().filter(i -> i.getIdProduto() == 1 ).findFirst().orElse(null);
		
		idProduto = itensVenda1.stream().filter(i -> i.getIdProduto() == 1 ).findFirst().orElse(null).getIdProduto();
		Assert.assertEquals("Titulo 1", pc.buscarProdutoPorId(idProduto).getTitulo() );
		
		idProduto = itensVenda1.stream().filter(i -> i.getIdProduto() == 2 ).findFirst().orElse(null).getIdProduto();
		Assert.assertEquals("Bla 2", pc.buscarProdutoPorId(idProduto).getTitulo() );

		idProduto = itensVenda2.stream().filter(i -> i.getIdProduto() == 3 ).findFirst().orElse(null).getIdProduto();
		Assert.assertEquals("Cla 3", pc.buscarProdutoPorId(idProduto).getTitulo() );
		
		idProduto = itensVenda2.stream().filter(i -> i.getIdProduto() == 4 ).findFirst().orElse(null).getIdProduto();
		Assert.assertEquals("Dla 4", pc.buscarProdutoPorId(idProduto).getTitulo() );
		
		idProduto = itensVenda3.stream().filter(i -> i.getIdProduto() == 5 ).findFirst().orElse(null).getIdProduto();
		Assert.assertEquals("Ela 5", pc.buscarProdutoPorId(idProduto).getTitulo() );
		
		idProduto = itensVenda4.stream().filter(i -> i.getIdProduto() == 1 ).findFirst().orElse(null).getIdProduto();
		Assert.assertEquals("Titulo 1", pc.buscarProdutoPorId(idProduto).getTitulo() );
		
		idProduto = itensVenda5.stream().filter(i -> i.getIdProduto() == 2 ).findFirst().orElse(null).getIdProduto();
		Assert.assertEquals("Bla 2", pc.buscarProdutoPorId(idProduto).getTitulo() );
		
		
	}

}

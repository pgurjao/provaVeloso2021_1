package br.edu.infnet.al.provaVeloso2021_1.controle;

import org.junit.Assert;
import org.junit.Test;

public class ProdutoCtrlTest {
	
	@Test
    public void cadastrarProdutoTest() {
	
		//monta cenários
		System.out.println( "TESTE - Testando adicionar produto" );
		ProdutoCtrl pc = new ProdutoCtrl();
//		Produto p = new Produto(0, "", 0.0);
		pc.exibirProdutos();

		//execução da logica
		pc.cadastrarProduto ("Titulo 1", 1.05);
		pc.cadastrarProduto ("Bla  2", 2.05);
		pc.cadastrarProduto ("Cla 3", 3.05);
		pc.cadastrarProduto ("Dla 4", 4.05);
		pc.cadastrarProduto ("Ela 5", 5.05);
		pc.cadastrarProduto ("Fla 6", 6.05);
		pc.cadastrarProduto ("Gla 7", 7.05);
		pc.cadastrarProduto ("Cla 3", 8.05);

		
	
		//validação do teste
		Assert.assertEquals("Titulo 1", pc.buscarProdutoPorId(1).getTitulo() );
		Assert.assertEquals("Bla  2", pc.buscarProdutoPorId(2).getTitulo() );
		Assert.assertEquals("Cla 3", pc.buscarProdutoPorId(3).getTitulo() );
		Assert.assertEquals("Dla 4", pc.buscarProdutoPorId(4).getTitulo() );
		Assert.assertEquals("Ela 5", pc.buscarProdutoPorId(5).getTitulo() );
		Assert.assertEquals("Fla 6", pc.buscarProdutoPorId(6).getTitulo() );
		Assert.assertEquals("Gla 7", pc.buscarProdutoPorId(7).getTitulo() );
		Assert.assertEquals("Cla 3", pc.buscarProdutoPorId(3).getTitulo() );
		
		Assert.assertEquals(1.05, pc.buscarProdutoPorId(1).getPreco(), 0.0001 );
		Assert.assertEquals(2.05, pc.buscarProdutoPorId(2).getPreco(), 0.0001 );
		Assert.assertEquals(8.05, pc.buscarProdutoPorId(3).getPreco(), 0.0001 );
		Assert.assertEquals(4.05, pc.buscarProdutoPorId(4).getPreco(), 0.0001 );
		Assert.assertEquals(5.05, pc.buscarProdutoPorId(5).getPreco(), 0.0001 );
		Assert.assertEquals(6.05, pc.buscarProdutoPorId(6).getPreco(), 0.0001 );
		Assert.assertEquals(7.05, pc.buscarProdutoPorId(7).getPreco(), 0.0001 );
		
		for (int i = 1; i < 9; i++) {
			System.out.println(pc.buscarProdutoPorId(i) );
		}
		
	
	}
}

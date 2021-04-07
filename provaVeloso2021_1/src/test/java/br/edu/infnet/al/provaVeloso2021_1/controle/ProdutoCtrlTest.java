package br.edu.infnet.al.provaVeloso2021_1.controle;

import org.junit.Assert;
import org.junit.Test;
import br.edu.infnet.al.provaVeloso2021_1.modelo.Produto;
import br.edu.infnet.al.provaVeloso2021_1.controle.ProdutoCtrl;

public class ProdutoCtrlTest {
	
	@Test
    public void cadastrarProdutoTest() {
	
		//monta cenários
		System.out.println( "TESTE - Testando adicionar produto" );
		ProdutoCtrl pc = new ProdutoCtrl();

		//execução da logica
		pc.cadastrarProduto ("Titulo 1", 1.05);
		pc.cadastrarProduto ("Bla  2", 2.05);
		pc.cadastrarProduto ("Cla 3", 3.05);
		pc.cadastrarProduto ("Dla 4", 4.05);
		pc.cadastrarProduto ("Ela 5", 5.05);
		pc.cadastrarProduto ("Fla 6", 6.05);
		pc.cadastrarProduto ("Gla 7", 7.05);

		
	
		//validação do teste
		System.out.println("TESTE - exibindo produtos");
		pc.exibirProdutos();
//		assertEquals("Titulo 1", pc.);
		
	
	}
}

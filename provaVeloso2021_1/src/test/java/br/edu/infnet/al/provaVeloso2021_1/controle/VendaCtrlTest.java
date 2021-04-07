package br.edu.infnet.al.provaVeloso2021_1.controle;

import org.junit.Test;
import br.edu.infnet.al.provaVeloso2021_1.modelo.Cliente;

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

		//execução da logica
		vc.criarVenda(cliente1);
		vc.criarVenda(cliente2);
		vc.criarVenda(cliente3);
		vc.criarVenda(cliente4);
		vc.criarVenda(cliente5);
		

		//validação do teste
		System.out.println("exibindo vendas");
		vc.exibirVendas();
	}

}

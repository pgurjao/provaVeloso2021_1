package br.edu.infnet.al.provaVeloso2021_1.controle;

import org.junit.Assert;
import org.junit.Test;

public class ClienteCtrlTest {

	@Test
	public void isClientInsertWorking() {
		
		
		//monta cenários
		System.out.println("testando clienteCtrl");
		ClienteCtrl cc = new ClienteCtrl();

		//execução da logica
		cc.cadastrarCliente("Alexandre", "a@a.com");
		cc.cadastrarCliente("Bruna", "b@b.com");
		cc.cadastrarCliente("Carlos", "c@c.com");
		cc.cadastrarCliente("Daniela", "d@d.com");
		cc.cadastrarCliente("Elvis", "e@e.com");
		cc.cadastrarCliente("Fernanda", "f@f.com");
		cc.cadastrarCliente("Gustavo", "g@g.com");
		cc.cadastrarCliente("Daniela Oliveira Silva", "d@d.com");

		//validação do teste
		System.out.println("exibindo clientes");
		
		Assert.assertEquals("Alexandre", cc.buscarClientePorId(1).getNome() );
		Assert.assertEquals("Bruna", cc.buscarClientePorId(2).getNome() );
		Assert.assertEquals("Carlos", cc.buscarClientePorId(3).getNome() );
//		Assert.assertEquals("Daniela", cc.buscarClientePorId(4).getNome() );
		Assert.assertEquals("Elvis", cc.buscarClientePorId(5).getNome() );
		Assert.assertEquals("Fernanda", cc.buscarClientePorId(6).getNome() );
		Assert.assertEquals("Gustavo", cc.buscarClientePorId(7).getNome() );
		Assert.assertEquals("Daniela Oliveira Silva", cc.buscarClientePorId(4).getNome() );
		
		Assert.assertEquals("a@a.com", cc.buscarClientePorId(1).getEmail() );
		Assert.assertEquals("b@b.com", cc.buscarClientePorId(2).getEmail() );
		Assert.assertEquals("c@c.com", cc.buscarClientePorId(3).getEmail() );
		
		for (int i = 1; i < 9; i++) {
			System.out.println(cc.buscarClientePorId(i) );
		}	}
}

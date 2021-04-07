package br.edu.infnet.al.provaVeloso2021_1.controle;

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

		//validação do teste
		System.out.println("exibindo clientes");
		cc.exibirClientes();
	}
}

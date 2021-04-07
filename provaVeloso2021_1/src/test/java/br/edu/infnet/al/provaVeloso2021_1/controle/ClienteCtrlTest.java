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

		//validação do teste
		System.out.println("exibindo clientes");
		cc.exibirClientes();
	}
}

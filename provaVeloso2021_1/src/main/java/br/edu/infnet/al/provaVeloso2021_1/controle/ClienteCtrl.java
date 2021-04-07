package br.edu.infnet.al.provaVeloso2021_1.controle;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.al.provaVeloso2021_1.modelo.Cliente;

public class ClienteCtrl {

	private List<Cliente> clientes = new ArrayList<Cliente>();

	public void cadastrarCliente (String nome, String email) {

		int idCliente = -1;
		int indiceCliente = -1;
		int idClienteMaximo = -1;

		if (clientes == null || clientes.size() == 0 ) {
			Cliente cliente = new Cliente(1, nome, email);
			clientes.add(cliente);
		} else {
			for (Cliente c : clientes) {

				if (c.getEmail() == email) {
					idCliente = c.getIdCliente();
					indiceCliente = clientes.indexOf(c);
					Cliente cliente = new Cliente(idCliente, nome, email );
					clientes.remove(indiceCliente);
					clientes.add(cliente);
					break;
				} else {
					idClienteMaximo = Math.max(c.getIdCliente(), idClienteMaximo);
				}
			}
			if (indiceCliente == -1) {
				Cliente cliente = new Cliente (idClienteMaximo+1, nome, email );
				clientes.add(cliente);
			}
		}
	}
	
	public void exibirClientes () {
		
		for (Cliente c : clientes) {
			System.out.println(c);
		}
	}

	public Cliente buscarClientePorId (int idCliente) {

		for (Cliente c : clientes) {
			if (c.getIdCliente() == idCliente) {
				return c;
			}
		}
		return null;
	}
	
}

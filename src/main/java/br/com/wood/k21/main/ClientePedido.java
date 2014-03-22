package br.com.wood.k21.main;

import java.util.Calendar;

import br.com.wood.k21.persistence.dao.ClienteDAO;
import br.com.wood.k21.persistence.dao.PedidoDAO;
import br.com.wood.k21.persistence.dao.impl.ClienteDAOImpl;
import br.com.wood.k21.persistence.dao.impl.PedidoDAOImpl;
import br.com.wood.k21.persistencia.entity.Cliente;
import br.com.wood.k21.persistencia.entity.Pedido;

public class ClientePedido {
	public static void main(String[] args) {
		PedidoDAO pedidoDAO = new PedidoDAOImpl();
		ClienteDAO clienteDAO = new ClienteDAOImpl();
		
		Cliente c = new Cliente();
		c.setNome("Jardier");
		c = clienteDAO.save(c);
		
		Pedido p1 =  new Pedido();
		p1.setNumero("1");
		p1.setData(Calendar.getInstance());
		p1.setCliente(c);
		
		Pedido p2 = new Pedido();
		p2.setNumero("2");
		Calendar data = Calendar.getInstance();
		data.add(Calendar.DAY_OF_MONTH, -5);
		p2.setData(data);
		p2.setCliente(c);
		
		pedidoDAO.save(p1);
		pedidoDAO.save(p2);
	}

}

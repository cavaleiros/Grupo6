package model;

import java.util.ArrayList;

import dao.ClienteDAO;
import to.ClienteTO;

public class Vendedor {
	public ArrayList<ClienteTO> listarClientes(){
		ArrayList<ClienteTO> lista;
		ClienteDAO dao = new ClienteDAO();
		lista = dao.listarClientes(null);
		return lista;
	}
	public ArrayList<ClienteTO> listarClientes(String chave){
		ArrayList<ClienteTO> lista;
		ClienteDAO dao = new ClienteDAO();
		lista = dao.listarClientes(chave);
		return lista;
	}

}
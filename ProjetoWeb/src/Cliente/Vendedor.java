package Cliente;

import java.util.ArrayList;
import ClienteTO.ClienteTO;
import ClienteDAO.ClienteDAO;

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
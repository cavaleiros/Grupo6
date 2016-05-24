package model;

import java.util.ArrayList;

import dao.ClienteDAO;
import to.ClienteTO;

public class VendedorService {
	public ArrayList<Cliente> listarClientes(){
		ArrayList<Cliente> lista;
		ClienteDAO dao = new ClienteDAO();
		lista = dao.listarClientes(null);
		return lista;
	}
	public static ArrayList<Cliente> listarClientes(String chave){
		ArrayList<Cliente> lista;
		ClienteDAO dao = new ClienteDAO();
		lista = dao.listarClientes(chave);
		return lista;
	}

}
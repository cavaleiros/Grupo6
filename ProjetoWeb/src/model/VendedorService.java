package model;

import java.util.ArrayList;

import dao.ClienteDAO;
import dao.UsuarioDAO;
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
	public ArrayList<Usuario> listarUsuarios(){
		ArrayList<Usuario> lista;
		UsuarioDAO dao = new UsuarioDAO();
		lista = dao.listarUsuarios();
		return lista;
	}
	public ArrayList<Usuario> listarUsuarios(String chave){
		ArrayList<Usuario> lista;
		UsuarioDAO dao = new UsuarioDAO();
		lista = dao.listarUsuarios(chave);
		return lista;
	}
}
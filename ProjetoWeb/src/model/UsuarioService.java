package model;

import dao.UsuarioDAO;

public class UsuarioService {
	private Usuario data = new Usuario();

	public UsuarioService(){
		
	}
	public UsuarioService(String username, String password) {
		super();
		this.data.setUsername(username);
		this.data.setPassword(password);
	}
	public String getUsername() {
		return data.getUsername();
	}
	public void setUsername(String username) {
		this.data.setUsername(username);
	}
	public String getPassword() {
		return data.getPassword();
	}
	public void setPassword(String password) {
		this.data.setPassword(password);
	}
	
	public boolean validar(){
		UsuarioDAO dao = new UsuarioDAO();
		return dao.validar(data);
	}
	public Usuario getData() {
		Usuario to = new Usuario();
		to.setUsername(data.getUsername());
		to.setPassword(data.getPassword());
		return to;
	}
	
	public void criar() {
		UsuarioDAO dao = new UsuarioDAO();
		dao.incluir(data);
		//como o campo id da tabela cliente é auto_increment, um novo id será criado 
	}

	public void atualizar() {
		UsuarioDAO dao = new UsuarioDAO();
		dao.atualizar(data);
	}

	public void excluir() {
		UsuarioDAO dao = new UsuarioDAO();
		dao.excluir(data);
	}

	public void carregar() {
		UsuarioDAO dao = new UsuarioDAO();
		Usuario to = dao.carregar(data.getUsername());
		data.setPassword(to.getPassword());
	}

}

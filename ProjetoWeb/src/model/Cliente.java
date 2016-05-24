package model;
import dao.ClienteDAO;
import to.ClienteTO;
public class Cliente {
	private int id;
	private String nome,email,login,senha;
	private String cpf,telefone;
	
	public Cliente(String nome,String email,String cpf,String login,String senha,String telefone) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.login = login;
		this.senha = senha;
		this.telefone= telefone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void criar() {
		ClienteDAO dao = new ClienteDAO();
		ClienteTO to = getTO();
		dao.incluir(to);
		this.id = to.getId();
	}
	public ClienteTO getTO() {
		ClienteTO to = new ClienteTO();
		to.setNome(nome);
		to.setEmail(email);
		to.setCpf(cpf);		
		to.setTelefone(telefone);
		to.setLogin(login);
		to.setSenha(senha);
		return to;
	}
	public void excluir() {
		ClienteDAO dao = new ClienteDAO();
		ClienteTO to = new ClienteTO();
		to.setNome(nome);
		dao.excluir(to);
	}

	public void verificacao() {
		ClienteDAO dao = new ClienteDAO();
		ClienteTO to = new ClienteTO();
		to.setLogin(login);
		to.setSenha(senha);
	}
	
	public void alterar() {
		ClienteDAO dao = new ClienteDAO();
		ClienteTO to = new ClienteTO();
		to.setNome(nome);
		to.setEmail(email);
		to.setCpf(cpf);
		to.setTelefone(telefone);
		to.setLogin(login);
		to.setSenha(senha);
}
	
	@Override
	public String toString() {
		return "Cliente:"
				+ "\nnome: " + nome 
				+ ", email: " + email 
				+ ", cpf: " + cpf 
				+ ", telefone: " + telefone 
				+ ", Login:" + login 
				+ ", senha: " + senha;
	}
}

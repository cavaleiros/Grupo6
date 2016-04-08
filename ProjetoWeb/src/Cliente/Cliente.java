package Cliente;

import ClienteTO.ClienteTO;

import java.sql.SQLException;

import ClienteDAO.ClienteDAO;

public class Cliente {
	private int id;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
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

	public void setId(int id) {
		this.id = id;
	}

	private String nome;
	private String fone;
	private String email;
	private String login;
	private String senha;

	public Cliente(int id, String nome, String fone, String email,String login, String senha) {
		this.id = id;
		this.nome = nome;
		this.fone = fone;
		this.email = email;
		this.login = login;
		this.senha = senha;
	}

	public int getId() {
		return id;
	}


	public void criar() {
		ClienteDAO dao = new ClienteDAO();
		ClienteTO to = new ClienteTO();
		to.setId(id);
		to.setNome(nome);
		to.setFone(fone);
		to.setEmail(email);
		to.setLogin(login);
		to.setSenha(senha);
		dao.incluir(to);
	}

	public void atualizar() {
		ClienteDAO dao = new ClienteDAO();
		ClienteTO to = new ClienteTO();
		to.setId(id);
		to.setNome(nome);
		to.setFone(fone);
		to.setEmail(email);
		to.setLogin(login);
		to.setSenha(senha);
		dao.atualizar(to);
	}

	public void excluir() {
		ClienteDAO dao = new ClienteDAO();
		ClienteTO to = new ClienteTO();
		to.setId(id);
		dao.excluir(to);
	}

	public void carregar() throws SQLException {
		ClienteDAO dao = new ClienteDAO();
		ClienteTO to = dao.carregar(id);
		nome = to.getNome();
		fone = to.getFone();
		to.setEmail(email);
		to.setLogin(login);
		to.setSenha(senha);
	}
	
	public void alterar() {
		ClienteDAO dao = new ClienteDAO();
		ClienteTO to = dao.alterar(id);
		nome = to.getNome();
		fone = to.getFone();
		to.setEmail(email);
		to.setLogin(login);
		to.setSenha(senha);
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", fone="
	+ fone + ", e-mail=" + email + ", login=" + login + ", senha=" 
				+ senha + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (fone == null) {
			if (other.fone != null)
				return false;
		} else if (!fone.equals(other.fone))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;
		
	}
}

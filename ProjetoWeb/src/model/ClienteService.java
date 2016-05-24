package model;

import dao.ClienteDAO;

public class ClienteService {
	private Cliente data = new Cliente();

	public ClienteService(String nome,String email,String cpf,String login,String senha,String telefone) {
		this.data.setNome(nome);
		this.data.setEmail(email);
		this.data.setCpf(cpf);
		this.data.setLogin(login);
		this.data.setSenha(senha);
		this.data.setTelefone(telefone);
	}

	public int getId() {
		return data.getId();
	}

	public void setId(int id) {
		this.data.setId(id);
	}

	public String getNome() {
		return data.getNome();
	}

	public void setNome(String nome) {
		this.data.setNome(nome);
	}

	public String getEmail() {
		return data.getEmail();
	}

	public void setEmail(String email) {
		this.data.setEmail(email);
	}

	public String getLogin() {
		return data.getLogin();
	}

	public void setLogin(String login) {
		this.data.setLogin(login);
	}

	public String getSenha() {
		return data.getSenha();
	}

	public void setSenha(String senha) {
		this.data.setSenha(senha);
	}

	public String getCpf() {
		return data.getCpf();
	}

	public void setCpf(String cpf) {
		this.data.setCpf(cpf);
	}

	public String getTelefone() {
		return data.getTelefone();
	}

	public void setTelefone(String telefone) {
		this.data.setTelefone(telefone);
	}
	
	public void criar() {
		ClienteDAO dao = new ClienteDAO();
		dao.incluir(data);
		//como o campo id da tabela cliente é auto_increment, um novo id será criado 
	}

	public Cliente getData() {
		Cliente to = new Cliente();
		to.setNome(data.getNome());
		to.setEmail(data.getEmail());
		to.setCpf(data.getCpf());
		to.setLogin(data.getLogin());
		to.setSenha(data.getSenha());
		to.setTelefone(data.getTelefone());
		return to;
	}

	public void atualizar() {
		ClienteDAO dao = new ClienteDAO();
		dao.atualizar(data);
	}

	public void excluir() {
		ClienteDAO dao = new ClienteDAO();
		dao.excluir(data);
	}

	public void carregar() {
		ClienteDAO dao = new ClienteDAO();
		Cliente to = dao.carregar(data.getId());
		data.setNome(to.getNome());
		data.setEmail(to.getEmail());
		data.setCpf(to.getCpf());
		data.setLogin(to.getLogin());
		data.setSenha(to.getSenha());
		data.setTelefone(to.getTelefone());}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteService other = (ClienteService) obj;
		if (data.getNome() == null) {
			if (other.data.getNome() != null)
				return false;
		} else if (!data.getNome().equals(other.data.getNome()))
			return false;
		if (data.getEmail() == null) {
			if (other.data.getEmail() != null)
				return false;
		} else if (!data.getEmail().equals(other.data.getEmail()))
			return false;
		if (data.getCpf() == null) {
			if (other.data.getCpf() != null)
				return false;
		} else if (!data.getCpf().equals(other.data.getCpf()))
			return false;
		if (data.getLogin() == null) {
			if (other.data.getLogin() != null)
				return false;
		} else if (!data.getLogin().equals(other.data.getLogin()))
			return false;
		if (data.getSenha() == null) {
			if (other.data.getSenha() != null)
				return false;
		} else if (!data.getSenha().equals(other.data.getSenha()))
			return false;
		if (data.getTelefone() == null) {
			if (other.data.getTelefone() != null)
				return false;
		} else if (!data.getTelefone().equals(other.data.getTelefone()))
			return false;
		if (data.getId() != other.data.getId())
			return false;
		if (data.getNome() == null) {
			if (other.data.getNome() != null)
				return false;
		} else if (!data.getNome().equals(other.data.getNome()))
			return false;
		return true;
	}

}

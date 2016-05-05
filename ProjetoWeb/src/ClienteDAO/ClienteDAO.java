package ClienteDAO;
import ClienteTO.ClienteTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import ConnectionFactory.ConnectionFactory;
public class ClienteDAO {
	
	public void incluir(ClienteTO to) {
		String sqlInsert = "INSERT INTO cliente(nome_cliente, email_cliente, cpf_cliente, telefone_cliente, login_cliente, senha_cliente) VALUES (?, ?, ?, ?, ?, ?)";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
			stm.setString(1, to.getNome());
			stm.setString(2, to.getEmail());
			stm.setString(3, to.getTelefone());
			stm.setString(4, to.getCpf());
			stm.setString(5, to.getLogin());
			stm.setString(6, to.getSenha());
			stm.execute();
			String sqlSelect = "SELECT LAST_INSERT_ID()";
			try(PreparedStatement stm1 = conn.prepareStatement(sqlSelect);
					ResultSet rs = stm1.executeQuery();){
					if(rs.next()){
						to.setNome(rs.getString(1));
					}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public void excluir(ClienteTO to) {
		String sqlDelete = "DELETE FROM cliente WHERE nome_cliente = ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
			stm.setString(1, to.getNome());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void verificacao(ClienteTO to) {
		String sqlVerificacao = "select * from cliente where login_cliente=? and senha_cliente=?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlVerificacao);) {
			stm.setString(1, to.getLogin());
			stm.setString(1, to.getSenha());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

					
	public ClienteTO alterar(int id) {
				ClienteTO to = new ClienteTO();
					String sqlSelect = "SELECT nome_cliente, telefone_cliente FROM cliente WHERE nome_cliente,email_cliente,cpf_cliente,telefone_cliente,login_cliente,senha_cliente = ?,?,?,?,?,?";
					// usando o try with resources do Java 7, que fecha o que abriu
					try (Connection conn = ConnectionFactory.obtemConexao();
							PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
						stm.setInt(1, id);
						try (ResultSet rs = stm.executeQuery();) {
							if (rs.next()) {
								to.setNome(rs.getString("nome"));
								to.setEmail(rs.getString("email"));
								to.setCpf(rs.getString("cpf"));
								to.setTelefone(rs.getString("telefone"));
								to.setLogin(rs.getString("login"));
								to.setSenha(rs.getString("senha"));
							}				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return to;
	}


	public ArrayList<ClienteTO> listarClientes(String chave) {
		ClienteTO to;
		ArrayList<ClienteTO> lista = new ArrayList<>();
		String sqlSelect = "SELECT nome_cliente, telefone_cliente FROM cliente WHERE nome_cliente,email_cliente,cpf_cliente,telefone_cliente,login_cliente,senha_cliente FROM cliente where upper(nome_cliente) like ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
				stm.setString(1, "%" + chave.toUpperCase() + "%");
			try (ResultSet rs = stm.executeQuery();) {
				while(rs.next()) {
					to = new ClienteTO();
					to.setNome(rs.getString("nome"));
					to.setEmail(rs.getString("email"));
					to.setCpf(rs.getString("cpf"));
					to.setTelefone(rs.getString("telefone"));
					to.setLogin(rs.getString("login"));
					to.setSenha(rs.getString("senha"));
					lista.add(to);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return lista;
	}
}

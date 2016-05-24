package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Usuario;
import factory.ConnectionFactory;

public class UsuarioDAO {
	public boolean validar(Usuario data) {
		String query = "SELECT username, password FROM usuario "
				+ "WHERE username = ? and password = ?";

		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(query);) {
			stm.setString(1, data.getUsername());
			stm.setString(2, data.getPassword());
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					return true;
				} else {
					return false;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return false;
	}

	public void incluir(Usuario data) {
		String comando = "INSERT INTO usuario(username, password) VALUES (?, ?)";

		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(comando);) {
			stm.setString(1, data.getUsername());
			stm.setString(2, data.getPassword());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void atualizar(Usuario data) {
		String comando = "UPDATE usuario set password = ? where username = ?";

		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(comando);) {
			stm.setString(1, data.getPassword());
			stm.setString(2, data.getUsername());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void excluir(Usuario data) {
		String comando = "DELETE from usuario where username = ?";

		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(comando);) {
			stm.setString(1, data.getUsername());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Usuario carregar(String username) {
		Usuario data = new Usuario();
		data.setUsername(username);
		String query = "SELECT password FROM usuario WHERE username = ?";

		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(query);) {
			stm.setString(1, data.getUsername());
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					data.setPassword(rs.getString("password"));
				} else {
					data.setPassword(null);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return data;
	}

	public ArrayList<Usuario> listarUsuarios() {
		ArrayList<Usuario> lista = new ArrayList<>();
		String query = "SELECT username, password FROM usuario";

		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(query);
				ResultSet rs = stm.executeQuery();) {
			while (rs.next()) {
				Usuario data = new Usuario();
				data.setUsername(rs.getString("username"));
				data.setPassword(rs.getString("password"));
				lista.add(data);
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return lista;
	}

	public ArrayList<Usuario> listarUsuarios(String chave) {
		ArrayList<Usuario> lista = new ArrayList<>();
		String query = "SELECT username, password FROM usuario where usuario like ?";

		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(query);) {
			stm.setString(1, "%"+chave+"%");
			try (ResultSet rs = stm.executeQuery();) {
				while (rs.next()) {
					Usuario data = new Usuario();
					data.setUsername(rs.getString("username"));
					data.setPassword(rs.getString("password"));
					lista.add(data);
				}
			} catch (SQLException e1) {
				System.out.print(e1.getStackTrace());
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return lista;
	}
}

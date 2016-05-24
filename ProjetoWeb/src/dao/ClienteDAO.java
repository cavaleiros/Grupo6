package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import factory.ConnectionFactory;
import model.Cliente;

public class ClienteDAO {
	
   public void incluir(Cliente data) {
      String sqlInsert = "INSERT INTO cliente(nome_cliente, email_cliente, cpf_cliente, telefone_cliente, login_cliente, senha_cliente) VALUES (?, ?, ?, ?, ?, ?)";
   	// usando o try with resources do Java 7, que fecha o que abriu
      try (Connection conn = ConnectionFactory.obtemConexao();
      		PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
         stm.setString(1, data.getNome());
         stm.setString(2, data.getEmail());
         stm.setString(3, data.getTelefone());
         stm.setString(4, data.getCpf());
         stm.setString(5, data.getLogin());
         stm.setString(6, data.getSenha());
         stm.execute();
         String sqlSelect = "SELECT LAST_INSERT_ID()";
         try(PreparedStatement stm1 = conn.prepareStatement(sqlSelect);
         		ResultSet rs = stm1.executeQuery();){
            if(rs.next()){
               data.setNome(rs.getString(1));
            }
         }
      } 
      catch (SQLException e) {
         e.printStackTrace();
      }
   }

	
   public void excluir(Cliente to) {
      String sqlDelete = "DELETE FROM cliente WHERE nome_cliente = ?";
   	// usando o try with resources do Java 7, que fecha o que abriu
      try (Connection conn = ConnectionFactory.obtemConexao();
      		PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
         stm.setString(1, to.getNome());
         stm.execute();
      } 
      catch (Exception e) {
         e.printStackTrace();
      }
   }
	
   public void verificacao(Cliente to) {
      String sqlVerificacao = "select * from cliente where login_cliente=? and senha_cliente=?";
   	// usando o try with resources do Java 7, que fecha o que abriu
      try (Connection conn = ConnectionFactory.obtemConexao();
      		PreparedStatement stm = conn.prepareStatement(sqlVerificacao);) {
         stm.setString(1, to.getLogin());
         stm.setString(1, to.getSenha());
         stm.execute();
      } 
      catch (Exception e) {
         e.printStackTrace();
      }
   }
   public Cliente carregar(int id) {
      Cliente to = new Cliente();
      to.setId(id);
      String sqlSelect = "SELECT nome, telefone, email FROM cliente WHERE	cliente.id = ?";
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
         } 
         catch (SQLException e) {
            e.printStackTrace();
         }
      } 
      catch (SQLException e1) {
         System.out .print(e1.getStackTrace());
      }
      return to;
   }
					
   public Cliente alterar(int id) {
      Cliente to = new Cliente();
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
         } 
         catch (SQLException e) {
            e.printStackTrace();
         }
      } 
      catch (SQLException e1) {
         System.out.print(e1.getStackTrace());
      }
      return to;
   }


   public ArrayList<Cliente> listarClientes(String chave) {
      Cliente to;
      ArrayList<Cliente> lista = new ArrayList<>();
      String sqlSelect = "SELECT nome_cliente, telefone_cliente FROM cliente WHERE nome_cliente,email_cliente,cpf_cliente,telefone_cliente,login_cliente,senha_cliente FROM cliente where upper(nome_cliente) like ?";
   	// usando o try with resources do Java 7, que fecha o que abriu
      try (Connection conn = ConnectionFactory.obtemConexao();
      		PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
         stm.setString(1, "%" + chave.toUpperCase() + "%");
         try (ResultSet rs = stm.executeQuery();) {
            while(rs.next()) {
               to = new Cliente();
               to.setNome(rs.getString("nome"));
               to.setEmail(rs.getString("email"));
               to.setCpf(rs.getString("cpf"));
               to.setTelefone(rs.getString("telefone"));
               to.setLogin(rs.getString("login"));
               to.setSenha(rs.getString("senha"));
               lista.add(to);
            }
         } 
         catch (SQLException e) {
            e.printStackTrace();
         }
      } 
      catch (SQLException e1) {
         System.out.print(e1.getStackTrace());
      }
      return lista;
   }

   public ArrayList<Cliente> listarClientes() {
      Cliente to;
      ArrayList<Cliente> lista = new ArrayList<>();
      String sqlSelect = "SELECT id, nome_cliente, cpf_cliente, telefone_cliente, email_cliente, login_cliente"
         + " FROM cliente";
   // usando o try with resources do Java 7, que fecha o que abriu
      try (Connection conn = ConnectionFactory.obtemConexao();
      PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
         try (ResultSet rs = stm.executeQuery();) {
            while(rs.next()) {
               to = new Cliente();
               to.setId(rs.getInt("id"));
               to.setNome(rs.getString("nome"));
               to.setTelefone(rs.getString("telefone"));
               to.setEmail(rs.getString("email"));
               lista.add(to);
            }
         } 
         catch (SQLException e) {
            e.printStackTrace();
         }
      } 
      catch (SQLException e1) {
         System.out .print(e1.getStackTrace());
      }
      return lista;
   }


   public void atualizar(Cliente data) {
      String sqlUpdate = "UPDATE cliente SET nome=?, cpf_cliente=?, telefone_cliente,"
         	+ "login_cliente=?, senha_cliente=? WHERE id=?";
   	// usando o try with resources do Java 7, que fecha o que abriu
      try (Connection conn = ConnectionFactory.obtemConexao();
      		PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
         stm.setString(1, data.getNome());
         stm.setString(4, data.getCpf());
         stm.setString(3, data.getTelefone());
         stm.setString(2, data.getEmail());
         stm.setString(5, data.getLogin());
         stm.setString(6, data.getSenha());
         stm.execute();
      } 
      catch (Exception e) {
         e.printStackTrace();
      }
   }

	
}
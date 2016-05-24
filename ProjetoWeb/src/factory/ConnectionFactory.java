package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	//singleton da conexão
	private static final ThreadLocal<Connection> conn = new ThreadLocal<>();
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	// Obtém conexão com o banco de dados
	public static Connection obtemConexao() throws SQLException {
		if (conn.get() == null){
			conn.set(DriverManager
					.getConnection("jdbc:mysql://localhost/projeto?user=root&password=autocad3"));
		}
		return conn.get();
	}
	//Fecha a conexão
	public static void fecharConexao() throws SQLException {
		if(conn.get() != null){
			conn.get().close();
			conn.set(null);
		}
	}
}

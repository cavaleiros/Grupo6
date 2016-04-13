package Controller;
import Cliente.Cliente;
import ClienteTO.ClienteTO;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ManterClienteController
 */
@WebServlet("/ManterClienteController")
public class ManterClienteController extends HttpServlet {
	String sqlInsert;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManterClienteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response)
					throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String pAcao = request.getParameter("acao");
		String pid = request.getParameter("id");
		String nome = request.getParameter("nome");
		String fone = request.getParameter("fone");
		int id = -1;
		try {
		id = Integer.parseInt(pid);
		} catch (NumberFormatException e) {
		Cliente cliente = new Cliente( id,nome, fone);
		if (pAcao.equals("Inserir")) {
		sqlInsert = "INSERT into cliente values(?,?,?)";
		cliente.criar();
		ClienteTO to = new ClienteTO();
		to.setId(cliente.getId());
		to.setNome(cliente.getNome());
		to.setFone(cliente.getFone());
		request.setAttribute("cliente", to);
		RequestDispatcher view =
		request.getRequestDispatcher("formulario.jsp");
		view.forward(request, response);
		}
		else if (pAcao.equals("Excluir")) {
		cliente.excluir();
		}
		else if (pAcao.equals("Alterar")) {
			cliente.alterar();
		}else if (pAcao.equals("Atualizar")) {
			cliente.atualizar();
		}
		
		try {
			cliente.carregar();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ClienteTO to = new ClienteTO();
		to.setId(cliente.getId());
		to.setNome(cliente.getNome());
		to.setFone(cliente.getFone());
		request.setAttribute("cliente", to);
		RequestDispatcher view =
		request.getRequestDispatcher("formulario.jsp");
		view.forward(request, response);
	}
}
}

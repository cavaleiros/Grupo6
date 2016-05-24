package Controller;
import model.Cliente;
import to.ClienteTO;

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
@SuppressWarnings("unused")
@WebServlet("/ManterClienteController.do")
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
		String pnome = request.getParameter("nome");
		String pemail = request.getParameter("email");
		String pid = request.getParameter("id");
		String pcpf = request.getParameter("cpf");
		String ptelefone= request.getParameter("telefone");
		String plogin = request.getParameter("login");
		String psenha = request.getParameter("senha");
		int pcpf2 = Integer.parseInt(pcpf);
		int psenha2 = Integer.parseInt(psenha);
		int id = -1;
		try {
		id = Integer.parseInt(pid);
		} catch (NumberFormatException e){
		
		Cliente cliente = new Cliente(pnome,pemail,pcpf,ptelefone,plogin,psenha);
		if (pAcao.equals("Cadastrar")) {
		sqlInsert = "INSERT into cliente values(?,?,?,?,?,?)";
		cliente.criar();
		ClienteTO to = new ClienteTO();
		to.setNome(cliente.getNome());
		to.setEmail(cliente.getEmail());
		to.setCpf(cliente.getCpf());
		to.setTelefone(cliente.getTelefone());
		to.setLogin(cliente.getLogin());
		to.setSenha(cliente.getSenha());
		request.setAttribute("cliente", to);
		RequestDispatcher view = 
		request.getRequestDispatcher("cadastro.jsp");
		view.forward(request, response);
		}
		else if (pAcao.equals("Excluir")) {
		String sqlDelete = "DELETE FROM cliente WHERE nome_cliente = ?";
		cliente.excluir();
		ClienteTO to = new ClienteTO();
		to.setNome(cliente.getNome());
		request.setAttribute("cliente", to);
		RequestDispatcher view = 
		request.getRequestDispatcher("cadastro.jsp");
		view.forward(request, response);
		}
		else if (pAcao.equals("Alterar")) {
			cliente.alterar();
		}else if (pAcao.equals("Login")) {
			String sqlVerificacao = "SELECT FROM cliente WHERE login_cliente = ? and senha_cliente = ? ";
			cliente.verificacao();
			ClienteTO to = new ClienteTO();
			to.setLogin(cliente.getLogin());
			to.setSenha(cliente.getSenha());
			request.setAttribute("cliente", to);
			RequestDispatcher view = 
			request.getRequestDispatcher("login.jsp");
			view.forward(request, response);
		}
}
}
}
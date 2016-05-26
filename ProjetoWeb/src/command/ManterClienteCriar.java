package command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Cliente;
import model.ClienteService;

public class ManterClienteCriar implements Command {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pId = request.getParameter("id");
		String pAcao = request.getParameter("acao");
		String pnome = request.getParameter("nome");
		String pemail = request.getParameter("email");
		String pcpf = request.getParameter("cpf");
		String ptelefone= request.getParameter("telefone");
		String plogin = request.getParameter("login");
		String psenha = request.getParameter("senha");
		int id = -1;
		try {
			id = Integer.parseInt(pId);
		} catch (Exception e) {

		}

		ClienteService clienteService = new ClienteService(id, pnome, pemail, pcpf, ptelefone, plogin, psenha);
		HttpSession session = request.getSession();

		clienteService.criar();
		ArrayList<Cliente> lista = new ArrayList<>();
		lista.add(clienteService.getData());
		session.setAttribute("lista", lista);
		RequestDispatcher view =  request.getRequestDispatcher("ListarClientes.jsp");
		view.forward(request, response);
	}
}

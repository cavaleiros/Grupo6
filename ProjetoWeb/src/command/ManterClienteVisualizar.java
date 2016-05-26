package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ClienteService;

public class ManterClienteVisualizar implements Command {

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

		ClienteService clienteService = new ClienteService(id, pnome, pemail, pcpf, plogin, psenha, ptelefone);
		RequestDispatcher view = null;

		clienteService.carregar();
		request.setAttribute("cliente", clienteService.getData());
		view = request.getRequestDispatcher("VisualizarCliente.jsp");
		view.forward(request, response);
	}
}

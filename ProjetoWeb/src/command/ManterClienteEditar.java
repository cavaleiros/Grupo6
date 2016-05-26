package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cliente;
import model.ClienteService;

public class ManterClienteEditar implements Command {

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
		int pid2 = Integer.parseInt(pId);
		
		int id = -1;
		try {
			id = Integer.parseInt(pId);
		} catch (Exception e) {

		}

		ClienteService ClienteService = new ClienteService(pid2,pAcao,pnome,pemail,pcpf,ptelefone, psenha);
		RequestDispatcher view = null;

		ClienteService.carregar();
		request.setAttribute("cliente", ClienteService.getData());
		view = request.getRequestDispatcher("AlterarCliente.jsp");

		view.forward(request, response);

	}
}

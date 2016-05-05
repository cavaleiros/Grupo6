package command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Cliente.Cliente;
import ClienteTO.ClienteTO;

public class ExcluirCliente implements Command {

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

		Cliente cliente = new Cliente(pnome, pemail,pcpf, ptelefone,plogin,psenha);
		RequestDispatcher view = null;
		HttpSession session = request.getSession();

		cliente.excluir();
		@SuppressWarnings("unchecked")
		ArrayList<ClienteTO> lista = (ArrayList<ClienteTO>) session
				.getAttribute("lista");
		lista.remove(busca(cliente, lista));
		session.setAttribute("lista", lista);
		view = request.getRequestDispatcher("ListarClientes.jsp");
		view.forward(request, response);
	}

	public int busca(Cliente cliente, ArrayList<ClienteTO> lista) {
		ClienteTO to;
		for (int i = 0; i < lista.size(); i++) {
			to = lista.get(i);
			if (to.getId() == cliente.getId()) {
				return i;
			}
		}
		return -1;
	}

}

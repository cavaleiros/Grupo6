package Command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Cliente.Cliente;
import ClienteTO.ClienteTO;

public class VisualizarCliente implements Command {

	
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
		int pcpf2 = Integer.parseInt(pcpf);
		int psenha2 = Integer.parseInt(psenha);
		int id = -1;
		try {
			id = Integer.parseInt(pId);
		} catch (Exception e) {

		}

		Cliente cliente = new Cliente(pnome, pemail,pcpf2, ptelefone,plogin,psenha2);
		RequestDispatcher view = null;

		cliente.verificacao();
		request.setAttribute("cliente", cliente.getClienteTO());
		view = request.getRequestDispatcher("VisualizarCliente.jsp");
		view.forward(request, response);
	}

	public int busca(Cliente cliente, ArrayList<ClienteTO> lista) {
		ClienteTO to;
		for (int i = 0; i < lista.size(); i++) {
			to = lista.get(i);
			if (to.getNome() == cliente.getNome()) {
				return i;
			}
		}
		return -1;
	}

}

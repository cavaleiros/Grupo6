package command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.*;

import command.Command;
import dao.ClienteDAO;
import model.Cliente;
import to.ClienteTO;

public class CriarCliente implements Command {

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
		HttpSession session = request.getSession();

		cliente.criar();
		ClienteTO to = new ClienteTO();
		ArrayList<ClienteTO> lista = new ArrayList<>();
		lista.add(cliente.getTO());
		session.setAttribute("lista", lista);
		RequestDispatcher view =  request.getRequestDispatcher("cadastro.jsp");
		view.forward(request, response);
	}
}

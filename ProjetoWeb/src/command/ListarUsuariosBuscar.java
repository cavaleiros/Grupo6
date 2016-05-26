package command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Usuario;
import model.VendedorService;

public class ListarUsuariosBuscar implements Command {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String chave = request.getParameter("data[search]");
		VendedorService vendedorService = new VendedorService();
		ArrayList<Usuario> lista = null;
		HttpSession session = request.getSession();

		if (chave != null && chave.length() > 0) {
			lista = vendedorService.listarUsuarios(chave);
		} else {
			lista = vendedorService.listarUsuarios();
		}
		session.setAttribute("lista_usuarios", lista);

		RequestDispatcher dispatcher = request
				.getRequestDispatcher("ListarUsuarios.jsp");
		dispatcher.forward(request, response);
	}
}

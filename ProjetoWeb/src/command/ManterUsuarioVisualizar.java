package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UsuarioService;

public class ManterUsuarioVisualizar implements Command {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");

		UsuarioService usuarioService = new UsuarioService(usuario, senha);
		RequestDispatcher view = null;

		usuarioService.carregar();
		request.setAttribute("usuario", usuarioService.getData());
		view = request.getRequestDispatcher("VisualizarUsuario.jsp");
		view.forward(request, response);
	}
}

package command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Usuario;
import model.UsuarioService;

public class ManterUsuarioExcluir implements Command {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");

		UsuarioService usuarioService = new UsuarioService(usuario, senha);
		Usuario user = usuarioService.getData();
		RequestDispatcher view = null;
		HttpSession session = request.getSession();
		usuarioService.excluir();
		@SuppressWarnings("unchecked")
		ArrayList<Usuario> lista = (ArrayList<Usuario>) session
				.getAttribute("lista_usuarios");
		int pos = busca(user, lista);
		lista.remove(pos);
		session.setAttribute("lista_usuarios", lista);
		view = request.getRequestDispatcher("ListarUsuarios.jsp");
		view.forward(request, response);
	}

	public int busca(Usuario user, ArrayList<Usuario> lista) {
		Usuario listado;
		for (int i = 0; i < lista.size(); i++) {
			listado = lista.get(i);
			if (user.getUsername().equals(listado.getUsername())) {
				return i;
			}
		}
		return -1;
	}

}

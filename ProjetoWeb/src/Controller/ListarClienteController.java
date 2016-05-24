package Controller;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Vendedor;
import to.ClienteTO;
/**
* Servlet implementation class ListarClientesController
*/
@WebServlet("/listar_clientes.do")
public class ListarClienteController extends HttpServlet {
private static final long serialVersionUID = 1L;
/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
String chave = request.getParameter("data[search]");
Vendedor vendedor = new Vendedor();
ArrayList<ClienteTO> lista;
if(chave != null && chave.length() > 0){
lista = vendedor.listarClientes(chave);
} else {
lista = vendedor.listarClientes();
}
request.setAttribute("lista", lista);
RequestDispatcher dispatcher = request.
getRequestDispatcher("ListarClientes.jsp");
dispatcher.forward(request, response);
}
/**
* @see HttpServlet#doPost(HttpServletRequest request,
HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
doGet(request, response);
}
}
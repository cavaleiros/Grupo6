<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@page import="ClienteTO.ClienteTO" %>
<%@page import="Cliente.Cliente" %>
<%@page import="ClienteDAO.ClienteDAO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastrando</title>
</head>
<body>
<%ClienteTO to = (ClienteTO)request.getAttribute("cliente"); %>
Nome: <%=to.getNome() %><br>
E-mail: <%=to.getEmail() %><br>
CPF: <%=to.getCpf() %><br>
Telefone: <%=to.getTelefone() %><br>
Login: <%=to.getLogin() %><br>
Senha: A senha cadastrada foi a escolhida por você<br>
	<script>
	  alert("Cadastro Efetuado com Sucesso!"); 
	  window.location = 'login.jsp';
	 </script>
</body>
</html>
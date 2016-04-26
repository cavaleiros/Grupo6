<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@page import="ClienteTO.ClienteTO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Verificando</title>
</head>
<body>
<%ClienteTO to = (ClienteTO)request.getAttribute("cliente"); %>
<script>
	if(verificacao != null){
		alert("Login ou Senha incorreto"); 
		  window.location = 'login.jsp';
	}else{
		  alert("Bem-Vindo " + getLogin()); 
		  window.location = 'painel.jsp';
	}
</script>
	
	
</body>
</html>
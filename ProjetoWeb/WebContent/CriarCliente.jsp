<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>cerveja.biz - Criar Cliente</title>

    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
</head>

<body>
    <!-- Barra superior com os menus de navegação -->
    <!-- Container Principal -->
    <div id="main" class="container">
        <h3 class="page-header">Incluir Cliente</h3>
        <!-- Formulario para inclusao de clientes -->
        <form action="controller.do" method="post">
            <!-- area de campos do form -->
            <div class="row">
                <div class="form-group col-md-12">
                    <label for="nome">Nome</label>
                    <input type="text" class="form-control" name="nome" id="nome" required maxlength="100" placeholder="nome completo">
                </div>
            </div>

                <div class="form-group col-md-6">
                    <label for="email">E-Mail</label>
                    <input type="email" class="form-control" name="email" id="email" required maxlength="60" placeholder="email obrigatório">
                </div>

                <div class="form-group col-md-6">
                    <label for="cpf">CPF:</label>
                    <input type="cpf" class="form-control" name="cpf" id="cpf" required maxlength="60" placeholder="CPF obrigatório">
                </div>
                
            <div class="row">
                <div class="form-group col-md-6">
                    <label for="telefone">Celular</label>
                    <input type="tel" class="form-control" name="telefone" id="telefone" maxlength="15" pattern="(?:\(\d{2}\)|\d{2})[- ]?\d{5}[- ]?\d{4}" placeholder="opcional; celular com ddd no formato (99) 99999-9999">
                </div>
            </div>
            
            <div class="form-group col-md-6">
                    <label for="login">Login:</label>
                    <input type="text" class="form-control" name="login" id="login" required maxlength="60" placeholder="Login obrigatório">
                </div>
            
            <div class="form-group col-md-6">
                    <label for="senha">Senha:</label>
                    <input type="password" class="form-control" name="senha" id="senha" required maxlength="60" placeholder="Senha obrigatório">
                </div>
            <hr />
            <div id="actions" class="row">
                <div class="col-md-12">
                    <button type="submit" class="btn btn-primary" name="command" value="ManterClienteCriar">Salvar</button>
                    <a href="painel-admin.jsp" class="btn btn-default">Cancelar</a>
                </div>
            </div>
        </form>
    </div>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>
<!-- String pnome = request.getParameter("nome");
		String pemail = request.getParameter("email");
		String pcpf = request.getParameter("cpf");
		String ptelefone= request.getParameter("telefone");
		String plogin = request.getParameter("login");
		String psenha = request.getParameter("senha");
 -->
</html>
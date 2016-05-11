<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<title>Cinema XXII</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<link href="css-painel/style.css" rel="stylesheet" type="text/css" media="all"/>
<link href="css-painel/slider.css" rel="stylesheet" type="text/css" media="all"/>
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Cinema Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--webfont-->
<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
</head>
<body>
		<div class="header" style="background: url(images/fundo2.jpg)no-repeat;
    background-size: cover;
}">
<div class="logo">
<div class="container">
			<a href="index.jsp"><img src="images/logo.png" alt="" style="margin-top:6%;" /></a>
		</div>
	</div>
		 <div class="headertop_desc" style="background:none;border-bottom:none;">
			<div class="wrap">
				<div class="nav_list">

<div class="container">
	<form class="form_login" method="post" >
		<label>Login</label>
	<input type="text" name="login" id="login" >
		<label>Senha</label>	
		<div class="clearfix"></div>
		<input type="password" name="senha" id="senha" >
		<a  href="#" id="teste" clas="deucerto" style="float:right;
	padding:0.6em 1em;
	margin-top:4%;
	background:transparent;
	border:1px solid #777;
	border-radius:12px;
	border:1px solid #fff;
	color:#fff;">Logar</a>
		
	</form>
	<script type="text/javascript">
	
	$('#teste').click(function(){
		if($("#login").val() == "admin" && $("#senha").val() == "123" ){
			alert("Bem Vindo Administrador"); 
			window.location = "painel-admin.jsp";
		}else{
			alert("Bem Vindo Usuário"); 
			window.location = "painel.jsp";
		}
		});
	
	</script>
</div>
</div>
</div>
</div>
</div>
</body>
</html>
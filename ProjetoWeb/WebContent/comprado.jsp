<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>Cinema XXII</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet" >
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
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
	<!-- header-section-starts -->
	<div class="full">
			<%@ include file="menu.jsp" %>
		<div class="main">
		<div class="single-content">
			<%@ include file="topo.jsp" %>
			<div class="reviews-section">
				<h3 class="head">Compra Finalizada</h3>
					<div class="col-md-9 reviews-grids">
						<div class="review">
							<div class="movie-pic">
								<img src="images/r4.jpg" alt="" />
								<p class="filme_comprado">Filme Comprado</p>
							</div>
							<div class="concluido">
							<h3 class="head"><i class="glyphicon glyphicon-ok" style="color: #349652;"></i>Compra Realizada com Sucesso!</h3>
							<br><br>
							<a href="filmes.jsp" class="filme_comprado">Retornar a Página de Filmes</a>
							<a href="painel.jsp" class="filme_comprado" style="float:right;margin-right:15%;">Ir ao Painel</a>
							</div>
												<div class="clearfix"></div>
						</div>
							
							<!-- comments-section-starts -->
	   
	  <!-- comments-section-ends -->
		 
		  </div>
				<div class="col-md-3 side-bar">
						<div class="featured">
							<h3>Filmes mais acessados hoje</h3>
							
							<ul>
								<li>
									<a href="single.html"><img src="images/f1.jpg" alt="" /></a>
									<p>Plaguers</p>
								</li>
								<li>
									<a href="single.html"><img src="images/f2.jpg" alt="" /></a>
									<p>Padre</p>
								</li>
								<li>
									<a href="single.html"><img src="images/f3.jpg" alt="" /></a>
									<p>Avatar</p>
								</li>
								<li>
									<a href="single.html"><img src="images/f4.jpg" alt="" /></a>
									<p>Jurassic Park</p>
								</li>
								<li>
									<a href="single.html"><img src="images/f5.jpg" alt="" /></a>
									<p>Jogos Vorazes</p>
								</li>
								<li>
									<a href="single.html"><img src="images/f6.jpg" alt="" /></a>
									<p>foto pra muda</p>
								</li>
								<div class="clearfix"></div>
							</ul>
						</div>
						
							</div>

					<div class="clearfix"></div>
			</div>
			</div>
		<div class="review-slider">
			 <ul id="flexiselDemo1">
			<li><img src="images/r1.jpg" alt=""/></li>
			<li><img src="images/r2.jpg" alt=""/></li>
			<li><img src="images/r3.jpg" alt=""/></li>
			<li><img src="images/r4.jpg" alt=""/></li>
			<li><img src="images/r5.jpg" alt=""/></li>
			<li><img src="images/r6.jpg" alt=""/></li>
		</ul>
			<script type="text/javascript">
		$(window).load(function() {
			
		  $("#flexiselDemo1").flexisel({
				visibleItems: 6,
				animationSpeed: 1000,
				autoPlay: true,
				autoPlaySpeed: 3000,    		
				pauseOnHover: false,
				enableResponsiveBreakpoints: true,
				responsiveBreakpoints: { 
					portrait: { 
						changePoint:480,
						visibleItems: 1
					}, 
					landscape: { 
						changePoint:640,
						visibleItems: 2
					},
					tablet: { 
						changePoint:768,
						visibleItems: 3
					}
				}
			});
			});
		</script>
		<script type="text/javascript" src="js/jquery.flexisel.js"></script>	
		</div>		
	</div>
	<div class="clearfix"></div>
	</div>
</body>
</html>
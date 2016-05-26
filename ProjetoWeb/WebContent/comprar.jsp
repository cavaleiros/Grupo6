<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>Cinema XXII</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
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
				<h3 class="head">Página de Compra</h3>
					<div class="col-md-9 reviews-grids">
						<div class="review">
							<div class="movie-pic">
								<a href="filme.jsp"><img src="images/gridallbum5.jpg" alt="" /></a>
							</div>
							<div class="form_compra">
							<form method="post" action="comprado.jsp">
							<div>
							<label>Nome Impresso no Cartão</label>
							<input type="text">
							</div>
							<div>
							<div class="clearfix"></div>
							<label>Numero do Cartão</label>
							
							<input type="text">
							</div>
							<div class="clearfix"></div>
							<div>
							<label>Código de verificação</label>
							<input type="text">
							</div>
							<div class="clearfix"></div>
							<div>
							<label>Validade do cartão</label>
							<select>
							<option>mes</option>
							<option>01</option>
							<option>02</option>
							<option>03</option>
							<option>04</option>
							<option>05</option>
							<option>06</option>
							<option>07</option>
							<option>08</option>
							<option>09</option>
							<option>10</option>
							<option>11</option>
							<option>12</option>
							</select>
							
							<select>
                            <option>Ano</option>
							<option>18</option>
							<option>19</option>
							<option>20</option>
							<option>21</option>
							<option>22</option>
							<option>23</option>
                            </select>
                            </div>
                            <div class="clearfix"></div>
                            <div>
							<label>Bandeira do cartão</label>
							<select>
							<option>Visa</option>
							<option>Mastercard</option>
							</select>
							</div>
							<div>
								<input type="submit" value="Finalizar Compra">
							</div>
							</form>
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
									<a href="filme.jsp"><img src="images/f1.jpg" alt="" /></a>
									<p>Plaguers</p>
								</li>
								<li>
									<a href="filme.jsp"><img src="images/f2.jpg" alt="" /></a>
									<p>Padre</p>
								</li>
								<li>
									<a href="filme.jsp"><img src="images/f3.jpg" alt="" /></a>
									<p>Avatar</p>
								</li>
								<li>
									<a href="filme.jsp"><img src="images/f4.jpg" alt="" /></a>
									<p>Jurassic Park</p>
								</li>
								<li>
									<a href="filme.jsp"><img src="images/f5.jpg" alt="" /></a>
									<p>Jogos Vorazes</p>
								</li>
								<li>
									<a href="filme.jsp"><img src="images/f6.jpg" alt="" /></a>
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
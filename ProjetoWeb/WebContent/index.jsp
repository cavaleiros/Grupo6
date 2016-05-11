<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
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
		<div class="header">
		<%@ include file="topo.jsp" %>
					<div class="header-info">
				<h1>BIG HERO 6</h1>
				<p class="age"><a href="#">Livre</a> Don Hall, Chris Williams</p>
				<p class="review">Nota	:   8,5/10</p>
				<p class="review reviewgo">Genero	: Animação, Ação, Comédia</p>
				<p class="review">Lançamento: 7 Novembro 2014</p>
				<p class="special">The special bond that develops between plus-sized inflatable robot Baymax, and prodigy Hiro Hamada, who team up with a group of friends to form a band of high-tech heroes.</p>
				<a class="book" href="#"><i class="book1"></i>Comprar Agora</a>
				<a class="video" href="#"><i class="video1"></i>Assista o Trailer</a>
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
						visibleItems: 2
					}, 
					landscape: { 
						changePoint:640,
						visibleItems: 3
					},
					tablet: { 
						changePoint:768,
						visibleItems: 4
					}
				}
			});
			});
		</script>
		<script type="text/javascript" src="js/jquery.flexisel.js"></script>	
		</div>
		
		<div class="news">
			<div class="col-md-6 news-left-grid">
				<h3>Não deixe para depois,</h3>
				<h2>Compre agora seu filme!</h2>
				<h4>Fácil, Simples e Rápido.</h4>
				<a href="#"><i class="book"></i>Comprar Agora</a>
				<p>Desconto de  <strong>30%</strong> em sua primeira compra!</p>
			</div>
			<div class="col-md-6 news-right-grid">
				<h3>Notícias</h3>
				<div class="news-grid">
					<h5>Punho de ferro - mais dois atores são confirmados na série.</h5>
					<label> 18 Abril 2016</label>
					<p>De acordo com a Variety, a Marvel acaba de confirmar mais dois nomes no elenco da nova série do estúdio em parceria com a Netflix.<br>
					Os escolhidos são Jessica Stroup e Tom Pelphrey</p>
				</div>
				<div class="news-grid">
					<h5>Doutor Estranho - Marvel finalmente lança o primeiro trailer oficial do filme</h5>
					<label>18 Abril 2016</label>
					<p>Beneditch Cumberbatch estrela o filme com o Dr. Estranho.<br>Dr.Estranho estreia no dia 03 de Novembro deste ano!</p>
				</div>
				<a class="more" href="#">Veja Mais</a>
			</div>
			<div class="clearfix"></div>
		</div>
		<div class="more-reviews">
			 <ul id="flexiselDemo2">
			<li ><img src="images/9.jpg" alt="" style="width:230px;height:300px;"/></li>
			<li ><img src="images/11.jpg" alt="" style="width:230px;height:300px;"/></li>
			<li ><img src="images/5.jpg" alt="" style="width:230px;height:300px;"/ ></li>
			<li ><img src="images/16.png" alt="" style="width:230px;height:300px;"/></li>
		</ul>
			<script type="text/javascript">
		$(window).load(function() {
			
		  $("#flexiselDemo2").flexisel({
				visibleItems: 4,
				animationSpeed: 1000,
				autoPlay: true,
				autoPlaySpeed: 3000,    		
				pauseOnHover: false,
				enableResponsiveBreakpoints: true,
				responsiveBreakpoints: { 
					portrait: { 
						changePoint:480,
						visibleItems: 2
					}, 
					landscape: { 
						changePoint:640,
						visibleItems: 3
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
	</div>
	<div class="clearfix"></div>
</body>
</html>
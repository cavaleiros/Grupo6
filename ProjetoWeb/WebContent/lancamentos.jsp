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
		<div class="video-content">
			<%@ include file="topo.jsp"  %>
						<div class="right-content">
				<div class="right-content-heading">
					<div class="right-content-heading-left">
						<h3 class="head">Ultimos lançamentos</h3>
					</div>
				</div>
				<!-- pop-up-box --> 
		<link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all" />
		<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
		 <script>
				$(document).ready(function() {
				$('.popup-with-zoom-anim').magnificPopup({
					type: 'inline',
					fixedContentPos: false,
					fixedBgPos: true,
					overflowY: 'auto',
					closeBtnInside: true,
					preloader: false,
					midClick: true,
					removalDelay: 300,
					mainClass: 'my-mfp-zoom-in'
				});
				});
		</script>		

		<!--//pop-up-box -->

				<div class="content-grids">
					<div class="content-grid">
						<a class="play-icon popup-with-zoom-anim" href="filmes.jsp"><img src="images/gridallbum1.jpg" title="allbum-name" /></a>
						<h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</h3>
						<ul>
							<li><a href="#"><img src="images/likes.png" title="image-name" /></a></li>
							<li><a href="#"><img src="images/views.png" title="image-name" /></a></li>
							<li><a href="#"><img src="images/link.png" title="image-name" /></a></li>
						</ul>
						<a class="button play-icon popup-with-zoom-anim" href="filmes.jsp">Assistir agora</a>
					</div>
					<div id="small-dialog" class="mfp-hide">
						<iframe  src="https://www.youtube.com/embed/2LqzF5WauAw" frameborder="0" allowfullscreen></iframe>
					</div>
					<div class="content-grid">
						<a class="play-icon popup-with-zoom-anim" href="filmes.jsp"><img src="images/gridallbum2.jpg" title="allbum-name" /></a>
						<h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</h3>
						<ul>
							<li><a href="#"><img src="images/likes.png" title="image-name" /></a></li>
							<li><a href="#"><img src="images/views.png" title="image-name" /></a></li>
							<li><a href="#"><img src="images/link.png" title="image-name" /></a></li>
						</ul>
						<a class="button play-icon popup-with-zoom-anim" href="filmes.jsp">Assistir agora</a>
					</div>
					<div class="content-grid">
						<a class="play-icon popup-with-zoom-anim" href="filmes.jsp"><img src="images/gridallbum3.jpg" title="allbum-name" /></a>
						<h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</h3>
						<ul>
							<li><a href="#"><img src="images/likes.png" title="image-name" /></a></li>
							<li><a href="#"><img src="images/views.png" title="image-name" /></a></li>
							<li><a href="#"><img src="images/link.png" title="image-name" /></a></li>
						</ul>
						<a class="button play-icon popup-with-zoom-anim" href="filmes.jsp">Assistir agora</a>
					</div>
					<div class="content-grid last-grid">
						<a class="play-icon popup-with-zoom-anim" href="filmes.jsp"><img src="images/gridallbum4.jpg" title="allbum-name" /></a>
						<h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</h3>
						<ul>
							<li><a href="#"><img src="images/likes.png" title="image-name" /></a></li>
							<li><a href="#"><img src="images/views.png" title="image-name" /></a></li>
							<li><a href="#"><img src="images/link.png" title="image-name" /></a></li>
						</ul>
						<a class="button play-icon popup-with-zoom-anim" href="filmes.jsp">Assistir agora</a>
					</div>
					<div class="content-grid">
						<a class="play-icon popup-with-zoom-anim" href="filmes.jsp"><img src="images/gridallbum5.jpg" title="allbum-name" /></a>
						<h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</h3>
						<ul>
							<li><a href="#"><img src="images/likes.png" title="image-name" /></a></li>
							<li><a href="#"><img src="images/views.png" title="image-name" /></a></li>
							<li><a href="#"><img src="images/link.png" title="image-name" /></a></li>
						</ul>
						<a class="button play-icon popup-with-zoom-anim" href="filmes.jsp">Assistir agora</a>
					</div>
					<div class="content-grid">
						<a class="play-icon popup-with-zoom-anim" href="filmes.jsp"><img src="images/gridallbum6.jpg" title="allbum-name" /></a>
						<h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</h3>
						<ul>
							<li><a href="#"><img src="images/likes.png" title="image-name" /></a></li>
							<li><a href="#"><img src="images/views.png" title="image-name" /></a></li>
							<li><a href="#"><img src="images/link.png" title="image-name" /></a></li>
						</ul>
						<a class="button play-icon popup-with-zoom-anim" href="filmes.jsp">Assistir agora</a>
					</div>
					<div class="content-grid">
						<a class="play-icon popup-with-zoom-anim" href="filmes.jsp"><img src="images/gridallbum7.jpg" title="allbum-name" /></a>
						<h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</h3>
						<ul>
							<li><a href="#"><img src="images/likes.png" title="image-name" /></a></li>
							<li><a href="#"><img src="images/views.png" title="image-name" /></a></li>
							<li><a href="#"><img src="images/link.png" title="image-name" /></a></li>
						</ul>
						<a class="button play-icon popup-with-zoom-anim" href="filmes.jsp">Assistir agora</a>
					</div>
					<div class="content-grid last-grid">
						<a class="play-icon popup-with-zoom-anim" href="filmes.jsp"><img src="images/gridallbum8.jpg" title="allbum-name" /></a>
						<h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</h3>
						<ul>
							<li><a href="#"><img src="images/likes.png" title="image-name" /></a></li>
							<li><a href="#"><img src="images/views.png" title="image-name" /></a></li>
							<li><a href="#"><img src="images/link.png" title="image-name" /></a></li>
						</ul>
						<a class="button play-icon popup-with-zoom-anim" href="filmes.jsp">Assistir agora</a>
					</div>
					<div class="content-grid">
						<a class="play-icon popup-with-zoom-anim" href="filmes.jsp"><img src="images/gridallbum9.jpg" title="allbum-name" /></a>
						<h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</h3>
						<ul>
							<li><a href="#"><img src="images/likes.png" title="image-name" /></a></li>
							<li><a href="#"><img src="images/views.png" title="image-name" /></a></li>
							<li><a href="#"><img src="images/link.png" title="image-name" /></a></li>
						</ul>
						<a class="button play-icon popup-with-zoom-anim" href="filmes.jsp">Assistir agora</a>
					</div>
					<div class="content-grid">
						<a class="play-icon popup-with-zoom-anim" href="filmes.jsp"><img src="images/gridallbum10.jpg" title="allbum-name" /></a>
						<h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</h3>
						<ul>
							<li><a href="#"><img src="images/likes.png" title="image-name" /></a></li>
							<li><a href="#"><img src="images/views.png" title="image-name" /></a></li>
							<li><a href="#"><img src="images/link.png" title="image-name" /></a></li>
						</ul>
						<a class="button play-icon popup-with-zoom-anim" href="filmes.jsp">Assistir agora</a>
					</div>
					<div class="content-grid">
						<a class="play-icon popup-with-zoom-anim" href="filmes.jsp"><img src="images/gridallbum11.jpg" title="allbum-name" /></a>
						<h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</h3>
						<ul>
							<li><a href="#"><img src="images/likes.png" title="image-name" /></a></li>
							<li><a href="#"><img src="images/views.png" title="image-name" /></a></li>
							<li><a href="#"><img src="images/link.png" title="image-name" /></a></li>
						</ul>
						<a class="button play-icon popup-with-zoom-anim" href="filmes.jsp">Assistir agora</a>
					</div>
					<div class="content-grid last-grid">
						<a class="play-icon popup-with-zoom-anim" href="filmes.jsp"><img src="images/gridallbum1.jpg" title="allbum-name" /></a>
						<h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</h3>
						<ul>
							<li><a href="#"><img src="images/likes.png" title="image-name" /></a></li>
							<li><a href="#"><img src="images/views.png" title="image-name" /></a></li>
							<li><a href="#"><img src="images/link.png" title="image-name" /></a></li>
						</ul>
						<a class="button play-icon popup-with-zoom-anim" href="filmes.jsp">Assistir agora</a>
					</div>
					<div class="clearfix"> </div>
					<!---start-pagenation----->
					<div class="pagenation">
						<ul>
							<li><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">5</a></li>
							<li><a href="#">Próximo</a></li>
						</ul>
					</div>
					<div class="clearfix"> </div>
					<!---End-pagenation----->
				</div>
			</div>
			<div class="clearfix"> </div>
			</div>	
		</div>
	<div class="clearfix"></div>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE HTML>
<head>
<title>Cinema XXII</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="css-painel/style.css" rel="stylesheet" type="text/css" media="all"/>
<link href="css-painel/slider.css" rel="stylesheet" type="text/css" media="all"/>
<script type="text/javascript" src="js-painel/jquery-1.9.0.min.js"></script> 
<script type="text/javascript" src="js-painel/move-top.js"></script>
<script type="text/javascript" src="js-painel/easing.js"></script>
<script type="text/javascript" src="js-painel/jquery.nivo.slider.js"></script>
<script type="text/javascript">
    $(window).load(function() {
        $('#slider').nivoSlider();
    });
    </script>
</head>
<body>
	<div class="header">
		 <div class="headertop_desc">
			<div class="wrap">
				<div class="nav_list">
					<ul>
						<li><a href="index.jsp">Home</a></li>
						
						<li><a href="contato.jsp">Contato</a></li>
					</ul>
				</div>
					<div class="account_desc">
						<ul>
							<li><a href="#" id="sair">Sair</a></li>
							<li><a href="painel.jsp">Minha Conta</a></li>
						</ul>
					</div>
				<div class="clear"></div>
			</div>
	  	</div>
	  	<script>
	  		$('#sair').click(function(){
	  			alert("Obrigado por utiliza nosso sistema!"); 
	  			window.location = 'index.jsp';
	  		});
	  	</script>
  	  		<div class="wrap">
				<div class="header_top">
					<div class="logo">
						<a href="index.jsp" ><img src="images-painel/logo.png" alt="" /></a>
					</div>
						<div class="header_top_right">
						  <div class="cart">
                              <p><span>Carrinho</span><div id="dd" class="wrapper-dropdown-2"> (vazio)</p>
						  	   	<ul class="dropdown">
										<li>Voc� n�o possui filmes em seu carrinho</li>
                              </ul></div>
						  </div>
							  <div class="search_box">
					     		<form>
					     			<input type="text" placeholder="Pesquisar..."><input type="submit" value="">
					     		</form>
					     	</div>
						 <div class="clear"></div>
					</div>
						  <script type="text/javascript">
								function DropDown(el) {
									this.dd = el;
									this.initEvents();
								}
								DropDown.prototype = {
									initEvents : function() {
										var obj = this;
					
										obj.dd.on('click', function(event){
											$(this).toggleClass('active');
											event.stopPropagation();
										});	
									}
								}
					
								$(function() {
					
									var dd = new DropDown( $('#dd') );
					
									$(document).click(function() {
										// all dropdowns
										$('.wrapper-dropdown-2').removeClass('active');
									});
					
								});
					    </script>
			 <div class="clear"></div>
  		</div>     
				<div class="header_bottom">
					<div class="header_bottom_left">				
						<div class="categories">
						   <ul>
						  	   <h3>Categorias</h3>
							      <li><a href="meusfilmes.jsp">Todas</a></li>
							      <li><a href="meusfilmes.jsp">Com�dia</a></li>
							      <li><a href="meusfilmes.jsp">A��o</a></li>
							      <li><a href="meusfilmes.jsp">Aventura</a></li>
							      <li><a href="meusfilmes.jsp">Anima��o</a></li>
							      <li><a href="meusfilmes.jsp">S�ries</a></li>
                                  <li><a href="meusfilmes.jsp">Terror</a></li>
                                  <li><a href="meusfilmes.jsp">Romance</a></li>
                                  <li><a href="meusfilmes.jsp">Drama</a></li>
                                  <li><a href="meusfilmes.jsp">Suspense</a></li>
                                  <li><a href="meusfilmes.jsp">Nacionais</a></li>
<!--
							       <li><a href="meusfilmes.jsp">Kannada</a></li>
							       <li><a href="meusfilmes.jsp">Bengali</a></li>
							       <li><a href="meusfilmes.jsp">Assami</a></li>
							       <li><a href="meusfilmes.jsp">Kids</a></li>
							       <li><a href="meusfilmes.jsp">Animation</a></li>
							       <li><a href="meusfilmes.jsp">Games</a></li>
-->
						  	 </ul>
						</div>					
		  	         </div>
						    <div class="header_bottom_right">					 
						 	    <!------ Slider ------------>
								  <div class="slider">
							      	<div class="slider-wrapper theme-default">
							            <div id="slider" class="nivoSlider">
							                <img src="images-painel/1.jpg" data-thumb="images-painel/1.jpg" alt="" />
							                <img src="images-painel/2.jpg" data-thumb="images-painel/2.jpg" alt="" />
							                <img src="images-painel/3.jpg" data-thumb="images-painel/3.jpg" alt="" />
							                <img src="images-painel/4.jpg" data-thumb="images-painel/4.jpg" alt="" />
							                 <img src="images-painel/5.jpg" data-thumb="images-painel/5.jpg" alt="" />
							            </div>
							        </div>
						   		</div>
						<!------End Slider ------------>
			         </div>
			     <div class="clear"></div>
			</div>
   		</div>

   <!------------End Header ------------>
  <div class="main">
  	<div class="wrap">
      <div class="content">
    	<div class="content_top">
    		<div class="heading">
    		<h3>Novos Filmes</h3>
    		</div>
    	</div>
	      <div class="section group">
				<div class="grid_1_of_5 images_1_of_5">
					 <a href="preview.html"><img src="images-painel/end-game.jpg" alt="" /></a>
					 <h2><a href="preview.html">End Game</a></h2>
					<div class="price-details">
				       <div class="price-number">
							<p><span class="rupees">$620.87</span></p>
					    </div>
					       		<div class="add-cart">								
									<h4><a href="filme.jsp">Comprar FIlme</a></h4>
							     </div>
							 <div class="clear"></div>
					</div>					 
				</div>
				<div class="grid_1_of_5 images_1_of_5">
					 <a href="preview.html"><img src="images-painel/Sorority_Wars.jpg" alt="" /></a>
					 <h2><a href="preview.html">Sorority Wars</a></h2>
					<div class="price-details">
				       <div class="price-number">
							<p><span class="rupees">$620.87</span></p>
					    </div>
					       		<div class="add-cart">								
									<h4><a href="filme.jsp">Comprar FIlme</a></h4>
							     </div>
							 <div class="clear"></div>
					</div>
					 
				</div>
				<div class="grid_1_of_5 images_1_of_5">
					<a href="preview.html"><img src="images-painel/New-Moon-The-Score-cover-twilight.jpg" alt="" /></a>
					 <h2><a href="preview.html">Twilight New Moon</a></h2>
					<div class="price-details">
				       <div class="price-number">
							<p><span class="rupees">$899.75</span></p>
					    </div>
					       		<div class="add-cart">								
									<h4><a href="filme.jsp">Comprar FIlme</a></h4>
							     </div>
							 <div class="clear"></div>
					</div>
				    
				</div>
				<div class="grid_1_of_5 images_1_of_5">
					<a href="preview.html"><img src="images-painel/avatar_movie.jpg" alt="" /></a>
					 <h2><a href="preview.html">Avatar</a></h2>
					 <div class="price-details">
				       <div class="price-number">
							<p><span class="rupees">$599.00</span></p>
					    </div>
					       		<div class="add-cart">								
									<h4><a href="filme.jsp">Comprar FIlme</a></h4>
							     </div>
							 <div class="clear"></div>
					</div>
				</div>
				<div class="grid_1_of_5 images_1_of_5">
					<a href="preview.html"><img src="images-painel/black-swan.jpg" alt="" /></a>
					 <h2><a href="preview.html">Black Swan</a></h2>
					<div class="price-details">
				       <div class="price-number">
							<p><span class="rupees">$679.87</span></p>
					    </div>
					       		<div class="add-cart">								
									<h4><a href="filme.jsp">Comprar FIlme</a></h4>
							     </div>
							 <div class="clear"></div>
					</div>				     
				</div>
			</div>
			<div class="content_bottom">
    		<div class="heading">
    		<h3>Novas S�ries </h3>
    		</div>
    	  </div>
			<div class="section group">
				<div class="grid_1_of_5 images_1_of_5">
					 <a href="preview.html"><img src="images-painel/beauty_and_the_beast.jpg" alt="" /></a>
					 <h2><a href="preview.html">Beauty and the beast</a></h2>
					<div class="price-details">
				       <div class="price-number">
							<p><span class="rupees">$620.87</span></p>
					    </div>
					       		<div class="add-cart">								
									<h4><a href="filme.jsp">Comprar FIlme</a></h4>
							     </div>
							 <div class="clear"></div>
					</div>
					 
				</div>
				<div class="grid_1_of_5 images_1_of_5">
					 <a href="preview.html"><img src="images-painel/Eclipse.jpg" alt="" /></a>
					 <h2><a href="preview.html">Eclipse</a></h2>
					<div class="price-details">
				       <div class="price-number">
							<p><span class="rupees">$620.87</span></p>
					    </div>
					       		<div class="add-cart">								
									<h4><a href="filme.jsp">Comprar FIlme</a></h4>
							     </div>
							 <div class="clear"></div>
					</div>
					 
				</div>
				<div class="grid_1_of_5 images_1_of_5">
					<a href="preview.html"><img src="images-painel/Coraline.jpg" alt="" /></a>
					 <h2><a href="preview.html">Coraline</a></h2>
					<div class="price-details">
				       <div class="price-number">
							<p><span class="rupees">$899.75</span></p>
					    </div>
					       		<div class="add-cart">								
									<h4><a href="filme.jsp">Comprar FIlme</a></h4>
							     </div>
							 <div class="clear"></div>
					</div>
				    
				</div>
				<div class="grid_1_of_5 images_1_of_5">
					<a href="preview.html"><img src="images-painel/Unstoppable.jpg" alt="" /></a>
					 <h2><a href="preview.html">Unstoppable</a></h2>
					 <div class="price-details">
				       <div class="price-number">
							<p><span class="rupees">$599.00</span></p>
					    </div>
					       		<div class="add-cart">								
									<h4><a href="filme.jsp">Comprar FIlme</a></h4>
							     </div>
							 <div class="clear"></div>
					</div>
				</div>
				<div class="grid_1_of_5 images_1_of_5">
					<a href="preview.html"><img src="images-painel/Priest.jpg" alt="" /></a>
					 <h2><a href="preview.html">Priest 3D</a></h2>
					<div class="price-details">
				       <div class="price-number">
							<p><span class="rupees">$679.87</span></p>
					    </div>
					       		<div class="add-cart">								
									<h4><a href="filme.jsp">Comprar FIlme</a></h4>
							     </div>
							 <div class="clear"></div>
					 </div>				     
				</div>
			</div>
       </div>
  </div>
</div>
   <div class="footer">
   	  <div class="wrap">	
	     <div class="section group">
				<div class="col_1_of_4 span_1_of_4 tamanho" >
						<h4>Informa��es</h4>
						<ul>
						<li><a href="#">Sobre</a></li>
						<li><a href="#">Servi�o Customizado</a></li>
						<li><a href="#">Busca Avan�ada</a></li>
						<li><a href="contact.html">Contato</a></li>
						</ul>
					</div>
				
				<div class="col_1_of_4 span_1_of_4 tamanho" >
					<h4>Minha Conta</h4>
						<ul>
							<li><a href="#" id="sair">Sair</a></li>
							<li><a href="#">Carrinho de Compras</a></li>
							<li><a href="#">Favoritos</a></li>
							<li><a href="#">Meus Pedidos</a></li>
							<li><a href="#">Ajuda</a></li>
						</ul>
				</div>
				<div class="col_1_of_4 span_1_of_4 tamanho" >
					<h4>Contato</h4>
						<ul>
							<li><span>+55 11 12345-6789</span></li>
							<li><span>+55 11 98765-4321</span></li>
						</ul>
						<div class="social-icons">
							<h4>Nos acompanhe</h4>
					   		  <ul>
							      <li><a href="#" target="_blank"><img src="images-painel/facebook.png" alt="" /></a></li>
							      <li><a href="#" target="_blank"><img src="images-painel/twitter.png" alt="" /></a></li>
							      <li><a href="#" target="_blank"><img src="images-painel/skype.png" alt="" /> </a></li>
							      <li><a href="#" target="_blank"> <img src="images-painel/linkedin.png" alt="" /></a></li>
							      <div class="clear"></div>
						     </ul>
   	 					</div>
				</div>
			</div>
<!--
			 <div class="copy_right">
				<p>Company Name � All rights Reseverd | Design by  <a href="http://w3layouts.com">W3Layouts</a> </p>
		   </div>			
-->
        </div>
    </div>
    <script type="text/javascript">
		$(document).ready(function() {			
			$().UItoTop({ easingType: 'easeOutQuart' });
			
		});
	</script>
    <a href="#" id="toTop"><span id="toTopHover"> </span></a>
</body>
</html>


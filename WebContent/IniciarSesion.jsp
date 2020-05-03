
<?xml version="1.0" enconding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css?family=Poppins"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700,900"
	rel="stylesheet">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="Styles/style.css">
<link rel="stylesheet" href="Styles/InicioSesion.css">
</head>
<body>
	<header>

		<section class="header-top">
			<div class="container">
				<div class="row">
					<div class="col-md-4">
						<ul>
							<li><a href="#">Account</a></li>
							<li><a href="#">Checkout</a></li>
							<li><a href="#">dashbord</a></li>
						</ul>
					</div>
					<div class="col-md-4">
						<div class="icon">
							<a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i
								class="fa fa-twitter"></i></a> <a href="#"><i
								class="fa fa-google-plus"></i></a> <a href="#"><i
								class="fa fa-linkedin"></i></a> <a href="#"><i
								class="fa fa-wifi"></i></a>
						</div>
					</div>
					<div class="col-md-4">
						<div class="a-right"></div>
					</div>
				</div>
			</div>
		</section>
		<div class="clear"></div>
		<section class="header">
			<div class="container">
				<div class="row">
					<div class="col-md-3">
						<a href="#"><img id="otra " src="../img/contact-512.png"
							alt="Slider"
							style="width: 50px; height: 50px; margin-left: 20%; margin-top: 8%;"></a>


					</div>
					<div class="col-md-7">
						<ul class="nav navbar-nav">
							<li class="active"><a href="#">HOME</a></li>
							<li><a href="#">SHOP</a></li>
							<li><a href="#">BLOG</a></li>
							<li><a href="#">SHORTCODE</a></li>
							<li><a href="#">FEATURE</a></li>
							<li><a href="#">PAGES</a></li>
						</ul>
					</div>

				</div>
				<div class="row">
					<div class="col-md-12">
						<div class="header-part">
							<p>
								INICIO &nbsp;&nbsp;&nbsp;<span><i
									class="fa fa-angle-right" aria-hidden="true"></i>&nbsp;&nbsp;&nbsp;REGISTRO</span>
							</p>
						</div>
					</div>
				</div>
			</div>
		</section>
	</header>

	<section class="our_skill">
		<div class="container">
			<div class="login">

				<div class="login-screen">
					<div class="app-title">
						<h1>Login</h1>
					</div>

					<div class="login-form">
						<form action="Sesiones" method="get">
							<div class="control-group">

								<input type="text" class="login-field" value=""
									placeholder="username" id="login-name"><label
									class="login-field-icon fui-user" for="login-name"></label>
							</div>

							<div class="control-group">

								<input type="password" class="login-field" value=""
									placeholder="password" id="login-pass"><label
									class="login-field-icon fui-lock" for="login-pass"></label>
							</div>

							<input class="btn btn-primary btn-large btn-block" type="submit"
								name="Ingresar" value="Iniciar Sesion" /> <a class="login-link"
								href="#">Lost your password?</a>

						</form>
					</div>

				</div>
			</div>
		</div>
	</section>

	<footer>
		<div class="footer_top">
			<div class="container">
				<div class="row">
					<div class="col-md-4">
						<h2>INFORMATION</h2>
						<a href="#"><p>
								<i class="fa fa-circle" aria-hidden="true"></i>Best sellers
							</p></a> <a href="#"><p>
								<i class="fa fa-circle" aria-hidden="true"></i>Best sellers
							</p></a> <a href="#"><p>
								<i class="fa fa-circle" aria-hidden="true"></i>Best sellers
							</p></a> <a href="#"><p>
								<i class="fa fa-circle" aria-hidden="true"></i>Best sellers
							</p></a> <a href="#"><p>
								<i class="fa fa-circle" aria-hidden="true"></i>Best sellers
							</p></a>
					</div>
					<div class="col-md-4 center">
						<h2>INFORMATION</h2>
						<a href="#"><p>
								<i class="fa fa-circle" aria-hidden="true"></i>Best sellers
							</p></a> <a href="#"><p>
								<i class="fa fa-circle" aria-hidden="true"></i>Best sellers
							</p></a> <a href="#"><p>
								<i class="fa fa-circle" aria-hidden="true"></i>Best sellers
							</p></a> <a href="#"><p>
								<i class="fa fa-circle" aria-hidden="true"></i>Best sellers
							</p></a> <a href="#"><p>
								<i class="fa fa-circle" aria-hidden="true"></i>Best sellers
							</p></a>
					</div>
					<div class="col-md-4">
						<div class="footer-contact">
							<h2>CONTACT US</h2>
							<a href="#"><p>
									<i class="fa fa-map-marker" aria-hidden="true"></i>Rangpur ,
									Bangladesh
								</p></a> <a href="#"><p>
									<i class="fa fa-phone" aria-hidden="true"></i>+88 01761070282
								</p></a> <a href="#"><p>
									<i class="fa fa-envelope" aria-hidden="true"></i>sshahriar458@gmail.com
								</p></a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="footer_bottom">
			<div class="footer_overlay"></div>
			<div class="container">
				<div class="row">
					<div class="col-md-4">
						<div class="copy_txt">
							<p>
								Copyright © 2020 diseby <span>shawon</span>
							</p>
						</div>
					</div>
					<div class="col-md-8">
						<div class="footer_logo">
							<img src="../img/fedex.png"><img
								src="../img/master-card.png"><img src="../img/paypal.png"><img
								src="../img/visa.png"><img
								src="../img/american-express.png"><img
								src="../img/dhl.png">
						</div>
					</div>
				</div>
			</div>
		</div>
	</footer>
	<script src="http://code.jquery.com/jquery-1.7.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/active.js"></script>


</body>
</html>
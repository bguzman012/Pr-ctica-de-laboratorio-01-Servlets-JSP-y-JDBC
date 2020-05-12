
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core"%>


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
<link rel="stylesheet" href="/Telefonica/css/bootstrap.css">
<link rel="stylesheet" href="/Telefonica/css/font-awesome.min.css">
<link rel="stylesheet" href="/Telefonica/Styles/styles2.css">
<link rel="stylesheet" href="/Telefonica/Styles/InicioSesion.css">
</head>
<body>
	<header>

		<section class="header-top">
			<div class="container">
				<div class="row">
					<div class="col-md-4">
						<ul>
							<li><a href="/Telefonica/index.html">Inicio</a></li>
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
						<a href="/Telefonica/index.html"><img id="otra " src="/Telefonica/img/tele.png"
							alt="Slider"
							style="width: 50px; height: 50px; margin-left: 20%; margin-top: 8%;"></a>


					</div>
					<div class="col-md-7">
						<div class="contenedor">

							<p>
								<a href=""> Telefonica </a>
							</p>
						</div>
					</div>

				</div>
				<div class="row">
					<div class="col-md-12">
						<div class="header-part">
						
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
						<h1>Sign in</h1>
					</div>

					<div class="login-form">
						<form action="/Telefonica/ControladorRegistrar" method="post">

							<div class="control-group">


								<label for="identificacion">Cedula:</label> <input type="text"
									id="identificacion" name="cedula" value="${cedula}"
									placeholder="Ingrese cedula" maxlength="10" class="login-field" />
								<div style="color: red;">${requestScope.validacionesCedula}</div>
								<label for="nombre">Nombre:</label><input type="text"
									id="nombre" name="nombre" value="${nombre}"
									placeholder="Ingrese nombres" minlength="3" maxlength="48"
									class="login-field" />
								<div style="color: red;">${requestScope.validacionesNombre}</div>
								<label for="apellido">Apellido:</label> <input type="text"
									id="apellido" name="apellido" value="${apellido}"
									placeholder="Ingrese apellidos" minlength="3" maxlength="48"
									class="login-field" />
								<div style="color: red;">${requestScope.validacionesApellido}</div>
								<label for="email">Correo Electronico:</label> <input
									type="email" id="email" name="email" maxlength="97"
									value="${correo}" placeholder="Ingrese correo"
									class="login-field" />
								<div style="color: red;">${requestScope.validacionesCorreo}</div>
								<label for="password">Contraseña:</label><input type="password"
									id="password" name="password" value="${pass}"
									placeholder="Ingrese contraseña" class="login-field" />
								<div style="color: red;">${requestScope.validacionesPassw}</div>
								<label for="password">Confirmar Contraseña:</label><input
									type="password" id="confirma" name="confirma"
									value="${confirma}" placeholder="Ingrese contraseña"
									class="login-field" />
								<div style="color: red;">${requestScope.validacionesPasswConf}</div>

							</div>

							<br /> <input class="btn btn-primary btn-large btn-block"
								type="submit" name="Ingresar" value="Registrarse" /> 

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
						<h2>INFORMACION</h2>
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
						<h2>INFORMACION</h2>
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
							<h2>CONTACTANOS</h2>
							<a href="#"><p>
									<i class="fa fa-map-marker" aria-hidden="true"></i>Cuenca ,
									Ecuador
								</p></a> <a href="#"><p>
									<i class="fa fa-phone" aria-hidden="true"></i>+593968420404
								</p></a> <a href="#"><p>
									<i class="fa fa-envelope" aria-hidden="true"></i>bryamgmfn@gmail.com
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
								Copyright © 2020 disenado por <span>Bryam Guzman</span>
							</p>
						</div>
					</div>
					<div class="col-md-8">
						<div class="footer_logo">
							<img src="/Telefonica/img/fedex.png"> <img src="/Telefonica/img/master-card.png">
							<img src="/Telefonica/img/paypal.png"> <img src="/Telefonica/img/visa.png"> <img
								src="/Telefonica/img/american-express.png"> <img src="/Telefonica/img/dhl.png">
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
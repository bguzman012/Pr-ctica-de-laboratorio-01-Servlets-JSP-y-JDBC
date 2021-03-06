
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Buscar Contacto</title>
<C:set var="usu" value="${sessionScope['usuario']}" />
<link href="https://fonts.googleapis.com/css?family=Poppins"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700,900"
	rel="stylesheet">
<link rel="stylesheet" href="/Telefonica/css/bootstrap.css">
<link rel="stylesheet" href="/Telefonica/css/font-awesome.min.css">
<link rel="stylesheet" href="/Telefonica/Styles/style.css">
<link rel="stylesheet" href="/Telefonica/Styles/InicioSesion.css">
<link rel="stylesheet" type="text/css" href="/Telefonica/css/util.css">
<link rel="stylesheet" type="text/css" href="/Telefonica/css/main.css">
</head>
<body>
	<header>

		<section class="header-top">
			<div class="container">
				<div class="row">
					<div class="col-md-4">
						<ul>

							<li><a href="#"><p>
										<span><i class="fa fa-user"></i></span>${usu.nombre}
										${usu.apellido}
									</p> </a></li>

						</ul>					</div>
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
						<div class="a-right">
							<a href="/Telefonica/ControladorSesion?salir=1">
								<p>
									<span><i class=></i></span>Cerrar Sesion
								</p>
							</a>
						</div>
					</div>
				</div>
			</div>
		</section>
		<div class="clear"></div>
		<section class="header">
			<div class="container">
				<div class="row">
					<div class="col-md-3">
						<a href="../index.html"><img id="otra " src="/Telefonica/img/tele.png"
							alt="Slider"
							style="width: 50px; height: 50px; margin-left: 20%; margin-top: 8%;"></a>


					</div>
					<div class="col-md-7">
						<ul class="nav navbar-nav">
							<li><a href="/Telefonica/JSPs/CuentaPrincipal.jsp">MI
									PERFIL</a></li>
							<li class="active"><a href="#">BUSCAR USUARIO</a></li>
							<li><a href="/Telefonica/JSPs/ActualizarTelefono.jsp">MODIFICAR
									INFORMACION PERSONAL</a></li>

						</ul>
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
			<div class="limiter">
				<div class="container-table100">
					<form action="/Telefonica/ControladorBuscarContacto" method="post"
						style="margin-top: 12px; margin-bottom: 12px;">
						<label for="cars" style="font-size: x-large;">Buscar por:</label>
						<select id="cars" name="opcion">
							<option value="cedula">Cedula</option>
							<option value="correo">Correo</option>

						</select> <input type="text" name="parametro" placeholder="Ingrese dato"
							id="login-name" value="${parInval}" style="margin-top: 6px;"><input
							class="boton" type="submit" name="Ingresar" value="Buscar" />
						<br>
						<div style="color: red; margin-left: 310px;margin-top: 36px;">${error}</div>

						<C:set var="u" value="${requestScope['usuario']}" />



					</form>
					<div class="wrap-table100">
						<div class="table100 ver1">


							<div class="wrap-table100-nextcols js-pscroll">
								<div class="table100-nextcols">
									<table>
										<p>
										<pre style="padding-bottom: 0px;">     <b>${nn}</b>${u.nombre} ${u.apellido} 		<b>${cc}</b>${u.cedula} 		<b>${crr}</b><a
												href="mailto:${u.correo}">${u.correo}</a>
										</pre>
										</p>

										<thead>
											<tr class="row100 head">
												<th class="cell100 column2">Numero Telefonico</th>
												<th class="cell100 column3">Tipo Telefono</th>
												<th class="cell100 column4">Operadora</th>

											</tr>
										</thead>

										<tbody>

											<C:forEach var="telefono" items="${u.telefonos}">

												<tr class="row100 body">

													<td class="cell100 column2"><a
														href="tel:${telefono.numero}">${telefono.numero}</a></td>

													<td class="cell100 column3">${telefono.tipo}</td>
													<td class="cell100 column4">${telefono.operadora}</td>

												</tr>
											</C:forEach>

										</tbody>
									</table>
								</div>
							</div>
						</div>
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
								Copyright � 2020 disenado por <span>Bryam Guzman</span>
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
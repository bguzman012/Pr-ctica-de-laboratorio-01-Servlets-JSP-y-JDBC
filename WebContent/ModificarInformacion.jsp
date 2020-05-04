
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
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="Styles/style.css">
<link rel="stylesheet" href="Styles/InicioSesion.css">
<link rel="stylesheet" type="text/css" href="css/util.css">
<link rel="stylesheet" type="text/css" href="css/main2.css">
</head>
<body>
	<header>

		<C:set var="u" value="${requestScope['usuario']}" />
		<section class="header-top">
			<div class="container">
				<div class="row">
					<div class="col-md-4">
						<ul>
							<li><a href="#">${u.nombre} ${u.apellido}</a></li>

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
						<a href="#"><img id="otra " src="img/contact-512.png"
							alt="Slider"
							style="width: 50px; height: 50px; margin-left: 20%; margin-top: 8%;"></a>


					</div>
					<div class="col-md-7">
						<ul class="nav navbar-nav">
							<li class="active"><a href="#">PERFIL</a></li>
							<li><a href="#">BUSCAR USUARIO</a></li>
							<li><a href="#">MODIFICAR INFORMACION PERSONAL</a></li>

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
			<div class="limiter">
				<div class="container-table100">

					<form class="boni" action="LlenarTabla" method="post">




						<br> </br>
						<p id="Principal">
							<b>Infromacion del usuario:</b>
						</p>
						<br> </br>
						<p>
							<b>Nombre: </b>${u.nombre} ${u.apellido}
						</p>
						<br> </br>

						<p>
							<b>Cedula: </b>${u.cedula}
						</p>
						<br> </br>
						<p>
							<b>Correo: </b><a href="mailto:${u.correo}">${u.correo}</a>
						</p>

					</form>
					<form action="ControladorTelefono" method="post"
						style="margin-top: 26px; padding-top: 14px;">


						<p>
							<b style="font-size: x-large;"> Registrar Numero Telefonico </b>
						</p>

						<br>
						<input class="mi" type="tel" name="cc" id="hola"
							value="${u.cedula}"><label for="telefono">Ingrese
							Numero telefonico:</label> <input type="tel" name="telefono"
							id="login-name" maxlength="10">
						<div style="color: red;">${requestScope.validacionTelefono}</div>
						<label class="hh" for="operadoras">Operadora:</label> <select
							id="operadoras" name="operadoras">
							<option value="Claro">Claro</option>
							<option value="Movistar">Movistar</option>
							<option value="Twenti">Twenti</option>
							<option value="CNT">CNT</option>


						</select> <label class="hh" for="tipo">Tipo:</label> <select id="tipo"
							name="tipo">
							<option value="Celular">Celular</option>
							<option value="Fijo">Fijo</option>


						</select> <input class="btn btn-primary btn-large btn-block" type="submit"
							name="Ingresar" value="Registrar Telefono">
					</form>
					<div class="wrap-table100">
						<div class="table100 ver1">


							<div class="wrap-table100-nextcols js-pscroll">
								<div class="table100-nextcols">

									<div
										style="color: black; font-size: larger; padding-top: 5px; 
										padding-left: 5px;">${requestScope.bien}: ${requestScope.num}</div>

									<table>
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
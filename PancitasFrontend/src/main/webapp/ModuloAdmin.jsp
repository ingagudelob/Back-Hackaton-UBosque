<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<HEAD>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style>

</style>
		<meta charset="utf-8">
		<TITLE>Pancitas llenas</TITLE> 
	</HEAD>
			<BODY>


		<header>
			<section>
			<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a href="http://localhost:8080/PancitasFrontend/Index.html" class="navbar-brand" id="logo" ><img src="pancitasLlenas.jpeg" width="250px"></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="http://localhost:8080/PancitasFrontend/IMG/AcercadeNosotros.html">Conocenos</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="http://localhost:8080/PancitasFrontend/ModuloInscripcion.jsp">Inscripcion</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="http://localhost:8080/PancitasFrontend/ModuloDonaciones.jsp">Donaciones</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="http://localhost:8080/PancitasFrontend/Login.html">Login</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="http://localhost:8080/PancitasFrontend/Login.html">Cerrar Sesion</a>
        </li>
        
        <li class="nav-item dropdown">
          
                 </li>
      </ul>
    </div>
  </div>
</nav>
			</header>
		</section>
		

		<form method="get" action="./ServletUsuario">
			<label for="cars">Selecciona el Rol con el que deseas Participar:</label><br> <select id="Rol" name="Rol">
				<option value="volvo">Restaurante</option>
				<option value="saab">Conductor</option>
				<option value="fiat"></option>
				<option value="audi">Audi</option>
			</select> 
			
				<input type="submit">
				<p>Documento-Nit: </p>
				<input type="number" name="id">
				<p>Nombre: </p>
				<input type="text" name="nombre">
				<p>Email: </p>
				<input type="email" name="email">
				<p>Telefono: </p>
				<input type="number" name="telefono">
				<p>Usuario: </p>
				<input type="text" name="usuario">
				<p>Contraseña: </p>
				<input type="password" name="password">	<br><br>	

				<button type="submit" value="Listar" name="Listar">Consultar</button>
				<button type="submit" value="Agregar" name="Agregar">Registrarse</button>
				<button type="submit" value="actualizar" name="Actualizar">Actualizar</button>
				<button type="submit" value="borrar" name="Eliminar">Borrar</button>										
			
		</form>

		<section id="about" class="content">



			</BODY> 
</HTML>>
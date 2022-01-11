<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
		<!-- <link rel="stylesheet" type="text/css" href="style.css" /> -->
		<meta charset="utf-8">
		<TITLE>Pancitas llenas</TITLE> 
		<style >
	
	h1{
	
    font-family: 'Libre Baskerville', serif;
	color:#D00FD5;
	}
		</style>
	</HEAD>
			<BODY>


		<header>
		
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a href="http://localhost:8080/PancitasFrontend/Index.html" class="navbar-brand" id="logo" ><img src="./IMG/pancitasLlenas.jpeg" width="250px"></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="./IMG/AcercadeNosotros.html">Conocenos</a>
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

	<div class="container">
		<form method="post" action="./ServletDonaciones" class="row g-3">
		
  <div class="col-md-6">
    <label for="inputEmail4" class="form-label">Que desea donar:</label>
    <input type="text" class="form-control" required="required" id="inputEmail4" name="id">
  </div>
   <div class="col-6">
    <label for="inputAddress" class="form-label">Dirección para recoger donación:
</label>
    <input type="text" class="form-control" required="required" id="inputAddress" name="nombreRestaurante" placeholder="">
  </div>
 <div class="col-6">
    <label for="inputAddress" class="form-label">Hora de recepción:
</label>
    <input type="text" class="form-control" id="inputAddress" name="contactoRestaurante">
  </div>
  
  <div class="col-md-6">
    <label for="inputCity" class="form-label">Desea dejar un mensaje para las personas que reciben su donación:
</label>
    <input type="text" class="form-control" id="inputCity" name="ciudadRestaurate">
  </div>
  <div class="col-md-6">
    <label for="inputAddress" class="form-label">Dirección a recoger donación:</label>
    <input type="text" class="form-control" id="inputAddress" name="dirRestaurante">
  </div>
  
  <div class="col-md-6">
    <label for="inputCity" class="form-label">Teléfono Contacto:</label>
    <input type="number" class="form-control" id="inputCity" name="teflRestaurante">
  </div>
  
  <div class="col-md-4">
    <label for="inputState" class="form-label">Necesita certificado:</label>
    <select id="inputState" class="form-select">
     <option selected>Certificado</option>
	  <option value="si">Generar</option>
	  <option value="no">Consultar</option>
	  </select>
  </div>
  
  
  <div class="col-12">
 	     <button type="submit" value="Agregar" name="Agregar" class="btn btn-primary">Registrarse</button>
		 <button type="submit" value="Listar" name="Listar" class="btn btn-primary">Consultar</button>
  </div>
 </form>
</div>
</body>
</html>
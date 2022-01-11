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
    <a href="http://localhost:8080/PancitasFrontend/Index.html" class="navbar-brand" id="logo" ><img src="./IMG/pancitasLlenas.jpeg" width="250px"></a>
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
          <a class="nav-link active" aria-current="page" href="http://localhost:8080/PancitasFrontend/ModuloReportes.jsp">Reportes</a>
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
		<div class="container">
		<form method="post" action="./ServletRestaurante" class="row g-3">
		
  <div class="col-md-6">
    <label for="inputEmail4" class="form-label">Nit:</label>
    <input type="text" class="form-control" required="required" id="inputEmail4" name="id">
  </div>
   <div class="col-6">
    <label for="inputAddress" class="form-label">Restaurante:</label>
    <input type="text" class="form-control" required="required" id="inputAddress" name="nombreRestaurante" placeholder="Allegra with heart">
  </div>
 <div class="col-6">
    <label for="inputAddress" class="form-label">Nombre Contacto:</label>
    <input type="text" class="form-control" id="inputAddress" name="contactoRestaurante">
  </div>
  <div class="col-md-6">
    <label for="inputCity" class="form-label">Email:</label>
    <input type="email" class="form-control" id="inputCity" name="emailRestaurante">
  </div>
  <div class="col-md-6">
    <label for="inputCity" class="form-label">Ciudad:</label>
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
    <label for="inputState" class="form-label">Productos a recoger:</label>
    <select id="inputState" class="form-select">
     <option selected>Selection menu</option>
	  <option value="platoCompleto">Plato Completo</option>
	  <option value="productos">Productos Perecederos</option>
	  </select>
  </div>
  <div class="col-6">
    <label for="inputAddress" class="form-label">Cantidad Platos:</label>
    <input type="text" class="form-control" required="required" name="cantidadPlatos" id="inputAddress">
  </div>
   <div class="col-6">
    <label for="inputAddress" class="form-label">Cantidad Productos Perecederos:</label>
    <input type="text" class="form-control" required="required" name="cantidadProductos" id="inputAddress">
  </div>
  
  <div class="col-12">
 	     <button type="submit" value="Agregar" name="Agregar" class="btn btn-primary">Registrarse</button>
		 <button type="submit" value="Listar" name="Listar" class="btn btn-primary">Consultar</button>
  </div>
 </form>
</div>
		
			
			
			
		       
		

		



			</BODY> 
</HTML>
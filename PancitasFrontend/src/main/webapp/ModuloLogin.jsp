<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<HTML>
	<HEAD>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
		<meta charset="utf-8">
		<script>
  function mostrarContrasena(){
      var tipo = document.getElementById("password");
      if(tipo.type == "password"){
          tipo.type = "text";
      }else{
          tipo.type = "password";
      }
  }
  H3 {text-align: center;}
</script>
		<TITLE>Pancitas llenas</TITLE> 
	</HEAD>
			<BODY>
		<div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="..." class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="..." class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="..." class="d-block w-100" alt="...">
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>
				
				
				<section>
				<table class="tabla-login">
				<tr>
					<td width="55%"> <img src="pancitasLlenas.jpeg" width="520" height="300"></td>
					<td>
				<FORM method="post" action="./ServletLogin">
					<h3>Usuario:	</h3> <input type="text" required="required" name="usuario" class=email>
					<br><br>
					<h3>Contraseña:	</h3> <input type="password" required="required" name="password" id="password" class=pwd > <br>
					<button onclick="mostrarContrasena()" class="boton2">Mostrar contrseña</button>

					<br><br>
					<input type="submit" value="Aceptar"  class="boton2">
					<input type="reset" value="Cancelar" class="boton2"><br>
				</td>
					
				</table>	
				</FORM>
				
			</section>

			</BODY> 
</HTML>
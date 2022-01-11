package hackaton.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hackaton.Dao.UsuariosDao;
import hackatonDto.Usuarios;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuarioDigitado = request.getParameter("usuario");
		String contrasenaDigitada = request.getParameter("password");
		String admin = "admininicial";
		String adminpass = "admin123456";
		Usuarios dto = new Usuarios();
		dto.setUser(admin);
		dto.setPass(adminpass);
		
		if(dto.getUser().equals(usuarioDigitado)&& dto.getPass().equals(contrasenaDigitada) ) {
			//ingresarUsuario(request, response);
			response.sendRedirect("http://localhost:8080/PancitasFrontend/Index.html");
		
		}else {
			
			response.sendRedirect("http://localhost:8080/PancitasFrontend/Login.html");
			
		}
		
	}
	
	public void ingresarUsuario(HttpServletRequest request, HttpServletResponse response) {
		Usuarios usuario=new Usuarios();
	
		usuario.setUser(request.getParameter("usuario"));
		usuario.setPass(request.getParameter("password"));
		int respuesta=0;
		try {
			respuesta=UsuariosDao.postLoginUsuarioJSON(usuario);
			PrintWriter writer=response.getWriter();
			if(respuesta==200) {
				
				response.sendRedirect("http://localhost:8080/PancitasFrontend/Index.html");
				
			}else {
				writer.println("Error: "+respuesta);
				response.sendRedirect("http://localhost:8080/PancitasFrontend/Login.html");
				
			}
			writer.close();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	}



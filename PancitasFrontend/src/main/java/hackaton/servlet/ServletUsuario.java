package hackaton.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hackaton.Dao.UsuariosDao;
import hackatonDto.Usuarios;

/**
 * Servlet implementation class ServletUsuario
 */
@WebServlet("/ServletUsuario")
public class ServletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: Error at Servlet ").append(request.getContextPath());
	    
		String ListarUsuarios= request.getParameter("ListarUsuarios");
		String listar= request.getParameter("Listar");
		String agregar = request.getParameter("Agregar");
		System.out.println(agregar);
		String eliminar = request.getParameter("Eliminar");
		String actualizar = request.getParameter("Actualizar");
		
		Usuarios dto = new Usuarios();
		String ced= request.getParameter("cedula");
		
	
		
		if(agregar != null){
			
			agregarUsuario(request, response);
			System.out.println(agregar);
		}
		/**if(listar!=null ) {
			
				if(ced.equals(dto)) {
					
					usuarioListado(request, response);
				
				}if(ced.isEmpty()) {
			
					listarUsuarios(request, response);
				}
			
		}
		if(eliminar!=null ) {
			eliminarUsuario(request, response);
			
		}
		if(actualizar!=null ) {
			agregarUsuario(request, response);
			
		}
		if(ListarUsuarios!=null ) {
			listarUsuarios(request, response);
			
		}**/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public void agregarUsuario(HttpServletRequest request, HttpServletResponse response) {
		Usuarios usuario=new Usuarios();
		String id=request.getParameter("id");
		int ced=Integer.parseInt(id);
		usuario.setId(ced);
		
		usuario.setNombreUsuario(request.getParameter("nombre"));
		usuario.setEmailUsuario(request.getParameter("email"));
		usuario.setUser(request.getParameter("usuario"));
		usuario.setPass(request.getParameter("password"));
		usuario.setTelfUsuario(request.getParameter("telefono"));
		int respuesta=0;
		try {
			respuesta=UsuariosDao.postJSON(usuario);
			PrintWriter writer=response.getWriter();
			if(respuesta==200) {
				
				response.sendRedirect("http://localhost:8080/PancitasFrontend/Index.html");
				
			}else {
				writer.println("--- No se Detecta Registro: "+respuesta);
				
			}
			writer.close();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	/**
	public void listarUsuarios(HttpServletRequest request, HttpServletResponse response) {
		try {
		ArrayList<Usuarios> lista = UsuariosDao.getJSON();
		System.out.println(lista);
		String pagina ="/ListaUsuarios.jsp";
		request.setAttribute("lista", lista);
		RequestDispatcher dispacher= getServletContext().getRequestDispatcher(pagina);
		dispacher.forward(request, response);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public void usuarioListado(HttpServletRequest request, HttpServletResponse response) {

		Usuarios usuario = new Usuarios();
		String id = request.getParameter("cedula");
		
		usuario.setId(id);
		try {
			ArrayList<Usuarios> lista = UsuariosDao.getMonoJSON(id);

		
			String pagina = "/Usuarios/UsuarioListado.jsp";
			//String pagina = "/ListaUsuarios.jsp";
			
			request.setAttribute("lista", lista);
		
			for (Usuarios usuario2: lista){
				
				String cedula=usuario2.getCedulaUsuario();
				request.setAttribute("cedula", cedula);
				
					String nombre=usuario2.getNombreUsuario();
					request.setAttribute("nombre", nombre);
					
					String email=usuario2.getEmailUsuario();
					request.setAttribute("email", email);
					
					String user=usuario2.getUsuario();
					request.setAttribute("usuario", user);
					
					String contrasena=usuario2.getPassword();
					request.setAttribute("password", contrasena);
			}
			RequestDispatcher dispacher = getServletContext().getRequestDispatcher(pagina);
			dispacher.forward(request, response);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	
	
	public void eliminarUsuario(HttpServletRequest request, HttpServletResponse response) {
		Usuarios usuario=new Usuarios();
		usuario.setCedulaUsuario(request.getParameter("cedula"));
		
		int respuesta=0;
		try {
			respuesta=UsuariosDao.deleteUsuarioJSON(usuario);
			PrintWriter writer=response.getWriter();
			if(respuesta==200) {
				
				response.sendRedirect("/frontend/bienvenida.html");
				
			}else {
				writer.println("Error: "+respuesta);
				
			}
			writer.close();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public void actualizarUsuario(HttpServletRequest request, HttpServletResponse response) {
		Usuarios usuario=new Usuarios();
		usuario.setCedulaUsuario(request.getParameter("cedula"));
		usuario.setNombreUsuario(request.getParameter("nombre"));
		usuario.setEmailUsuario(request.getParameter("email"));
		usuario.setUsuario(request.getParameter("usuario"));
		usuario.setPassword(request.getParameter("password"));
		int respuesta=0;
		try {
			respuesta=UsuariosDao.putJSON(usuario);
			PrintWriter writer=response.getWriter();
			if(respuesta==200) {
				
				response.sendRedirect("/frontend/bienvenida.html");
				
			}else {
				writer.println("--- No se Detecta Registro: "+respuesta);
				
			}
			writer.close();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
**/
}

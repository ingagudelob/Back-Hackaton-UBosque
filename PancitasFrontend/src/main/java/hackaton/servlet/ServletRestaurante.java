package hackaton.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hackaton.Dao.RestaurantesDao;

import hackatonDto.Restaurantes;


/**
 * Servlet implementation class ServletRestaurante
 */
@WebServlet("/ServletRestaurante")
public class ServletRestaurante extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRestaurante() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: Error at Servlet ").append(request.getContextPath());
	    
		String ListarRestaurante= request.getParameter("ListarRestaurante");
		String listar= request.getParameter("Listar");
		String agregar = request.getParameter("Agregar");
		System.out.println(agregar);
		String eliminar = request.getParameter("Eliminar");
		String actualizar = request.getParameter("Actualizar");
		
		Restaurantes dto = new Restaurantes();
		String ced= request.getParameter("cedula");
		
	
		
		if(agregar != null){
			
			agregarRestaurante(request, response);
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
	
	public void agregarRestaurante(HttpServletRequest request, HttpServletResponse response) {
		Restaurantes restaurantes=new Restaurantes();
		String id,plato,producto; 
		
		id=request.getParameter("id");
		int ced=Integer.parseInt(id);
		restaurantes.setId(ced);
		
		plato=request.getParameter("cantidadPlatos");
		int plat=Integer.parseInt(plato);
		restaurantes.setPlatos(plat);
		
		producto=request.getParameter("cantidadProductos");
		int prod=Integer.parseInt(producto);
		restaurantes.setProductos(prod);
		
		restaurantes.setNombreRestaurante(request.getParameter("nombreRestaurante"));
		restaurantes.setContactoRestaurante(request.getParameter("contactoRestaurante"));
		restaurantes.setEmailRestaurante(request.getParameter("emailRestaurante"));
		restaurantes.setCiudadRestaurate(request.getParameter("ciudadRestaurate"));
		restaurantes.setDirRestaurante(request.getParameter("dirRestaurante"));
		restaurantes.setTeflRestaurante(request.getParameter("teflRestaurante"));
		//restaurantes.setPassRestaurante(request.getParameter("passRestaurante"));
		int respuesta=0;
		try {
			respuesta=RestaurantesDao.postJSON(restaurantes);
			PrintWriter writer=response.getWriter();
			System.out.println(respuesta);
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

}

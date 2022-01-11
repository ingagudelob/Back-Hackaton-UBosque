package hackaton.Dao;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;

import hackatonDto.Usuarios;


public class UsuariosDao {
	private static URL url;
	private static String sitio = "http://localhost:9000/";
	
	public static ArrayList<Usuarios> getJSON() throws IOException, ParseException{
		url = new URL(sitio+"/apiPancitas/usuarios/finAllUsuarios");
		HttpURLConnection http = (HttpURLConnection)url.openConnection();
		http.setRequestMethod("GET");
		http.setRequestProperty("Accept", "application/json");
		InputStream respuesta = http.getInputStream();
		byte[] inp = respuesta.readAllBytes();
		String json = "";
		for (int i = 0; i<inp.length ; i++) {
		json += (char)inp[i];
		}
		ArrayList<Usuarios> lista = new ArrayList<Usuarios>();
		lista = parsingUsuarios(json);
		http.disconnect();
		return lista;
		}
	
	
	public static ArrayList<Usuarios> parsingUsuarios(String json) throws ParseException {
		 JSONParser jsonParser = new JSONParser();
		 ArrayList<Usuarios> lista = new ArrayList<Usuarios>();
		 JSONArray usuarios = (JSONArray) jsonParser.parse(json);
		 Iterator i = usuarios.iterator();
		 while (i.hasNext()) {
			 JSONObject innerObj = (JSONObject) i.next();
			
			 
			 Usuarios usuario = new Usuarios();
			 String id;
			 
			 id=(innerObj.get("id").toString());
			 usuario.setId(Integer.parseInt(id));
			 
			 usuario.setNombreUsuario(innerObj.get("nombreUsuario").toString());
			 usuario.setEmailUsuario(innerObj.get("emailUsuario").toString());
		     usuario.setUser(innerObj.get("user").toString());
		     usuario.setPass(innerObj.get("pass").toString());
		     usuario.setTelfUsuario(innerObj.get("telfUsuario").toString());
			 lista.add(usuario);
		 }
		 return lista;
		}
	
	public static int postJSON(Usuarios usuario) throws IOException {
		url = new URL(sitio+"/apiPancitas/usuarios/addUsuario");
		HttpURLConnection http;
		http = (HttpURLConnection)url.openConnection();
		try {
		http.setRequestMethod("POST");
		} catch (ProtocolException e) {
		e.printStackTrace();
		}
		http.setDoOutput(true);
		http.setRequestProperty("Accept", "application/json");
		http.setRequestProperty("Content-Type", "application/json");
		
		Gson gson=new Gson();
		String data=gson.toJson(usuario);
		
		byte[] out = data.getBytes(StandardCharsets.UTF_8);
		OutputStream stream = http.getOutputStream();
		stream.write(out);
		int respuesta = http.getResponseCode();
		http.disconnect();
		return respuesta;
		}
	
	public static int  postLoginUsuarioJSON(Usuarios usuario) throws IOException{
		url = new URL(sitio+"/apiPancitas/usuarios/login");
		HttpURLConnection http;
		http = (HttpURLConnection)url.openConnection();
		try {
		http.setRequestMethod("POST");
		} catch (ProtocolException e) {
		e.printStackTrace();
		}
		http.setDoOutput(true);
		http.setRequestProperty("Accept", "application/json");
		http.setRequestProperty("Content-Type", "application/json");
		
		Gson gson=new Gson();
		String data=gson.toJson(usuario);
		
		byte[] out = data.getBytes(StandardCharsets.UTF_8);
		OutputStream stream = http.getOutputStream();
		stream.write(out);
		int respuesta = http.getResponseCode();
		http.disconnect();
		return respuesta;
		}
	
	
	public static int  deleteUsuarioJSON(Usuarios usuario) throws IOException{
		int id; 
		id= usuario.getId();
		url = new URL(sitio+"/apiPancitas/usuarios/deleteUsuarios/"+id);
		HttpURLConnection http;
		http = (HttpURLConnection)url.openConnection();
		try {
		http.setRequestMethod("DELETE");
		} catch (ProtocolException e) {
		e.printStackTrace();
		}
		http.setDoOutput(true);
		http.setRequestProperty("Accept", "application/json");
		http.setRequestProperty("Content-Type", "application/json");
		
		int respuesta = http.getResponseCode();
		http.disconnect();
		return respuesta;
		}
	

	

	public static ArrayList<Usuarios> getMonoJSON(String id) throws IOException, ParseException {
		
		url = new URL(sitio+"/apiPancitas/usuarios/finAllUsuarios/"+id);
		HttpURLConnection http = (HttpURLConnection)url.openConnection();
		http.setRequestMethod("GET");
		http.setRequestProperty("Accept", "application/json");
		InputStream respuesta = http.getInputStream();
		byte[] inp = respuesta.readAllBytes();
		String json = "";
		for (int i = 0; i<inp.length ; i++) {
		json += (char)inp[i];
		}
		ArrayList<String> usuarios = new ArrayList<String>();//objeto que guarda un json en un arreglo[]
		usuarios.add(json);
		System.out.println(json+" JsonArray"+usuarios.toString());
		ArrayList<Usuarios> lista = new ArrayList<Usuarios>();
		
		lista = parsingUsuarios(usuarios.toString());
		System.out.println(lista);
		http.disconnect();
		return lista;
		
	}
	
}

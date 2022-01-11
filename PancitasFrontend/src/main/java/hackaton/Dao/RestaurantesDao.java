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

import hackatonDto.Restaurantes;


public class RestaurantesDao {
	private static URL url;
	private static String sitio = "http://localhost:9000/";
	
	public static ArrayList<Restaurantes> getJSON() throws IOException, ParseException{
		url = new URL(sitio+"/apiPancitas/restaurante/findAllRestaurante");
		HttpURLConnection http = (HttpURLConnection)url.openConnection();
		http.setRequestMethod("GET");
		http.setRequestProperty("Accept", "application/json");
		InputStream respuesta = http.getInputStream();
		byte[] inp = respuesta.readAllBytes();
		String json = "";
		for (int i = 0; i<inp.length ; i++) {
		json += (char)inp[i];
		}
		ArrayList<Restaurantes> lista = new ArrayList<Restaurantes>();
		lista = parsingRestaurante(json);
		http.disconnect();
		return lista;
		}
	
	
	public static ArrayList<Restaurantes> parsingRestaurante(String json) throws ParseException {
		 JSONParser jsonParser = new JSONParser();
		 ArrayList<Restaurantes> lista = new ArrayList<Restaurantes>();
		 JSONArray usuarios = (JSONArray) jsonParser.parse(json);
		 Iterator i = usuarios.iterator();
		 while (i.hasNext()) {
			 JSONObject innerObj = (JSONObject) i.next();
			
			 
			 Restaurantes restaurante = new Restaurantes();
			 String id,plato,producto;
			 
			 id=(innerObj.get("id").toString());
			 restaurante.setId(Integer.parseInt(id));
			 
			 plato=(innerObj.get("platos").toString());
			 restaurante.setId(Integer.parseInt(plato));
			 
			 producto=(innerObj.get("productos").toString());
			 restaurante.setId(Integer.parseInt(producto));
			 
			 restaurante.setNombreRestaurante(innerObj.get("nombreRestaurante").toString());
			 restaurante.setContactoRestaurante(innerObj.get("contactoRestaurante").toString());
		     restaurante.setEmailRestaurante(innerObj.get("emailRestaurante").toString());
		     restaurante.setCiudadRestaurate(innerObj.get("ciudadRestaurate").toString());
		     restaurante.setDirRestaurante(innerObj.get("dirRestaurante").toString());
		     restaurante.setTeflRestaurante(innerObj.get("teflRestaurante").toString());
		     //restaurante.setPassRestaurante(innerObj.get("passRestaurante").toString());
			 lista.add(restaurante);
		 }
		 return lista;
		}
	
	public static int postJSON(Restaurantes restaurante) throws IOException {
		url = new URL(sitio+"/apiPancitas/restaurante/addRestaurante");
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
		String data=gson.toJson(restaurante);
		
		byte[] out = data.getBytes(StandardCharsets.UTF_8);
		OutputStream stream = http.getOutputStream();
		stream.write(out);
		int respuesta = http.getResponseCode();
		http.disconnect();
		return respuesta;
		}
	
	public static int  postLoginRestauranteJSON(Restaurantes restaurante) throws IOException{
		url = new URL(sitio+"restaurante/login");
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
		String data=gson.toJson(restaurante);
		
		byte[] out = data.getBytes(StandardCharsets.UTF_8);
		OutputStream stream = http.getOutputStream();
		stream.write(out);
		int respuesta = http.getResponseCode();
		http.disconnect();
		return respuesta;
		}
	
	
	public static int  deleteRestauranteJSON(Restaurantes restaurante) throws IOException{
		int id; 
		id= restaurante.getId();
		url = new URL(sitio+"/apiPancitas/restaurante/deleteRestaurante/"+id);
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
	

	

	public static ArrayList<Restaurantes> getMonoJSON(String id) throws IOException, ParseException {
		
		url = new URL(sitio+"restaurante/findAllRestaurante/"+id);
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
		ArrayList<Restaurantes> lista = new ArrayList<Restaurantes>();
		
		lista = parsingRestaurante(usuarios.toString());
		System.out.println(lista);
		http.disconnect();
		return lista;
		
	}
	
}

package Servlets_002;

/**
* imports's
*/
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlets_002
 * 
 * @author Getomiza
 * @version 1.0
 * @see	none
 * @param	none
 * @return	none
 * @throws	none
 * @since	0.1
 */
@WebServlet(description = "Second example of a Servlet in JAVA", urlPatterns = { "/Servlets_002" })
public class Servlets_002 {
	// Attributes
	private static final long serialVersionUID = 1L;//
       
    /**
    * Method Name: Servlets_002
    * Es el metodo constructor de la clase, que en este caso no realiza nada de nada
	* @author Getomiza
	* @version 1.0
    * @see HttpServlet#HttpServlet()
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*
    */
    public Servlets_002() {
        super();
        // TODO Auto-generated constructor stub
    }																																										// Closing the basic constructor method of the class
    /**
    * Method Name: doGet
    * Es el metodo que realiza la impresion de un fichero en el servidor de aplicaciones LAVA Apache Tomcat.
    * Osea esta escribiendo un fichero html, con unos datos especificos e inicialesa
	* @author Getomiza
	* @version 1.0
	* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	* @param	request Es el metodo que trata de recoger los datos del fichero HTML
	* @param	response  Es el metodo que trata de enviar los datos al siguiente proceso/metodo/clase JAVA
	* @return	none
	* @throws	ServletException Facilita el acceso al conjunto de excepciones que tratan con la transmision de informaciones por medio del protocolo HTTP
	* @throws	IOException Facilita el acceso al conjunto de excepciones que tratan con la transmision de informaciones (Input/Output entre procesos o ficheros)
	* @since	0.1
	*
    */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Invocacion del Objeto 
		PrintWriter pr = response.getWriter();
			
		// Mensajes al usuario por medio del terminal de consola
		pr.println("=== Paths ===\n");
		pr.println("Request URL : " + request.getRequestURL());//
		pr.println("Request URI : " + request.getRequestURI());//
		pr.println("Servlet path : " + request.getServletPath());//
			
		pr.println("\n=== Headers ===\n");																																// Partition line at the console terminal
			
		Enumeration<String> e = request.getHeaderNames();
			
		while(e.hasMoreElements()){
			String param = (String) e.nextElement();
			pr.println(param + " : " + request.getHeader(param));
		}																																								// Closing the reading loop of the parameters that have been obtained automatically from the connection session
			
		pr.println("\n=== Parameters ===\n");																															// Partition line at the console terminal
			
		Map<String, String[]> paramsMap = request.getParameterMap();
		
		for (String key : paramsMap.keySet()) {
			pr.println(key + " : " + request.getParameter(key));
		}
			
		pr.println("\n=== Session ===\n");
		// returns 0:0:0:0:0:0:0:1 if executed from localhost
		pr.println("Client IP address : " + request.getRemoteAddr());
		pr.println("Session ID : " + request.getRequestedSessionId());
		// Cookie objects the client sent with this request
		Cookie[] cookies = request.getCookies();
		
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				pr.print(cookie.getName() + ";");
			}
		}
	}																																										// Closing the doGet Method
}																																											// Closing of the Class Servlets_002

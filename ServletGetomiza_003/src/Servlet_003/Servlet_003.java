package Servlet_003;

/**
* imports's
*/
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet_003
 * Presenta un mensaje al usuario acerca un Servlet, a traves de un mensaje al usuario
 * @author Getomiza
 * @version 1.0
 * @see	HttpServlet#HttpServlet()
 * @param	none
 * @return	none
 * @throws	none
 * @since	0.1
 *  Nota: Se usa durante la deserialización para verificar que el remitente y el receptor 
 *  de gun objeto serializado hayan cargado clases para ese objeto que sean compatibles 
 *  con respecto a la serialización
 */
@WebServlet("/Servlet_003")
public class Servlet_003 extends HttpServlet {
	// Attributes
	private static final long serialVersionUID = 1L;																														// Declaration, Creation, Definition and Assignment of the Attribute for deserialization

	// Methods
    /**
    * Method Name: Servlet_003
    * Es el metodo constructor de la clase, que en este caso invoca al Objeto padre HttpServlet
	* @author Getomiza
	* @version 1.0
    * @see HttpServlet#HttpServlet()
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*
    */ 
    public Servlet_003() {
        super();																																							// Invoking the HttpServlet class
    }																																										// Closing the basic constructor method of the class

    /**
    * Method Name: doGet
    * Es el metodo que realiza la impresion de un mednsaje en el servidor de aplicaciones JAVA Apache Tomcat.
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
		response.getWriter().println("Hello");																																//
		response.getWriter().append("Served at: ").append(request.getContextPath());																						//
		response.getWriter().println("");	
		response.getWriter().println("2Hello");
	}																																										// Closing the doGet Method
}																																											// Closing of the Class Servlets_003
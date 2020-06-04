package formacionJAVA.Servlet_006;

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
 * Servlet_006
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
@WebServlet(description = "Servlet con mensaje especifico al usuario", urlPatterns = { "/Servlet_006" })
public class Servlet_006 extends HttpServlet {
	// Attributes
	private static final long serialVersionUID = 1L;																														// Declaration, Creation, Definition and Assignment of the Attribute for deserialization
	private String message;																																					// Attribute that is the message to present to the user

	// Methods
    /**
    * Method Name: Servlet_006
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
    public Servlet_006() {
        super();																																							// Invoking the HttpServlet class
    }																																										// Closing the basic constructor method of the class

    /**
    * Method Name: init
    * Es el metodo que realiza la carga de un valor especifico en el atributo de la clase
    * @author Getomiza
	* @version 1.0
	* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	* @param	none
	* @return	none
	* @throws	ServletException Facilita el acceso al conjunto de excepciones que tratan con la transmision de informaciones por medio del protocolo HTTP
	* @since	0.1
	*
    */
    public void init() throws ServletException { message = "Hello World_Servlet_06"; }	      // Do required initialization
    
    /**
    * Method Name: doGet
    * Es el metodo que realiza la impresion de un mensaje en el servidor de aplicaciones JAVA Apache Tomcat.
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
    	response.setContentType("text/html");																																// Setting the content type  
    	PrintWriter out = response.getWriter();																																// Get the stream to write the data  
    	out.println("<h1>" + message + "</h1>");																															// Actual logic goes here.
    	out.println("<b>" + "Completion message of welcome to the Servlet" + "</b>");																						// Second message to the user																										// Actual logic goes here.
	}																																										// Closing the doGet Method  

//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

    /**
    * Method Name: destroy
    * Es el metodo que realiza la limpieza en memoria de cualquier Servlet que este activo o cargado
    * @author Getomiza
	* @version 1.0
	* @see 
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*
    */	
	public void destroy() { }																																				// do nothing.	
}																																											// Closing of the Class Servlets_006

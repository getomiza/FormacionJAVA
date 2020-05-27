package Servlets_001;

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
 * Servlet implementation class Servlets_001
 * 
 * @author Getomiza
 * @version 1.0
 * @see	none
 * @param	none
 * @return	none
 * @throws	none
 * @since	0.1
 */ 
@WebServlet(description = "First example of a Servlet in JAVA", urlPatterns = { "/Servlets_001" })
public class Servlets_001 extends HttpServlet {
	// Attributes
	private static final long serialVersionUID = 1L;//
       
    /**
    * Method Name: Servlets_001
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
    public Servlets_001() {
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
		PrintWriter out;
		out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>Primer Servlet</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<h1>Hola Mundo soy el 1er Servlet de este curso de formacion JAVA</h1>");
		out.println("	</body>");
		out.println("</html>");


		response.getWriter().append("Served at: ").append(request.getContextPath());
	}																																										// Closing the doGet Method
}																																											// Closing of the Class Servlets_001
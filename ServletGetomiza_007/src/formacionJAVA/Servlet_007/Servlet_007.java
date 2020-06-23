package formacionJAVA.Servlet_007;

/**
* imports's
*/
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet_007
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
 *  now creating a servlet by implementing Servlet interface
 */
//@WebServlet(description = "Servlet con mensaje especifico al usuario")
public class Servlet_007 implements Servlet {
	// Attributes
	ServletConfig config = null; 
	  
	    // init method 
	    public void init(ServletConfig sc) 
	    { 
	        config = sc; 
	        System.out.println("in init"); 
	    } 
	  
	    // service method 
	    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	    { 
	        res.setContentType("text/html"); 
	        PrintWriter pw = res.getWriter(); 
	        pw.println("<h2>hello from life cycle servlet</h2>"); 
	        System.out.println("in service"); 
	    } 
	  
	    // destroy method 
	    public void destroy() { System.out.println("in destroy"); } 
	    public String getServletInfo() { return "Servlet_007"; } 
	    public ServletConfig getServletConfig() { return config; } 
	} 																																									// Closing of the Class Servlets_007
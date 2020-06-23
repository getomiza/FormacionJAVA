package com.getomiza.formacion.DatosPrimitivos.DatosInteger;

/**
* imports's
*/

/**
* Clase DatoInteger_016
* Descripcion	Es esta clase realiza la carga  de un solo dato, haciendole PRE y POS incrementa, mostrando los datos al usuario
* Hace lo mismo con el PRE y POS decremento del mismo dato
* y presenta el contenido al usuario de la aplicacion.
* @author Javier Casalengua Durán
* @version 1.0
* @see	none
* @param	none
* @return	none
* @throws	none
* @since	0.1
*/
public class DatoInteger_016 {
	// Attributes
	
	// Methods
	/**
	* Method Name: prt
	* Es el metodo que presenta al usuario los mensajes que le asignan desde otro metodo
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	String s
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	static void prt(String s) { System.out.println(s); }	
	/**
	* Metodo main
	* Es el metodo que lanza la ejecucion del programa.
	* Presentar al usuario los valores resultantes de realizar un incremento de valor de forma PRE o POS, en loa 2 atributos de la clase 
	* Los valores son del dato numerico tipo integer; (entero)
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public static void main(String[] args) {
		//
		int dato = 1;
		//
		prt("dato : " + dato);																																					// Initial message to the user
		prt("++dato : " + ++dato);																																			// Pre-increment
		prt("dato++ : " + dato++);																																			// Post-increment
		//
		prt("dato : " + dato);																																				// Message to the user, with the value contained in the attribute after the PRE and POS increments
		prt("--dato : " + --dato);																																			// Pre-decrement
		prt("dato-- : " + dato--);																																			// Post-decrement
		//
		prt("dato : " + dato);																																				// Message to the user, with the value contained in the attribute after the PRE and POS decrements
	}																																										// Closing the Method main
}																																											// Closing of the Class DatoInteger_016
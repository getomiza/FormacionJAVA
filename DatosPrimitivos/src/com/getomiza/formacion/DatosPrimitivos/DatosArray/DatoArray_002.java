package com.getomiza.formacion.DatosPrimitivos.DatosArray;

/**
* imports's
*/

/**
* Clase DatoArray_002
* Es esta clase realiza la carga y presenta el contenido de un array especifico
* @author Getomiza
* @version 1.0
* @see	none
* @param	none
* @return	none
* @throws	none
* @since	0.1
*/
public class DatoArray_002 {

	// Atributes	
	
	// Methods
	
	/**
	* Method Name: DatoArray_002
	* Es el metodo constructor de la clase, que en este caso no realiza nada de nada
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public DatoArray_002() {
		// TODO Auto-generated constructor stub
	}																																										// Closing the basic constructor method of the class

	/**
	* Metodo main
	* Es el metodo que lanza la ejecucion del programa 
	* Presentar al usuario los valores contenidos en un Array de numeros double
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public static void main(String[] args) {
		double[] myList = {1.9, 2.9, 3.4, 3.5};																																// Creates a data structure of type Array, which will contain a set of values of type double

		// Reading loop of the data structure of the Array type, will extract the value contained in each position and present the information to the user
		for (double element: myList) {
			System.out.println(element);																																	// Presentation of the message to the user with the value contained in the read position
		}																																									// Closing for LOOP	 
	}																																										// Closing the Method main
}																																											// Closing of the Class DatoArray_002
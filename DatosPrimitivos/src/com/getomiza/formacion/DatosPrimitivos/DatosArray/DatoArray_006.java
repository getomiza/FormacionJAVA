package com.getomiza.formacion.DatosPrimitivos.DatosArray;


/**
* imports's
*/

/**
* Clase DatoArray_006
* Descripcion	Es esta clase realiza la carga y presenta el contenido de un array especifico
* @author Getomiza
* @version 1.0
* @see	none
* @param	none
* @return	none
* @throws	none
* @since	0.1
*/
public class DatoArray_006 {

	// Atributes	
	
	// Methods
	
	/**
	* Method Name: DatoArray_006
	* Es el metodo constructor de la clase, que en este caso no realiza nada de nada
	* @author Javier Casalengua Durán
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public DatoArray_006() {
		// TODO Auto-generated constructor stub
	}																																										// Closing the basic constructor method of the class

	/**
	* Metodo main
	* Es el metodo que lanza la ejecucion del programa.
	* Presentar al usuario los valores contenidos en un Array de tipo char;(caracteres)
	* @author Javier Casalengua Durán
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public static void main(String[] args) {
		// Assignment of values to the Array type data structure. These data will be char values
        char[] values = new char[4];																																		// Create an array of four chars.
        values[0] = 'j';																																					// Initialize first element
        values[1] = 'a';																																					// Initialize second element of the Array data structure
        values[2] = 'v';																																					// and so forth
        values[3] = 'a';																																					// ......

     // Reading loop of the data structure of the Array type, will extract the value contained in each position and present the information to the user
        for (char value : values) {																																			// Loop over array with for-loop.
            System.out.println(value);																																		// Presentation of the message to the user with the value contained in the read position
        }																																									// Closing for LOOP
	}																																										// Closing the Method main
}																																											// Closing of the Class DatoArray_006
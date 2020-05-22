package com.getomiza.formacion.DatosPrimitivos.DatosArray;

/**
* imports's
*/

/**
* Clase DatoArray_004
* Descripcion	Es esta clase realiza la carga y presenta el contenido de un array especifico
* Pero haciendo uso del metodo constructor de esta clase
*
* @author Javier Casalengua Dur�n
* @version 1.0
* @see	none
* @param	none
* @return	none
* @throws	none
* @since	0.1
*/
public class DatoArray_004 {
	// Atributes	
    public static int[] array = new int[5];	
	// Methods																																								// Creates a data structure of type Array, which will contain a set of values of type integer
	
	/**
	* Method Name: DatoArray_001
	* Es el metodo constructor de la clase, que en este caso realiza la carga inicial de los valores con los que trabajaran los metodos de la clase
	* Al utilizar un atributo de la clase
	* Ademas de presentar 
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public static void DatoArray_004() {
        // Assignment of values to the Array type data structure. These data will be integer values
        array[0] = 1;																																						// Assignment of the value at position 0 of the Array data structure
        array[1] = 10;																																						// Assignment of the value at position 1 of the Array data structure
        array[2] = 100;																																						// Assignment of the value at position 2 of the Array data structure
        array[3] = 1000;																																					// Assignment of the value at position 3 of the Array data structure
        array[4] = 10000;																																					// Assignment of the value at position 4 of the Array data structure	
        
        System.out.println("[Mensaje 1]La longitud del Array es: " + array.length);																							// Message to the user

        // Reading loop of the data structure of the Array type, will extract the value contained in each position and present the information to the user
        for (int i = 0; i < array.length; i++) {
            int value = array[i];																																			// Get value.
            System.out.println("[Mensaje 1]El valor contenido en la posicion "+ i + " es: " + value);	
        }																																									// Closing for LOOP
     }																																										// Closing the basic constructor method of the class
	
	/**
	* Metodo main
	* Es el metodo que lanza la ejecucion del programa.
	* Presentar al usuario los valores contenidos en un Array de numeros integer;(enteros)
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public static void main(String[] args) {

		DatoArray_004();																																					// Invocation to a specific method, which is the constructor of the class
		
		System.out.println("[Mensaje 2]La longitud del Array es: " + array.length);																							// Message to the user

        // Reading loop of the data structure of the Array type, will extract the value contained in each position and present the information to the user
        for (int i = 0; i < array.length; i++) {
            int value = array[i];																																			// Get value.
            System.out.println("[Mensaje 2]El valor contenido en la posicion "+ i + " es: " + value);																		// Presentation of the message to the user with the value contained in the read position
        }																																									// Closing for LOOP
	}																																										// Closing the Method main	
}																																											// Closing of the Class DatoArray_004
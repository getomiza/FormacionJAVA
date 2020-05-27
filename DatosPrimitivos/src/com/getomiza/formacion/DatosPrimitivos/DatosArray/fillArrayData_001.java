package com.getomiza.formacion.DatosPrimitivos.DatosArray;

/**
* imports's
*/

/**
* Clase fillArrayData
* Es una clase que realiza el rellenado de datos de un Array especifico, desde diferentes metodos.
*
* @author Getomiza
* @version 1.0
* @see	none
* @param	none
* @return	none
* @throws	none
* @since	0.1
*/
public class fillArrayData_001 {
	// Attributes
	public static int[] array = new int[15];

	
	
	// Methods
	/**
	* Method Name: fillArrayData
	* Es el metodo constructor de la clase, que en este caso realiza la carga inicial de los valores del atributo de la clase
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public static void fillArrayData() {
		
		//array = new int[5];
		
        // Assignment of values to the Array type data structure. These data will be integer values
        array[0] = 1;																																						// Assignment of the value at position 0 of the Array data structure
        array[1] = 10;																																						// Assignment of the value at position 1 of the Array data structure
        array[2] = 100;																																						// Assignment of the value at position 2 of the Array data structure
        array[3] = 1000;																																					// Assignment of the value at position 3 of the Array data structure
        array[4] = 10000;																																					// Assignment of the value at position 4 of the Array data structure	

        System.out.println("[Mensaje 1]La longitud del Array es: " + array.length + "\n");																							// Message to the user

        // Reading loop of the data structure of the Array type, will extract the value contained in each position and present the information to the user
        for (int i = 0; i < array.length; i++) {
            int value = array[i];																																			// Get value.
            System.out.println("[Mensaje 1]El valor contenido en la posicion "+ i + " es: " + value);	
        }																																									// Closing for LOOP
	}																																										// Closing the basic constructor method of the class		
	
	/**
	* Method Name: secondfillArrayData
	* Es un metodo que realiza la carga desde la posicion 5 a la 9 del atributo de la clase
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public static void secondfillArrayData() {
        // Assignment of values to the Array type data structure. These data will be integer values
        array[5] = 2;																																						// Assignment of the value at position 5 of the Array data structure
        array[6] = 20;																																						// Assignment of the value at position 6 of the Array data structure
        array[7] = 200;																																						// Assignment of the value at position 7 of the Array data structure
        array[8] = 2000;																																					// Assignment of the value at position 8 of the Array data structure
        array[9] = 20000;																																					// Assignment of the value at position 9 of the Array data structure	
	}																																										// Closing the secondfillArrayData method of the class
	/**
	* Method Name: thirdfillArrayData
	* Es un metodo que realiza la carga desde la posicion 10 a la 14 del atributo de la clase
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public static void thirdfillArrayData() {
        // Assignment of values to the Array type data structure. These data will be integer values
        array[10] = 3;																																						// Assignment of the value at position 10 of the Array data structure
        array[11] = 30;																																						// Assignment of the value at position 11 of the Array data structure
        array[12] = 300;																																					// Assignment of the value at position 12 of the Array data structure
        array[13] = 3000;																																					// Assignment of the value at position 13 of the Array data structure
        array[14] = 30000;																																					// Assignment of the value at position 14 of the Array data structure	
	}																																										// Closing the thirdfillArrayData method of the class		

	public static void viewContentsArray() {
        System.out.println("[Mensaje 2]La longitud del Array es: " + array.length + "\n");																							// Message to the user

        // Reading loop of the data structure of the Array type, will extract the value contained in each position and present the information to the user
        for (int i = 0; i < array.length; i++) {
            int value = array[i];																																			// Get value.
            System.out.println("[Mensaje 2]El valor contenido en la posicion "+ i + " es: " + value);	
        }
	}																																										// Closing the thirdfillArrayData method of the class		

	
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
		//
		fillArrayData();	
		
		
		secondfillArrayData();
		thirdfillArrayData();
		
		//
		System.out.println("[Mensaje 3]La longitud del Array es: " + array.length + "\n");																							// Message to the user

        // Reading loop of the data structure of the Array type, will extract the value contained in each position and present the information to the user
        for (int i = 0; i < array.length; i++) {
            int value = array[i];																																			// Get value.
            System.out.println("[Mensaje 3]El valor contenido en la posicion "+ i + " es: " + value);																		// Presentation of the message to the user with the value contained in the read position
        }																																									// Closing for LOOP
	}																																										// Closing the Method main	
}																																											// Closing of the Class fillArrayData
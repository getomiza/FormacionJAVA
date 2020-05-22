package com.getomiza.formacion.DatosPrimitivos.DatosArray;

/**
* imports's
*/

/**
* Clase DatoArray_003
* Es esta clase realiza la carga y presenta el contenido de un array especifico
* @author Getomiza
* @version 1.0
* @see	none
* @param	none
* @return	none
* @throws	none
* @since	0.1
*/
public class DatoArray_003 {

	// Atributes	
	
	// Methods
	
	/**
	* Method Name: DatoArray_003
	* Es el metodo constructor de la clase, que en este caso no realiza nada de nada
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public DatoArray_003() {
		// TODO Auto-generated constructor stub
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
		// Attributes
		double[] myList = {1.9, 2.9, 3.4, 3.5};																																// Definition and Fill Data Array
		double total = 0;																																					// Attribute for the sum of all the values of the Array
		double max = myList[0];																																				// Attribute to find the largest element within the Array
		int highestvalueindex = 0;																																			// Indicator of what would be the position of the Array with the highest contained value
		
		for (int i = 0; i < myList.length; i++) { System.out.println("El indice es: "+ i + " siendo el contenido de: " + myList[i] + " "); }						 		// Reading loop of the data structure of the Array type, will extract the value contained in each position and present the information to the user	
     
		System.out.println("\n");																																			// Separation line

		for (int i = 0; i < myList.length; i++) {																															// Presents the user the summary value of the Array content
			total += myList[i];																																				// Sum of the Subtotal with the values entered in the Array
			System.out.println("El indice es: "+ i+" el sumatorio parcial es: " + total);																					// Presentation of the message to the user with the value operated according to the reading position within the Array
		}																																									// Closing the loop 

		System.out.println("El sumatorio total es: " + total);																												// Presentation of the sum total
		System.out.println("\n");																																			// Separation line
		
		for (int i = 1; i < myList.length; i++) {																															// Search within the Array for the highest value
			if (myList[i] > max) max = myList[i];																															// Checking the previous value with the current value, to determine which is the highest value
				highestvalueindex = i;																																		// Assignment of the Array index of the highest value
		}																																									// Closing the loop for determining the highest value contained in the array
		
		System.out.println("Siendo el valor maximo contenido en el Array: " + max);																							// Presentation of the highest value
		System.out.println("Estando en la posicion [" + highestvalueindex + "] del Array");																					// Presentation of the index highest value
	}																																										// Closing the Method main
}																																											// Closing of the Class DatoArray_003
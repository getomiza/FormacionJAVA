package com.getomiza.formacion.DatosPrimitivos.DatosArray;

/**
* imports's
*/

/**
* Clase DatoArray_005
* Es esta clase realiza la carga y presenta el contenido de un array especifico
*
* @author Getomiza
* @version 1.0
* @see	none
* @param	none
* @return	none
* @throws	none
* @since	0.1
*/
public class DatoArray_005 {

	// Atributes	
	
	// Methods
	
	/**
	* Method Name: DatoArray_005
	* Es el metodo constructor de la clase, que en este caso no realiza nada de nada
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public DatoArray_005() {
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
        
        int[] anArray;																																						// Declares an array of integers numbers
        anArray = new int[10];																																				// Allocates memory for 10 integers
        
        anArray[0] = 100;																																					// Initialize first element 
        anArray[1] = 200;																																					// Initialize second element of the Array data structure
        anArray[2] = 300;																																					// and so forth
        anArray[3] = 400;																																					// ......
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
		
		// Presentation of the data contained in the Array
		System.out.println("Element at index 0: " + anArray[0]);																											// Array position [0]
        System.out.println("Element at index 1: " + anArray[1]);																											// Array position [1]
        System.out.println("Element at index 2: " + anArray[2]);																											// Array position [2]
        System.out.println("Element at index 3: " + anArray[3]);																											// Array position [3]
        System.out.println("Element at index 4: " + anArray[4]);																											// Array position [4]
        System.out.println("Element at index 5: " + anArray[5]);																											// Array position [5]
        System.out.println("Element at index 6: " + anArray[6]);																											// Array position [6]
        System.out.println("Element at index 7: " + anArray[7]);																											// Array position [7]
        System.out.println("Element at index 8: " + anArray[8]);																											// Array position [8]
        System.out.println("Element at index 9: " + anArray[9]);																											// Array position [9]		
	}																																										// Closing the Method main
}																																											// Closing of the Class DatoArray_005
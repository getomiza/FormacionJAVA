package com.getomiza.formacion.DatosPrimitivos.DatosArray;
/**
* imports's
*/

/**
* Clase DatoArray_007
* Es esta clase realiza la carga y presenta el contenido de dos arrays especificos
* @author Getomiza
* @version 1.0
* @see	none
* @param	none
* @return	none
* @throws	none
* @since	0.1
*/
public class DatoArray_007 {

	// Atributes	
	
	// Methods
	
	/**
	* Method Name: DatoArray_007
	* Es el metodo constructor de la clase, que en este caso no realiza nada de nada
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public DatoArray_007() {
		// TODO Auto-generated constructor stub
	}																																										// Closing the basic constructor method of the class

	/**
	* Metodo main
	* Es el metodo que lanza la ejecucion del programa.
	* Presentar al usuario el tamaño de cada uno de los Arrys; (El Array de numeros enteros y el Array de Cadena de Caracteres)
	* Presentar al usuario el contenido de los registros 0 y 1 de cada Array
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public static void main(String[] args) {
        // Two input arrays.
        int[] array1 = {1, 3, 5};
        String[] array2 = {"frog", "toad", "squirrel"};

        System.out.println("El tamaño del Primer Array es: " + array1.length);																								// Array length of integers
        System.out.println("El tamaño del Segundo Array es: " + array2.length);																								// Array length of character string

		System.out.println();																																				// Separation line
        System.out.println("El contenido de la posición 0, del Array 1 es: " + array1[0]);        																			// First elements in each array.
        System.out.println("El contenido de la posición 0, del Array 2 es: " + array2[0]);        																			// First elements in each array.

		System.out.println();																																				// Separation line
		System.out.println("El contenido de la posición 1, del Array 1 es: " + array1[1]);																					// Second elements in each array.
        System.out.println("El contenido de la posición 1, del Array 2 es: " + array2[1]);																					// Second elements in each array.
	}																																										// Closing the Method main
}																																											// Closing of the Class DatoArray_007
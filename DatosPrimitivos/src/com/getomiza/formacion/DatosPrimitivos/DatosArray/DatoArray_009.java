package com.getomiza.formacion.DatosPrimitivos.DatosArray;

/**
* imports's
*/

/**
* Clase DatoArray_009
* Descripcion	Es esta clase realiza la carga y presenta el contenido de un array especifico
*
* @author Getomiza
* @version 1.0
* @see	none
* @param	none
* @return	none
* @throws	none
* @since	0.1
*/
public class DatoArray_009 {

	// Atributes	
	
	// Methods
	
	/**
	* Method Name: DatoArray_009
	* Es el metodo constructor de la clase, que en este caso no realiza nada de nada
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public DatoArray_009() {
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
		int[] values = { 1,2,3,4 };																																			// Enroll data to the Array

        System.out.println("El contenido original del Array es:");																											// Presentation of the contents of the Array
			
        for (int i = 0; i < values.length; i++) { System.out.println(values[i]); }																							// Loop over array elements in reverse order. 

        System.out.println("\nEl contenido del Array, ordenado de forma invertida es: ");																					// Separation line. Presentation of the contents of the Array

        for (int i = values.length - 1; i >= 0; i--) { System.out.println(values[i]); }																						// Loop over array elements in reverse order. Message presentation to the user        
	}																																										// Closing the Method main
}																																											// Closing of the Class DatoArray_009
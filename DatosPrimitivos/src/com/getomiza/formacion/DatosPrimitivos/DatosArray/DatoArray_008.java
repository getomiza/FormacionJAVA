package com.getomiza.formacion.DatosPrimitivos.DatosArray;

/**
* imports's
*/

/**
* Clase DatoArray_008
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
public class DatoArray_008 {

	// Atributes	
	
	// Methods
	
	/**
	* Method Name: DatoArray_008
	* Es el metodo constructor de la clase, que en este caso no realiza nada de nada
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public DatoArray_008() {
		// TODO Auto-generated constructor stub
	}																																										// Closing the basic constructor method of the class

	/**
	* Metodo main
	* Es el metodo que lanza la ejecucion del programa.
	* Presentacion del contenido de un array, en un orden natural y en un orden inverso
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public static void main(String[] args) {
		boolean[] values = { false, true, true, true };

        System.out.println("El contenido original del Array es:");																											// Presentation of the contents of the Array
			
        for (int i = 0; i < values.length; i++) { System.out.println(values[i]); }																							// Loop over array elements in natural order of registration in the array. Presentation of the values contained in the array																												

        System.out.println("\nEl contenido del Array, ordenado de forma invertida es: ");																					// Separation line. Presentation of the contents of the Array

        for (int i = values.length - 1; i >= 0; i--) { System.out.println(values[i]); }       																				// Loop over array elements in reverse order. Message presentation to the user
	}																																										// Closing the Method main
}																																											// Closing of the Class DatoArray_008
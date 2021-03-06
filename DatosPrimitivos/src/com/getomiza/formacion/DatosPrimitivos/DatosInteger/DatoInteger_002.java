package com.getomiza.formacion.DatosPrimitivos.DatosInteger;

/**
* imports's
*/

/**
* Clase DatoInteger_002
* Descripcion	Es esta clase realiza la carga  de dos datos, suma los valores contenidos en los atributos
* y presenta el contenido al usuario de la aplicaciono
*
* @author Javier Casalengua Dur�n
* @version 1.0
* @see	none
* @param	none
* @return	none
* @throws	none
* @since	0.1
*/
public class DatoInteger_002 {

	// Atributes	
	
	// Methods
	
	/**
	* Method Name: DatoInteger_002
	* Es el metodo constructor de la clase, que en este caso no realiza nada de nada
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public DatoInteger_002() {
		// TODO Auto-generated constructor stub
	}																																										// Closing the basic constructor method of the class

	/**
	* Metodo main
	* Es el metodo que lanza la ejecucion del programa.
	* Presentar al usuario el valor ocntenido en un dato numerico tipo integer; (entero)
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public static void main(String[] args) {
        int dato1, dato2;																																							// Creation, definition of a numeric attribute type integer

        dato1 = 1;																																							// Assign a value to the first attribute of the method																													// Assignment of the value at position 0 of the Array data structure
        dato2 = 2;																																							// Assign a value to the second attribute of the method
		
        System.out.println("El valor insertado en el atributo; (dato1), tipo integer es: " + dato1);																		// Message to the user, with the value of the first attribute
        System.out.println("El valor insertado en el atributo; (dato2), tipo integer es: " + dato2);																		// Message to the user, with the value of the second attribute
        System.out.println("El resultado final de la suma de ambos datos es: " + (dato1 + dato2));																			// Message to the user, with the value of the arithmetic operation added with the two attributes previously presented
	}																																										// Closing the Method main
}																																											// Closing of the Class DatoInteger_001
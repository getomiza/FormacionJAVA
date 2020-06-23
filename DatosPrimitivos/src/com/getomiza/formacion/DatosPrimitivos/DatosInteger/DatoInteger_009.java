package com.getomiza.formacion.DatosPrimitivos.DatosInteger;

/**
* imports's
*/

/**
* Clase DatoInteger_009
* Descripcion	Es esta clase realiza la carga  de 2 datos, obtiene el incremento de los valores contenidos en los atributos de la clase
* y presenta el contenido al usuario de la aplicacion.
* @author Javier Casalengua Durán
* @version 1.0
* @see	none
* @param	none
* @return	none
* @throws	none
* @since	0.1
*/
public class DatoInteger_009 {
	// Attributes
	static int dato1;																																						// Creation and definition of a numeric attribute of type integer
	static int dato2;																																						// Creation and definition of a numeric attribute of type integer
	
	// Methods
	/**
	* Method Name: DatoInteger_009
	* Es el metodo constructor de la clase, que inicializa el atributo resultado al valor "0"
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public DatoInteger_009() { }																																			// Closing the basic constructor method of the class
	
	/**
	* Method Name: getDato1
	* Es el metodo que obtiene el dato salvaguardado en un atributo especifico de la clase.
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public static int getDato1() { return dato1; }

	/**
	* Method Name: setDato1
	* Es el metodo que asigna un dato en un atributo especifico de la clase.
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public void setDato1(int dato1) { this.dato1 = dato1; }

	/**
	* Method Name: getDato2
	* Es el metodo que obtiene el dato salvaguardado en un atributo especifico de la clase.
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public static int getDato2() { return dato2; }

	/**
	* Method Name: setDato2
	* Es el metodo que asigna un dato en un atributo especifico de la clase.
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public void setDato2(int dato2) { this.dato2 = dato2; }
		
	/**
	* Metodo main
	* Es el metodo que lanza la ejecucion del programa.
	* Presentar al usuario el valor resultante del incremento de los dos valores contenidos en atributos de la clase. 
	* Los valores son del dato numerico tipo integer; (entero)
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
		DatoInteger_009 two = new DatoInteger_009();																														// Creation, Definition and Assignment of an Object Attribute of the same class DatoInteger_009
		//
		two.setDato1(100);																																					// Initial load of a value in the specific attribute																																					// Assigning a value to attribute 1
		two.setDato2(200);																																					// Initial load of a value in the specific attribute																																					// Assigning a value to attribute 2
		//
        System.out.println("El valor insertado en el atributo;(dato1), tipo integer es: " + two.getDato1());																// Message to the user, with the value of the first attribute
        System.out.println("El valor insertado en el atributo;(dato2), tipo integer es: " + two.getDato2());																// Message to the user, with the value of the second attribute
        //
        System.out.println("El valor calculado para auto incremento del atributo; (dato1), tipo integer es: " + ++dato1);													// Message to the user, with the value of the result of the calculation operation
        System.out.println("El valor calculado para auto incremento del atributo; (dato2), tipo integer es: " + ++dato2);													// Message to the user, with the value of the result of the calculation operation
	}																																										// Closing the Method main
}																																											// Closing of the Class DatoInteger_009
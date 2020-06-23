package com.getomiza.formacion.DatosPrimitivos.DatosInteger;

/**
* imports's
*/

/**
* Clase DatoInteger_015
* Descripcion	Es esta clase realiza la carga  de 2 datos, presenta los valores de los datos iniciales y luego los incrementa en uno; (1)
* y presenta el contenido al usuario de la aplicacion.
* @author Javier Casalengua Durán
* @version 1.0
* @see	none
* @param	none
* @return	none
* @throws	none
* @since	0.1
*/
public class DatoInteger_015 {
	// Attributes
	static int dato1;																																						// Creation and definition of a numeric attribute of type integer
	static int dato2;																																						// Creation and definition of a numeric attribute of type integer

	
	// Methods
	/**
	* Method Name: DatoInteger_015
	* Es el metodo constructor de la clase, que inicializa los atributos de la clase con unos valores especificos
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public DatoInteger_015() { 
		setDato1(2);																																						// Initial load of a value in the specific attribute
		setDato2(3);																																						// Initial load of a value in the specific attribute
	}																																										// Closing the basic constructor method of the class
	
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
	* Presentar al usuario los valores resultantes de realizar un incremento de valor de forma PRE o POS, en loa 2 atributos de la clase 
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
		DatoInteger_015 two = new DatoInteger_015();																														// Creation, Definition and Assignment of an Object Attribute of the same class DatoInteger_015
		//
        System.out.println("El valor inicial en el atributo;(dato1), tipo integer es: " + two.getDato1());																	// Message to the user																// Message to the user, with the value of the first attribute
        System.out.println("El valor inicial en el atributo;(dato2), tipo integer es: " + two.getDato2());																	// Message to the user	
		//
		int tempX = two.getDato1();
		int tempY = two.getDato2();
		//
        System.out.println("El valor inicial en el atributo del metodo main;(tempX), que es del tipo integer es: " + tempX);																	// Message to the user																// Message to the user, with the value of the first attribute
        System.out.println("El valor inicial en el atributo del metodo main;(tempY), que es del tipo integer es: " + tempY);																	// Message to the user	
        //
        if ((tempY == tempX++) | (tempX < ++tempY)) {																														// Beginning of the Conditional
        System.out.println("El valor ANALIZADO del atributo; (dato1), tipo integer es: " + tempX);																			// Message to the user, with the value of the result of the calculation operation
        System.out.println("El valor ANALIZADO del atributo; (dato2), tipo integer es: " + tempY);																			// Message to the user, with the value of the result of the calculation operation
		}																																									// Close the conditional
	}																																										// Closing the Method main
}																																											// Closing of the Class DatoInteger_015
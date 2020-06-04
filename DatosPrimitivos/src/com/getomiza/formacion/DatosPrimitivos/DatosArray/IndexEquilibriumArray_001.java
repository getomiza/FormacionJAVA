package com.getomiza.formacion.DatosPrimitivos.DatosArray;


/**
* imports's
*/

/**
* Clase IndexEquilibriumArray_001
* Es esta clase realiza la presentacion del indice de equilibrio en un Array de valores Numeros Enteros
* @author Getomiza
* @version 1.0
* @see	none
* @param	none
* @return	none
* @throws	none
* @since	0.1
*/
public class IndexEquilibriumArray_001 {

	// Atributes	
	
	// Methods
	
	/**
	* Method Name: IndexEquilibriumArray_001
	* Es el metodo constructor de la clase, que en este caso no realiza nada de nada
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public IndexEquilibriumArray_001() {
		// TODO Auto-generated constructor stub
	}																																									// Closing the basic constructor method of the class

	/**
	* Method Name: equilibrium
	* Es el metodo 
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
    int equilibrium(int arr[], int n) {
    	// Attributes
        int i, j;																																						// Work indices in the Array read loop
        int leftsum, rightsum;																																			// Search positioning flags for each side of the Array
 
        for (i = 0; i < n; ++i) {																																		// Check for indexes one by one until an equilibrium index is found. Performing a reading of the Array content and its corresponding positions
        	leftsum = 0;																																				// initialize left sum for current index i
        	rightsum = 0; 																																				// initialize right sum for current index i
 
        	for (j = 0; j < i; j++) leftsum += arr[j];																													// get left sum
        	for (j = i + 1; j < n; j++) rightsum += arr[j];																												// get right sum

        	if (leftsum == rightsum) return i;																															// if leftsum and rightsum are same, then we are done
        }//
        return -1;																																						// return -1 if no equilibrium index is found
    }																																										// Closing the equilibrium method 

    /**
     * Metodo ArrayContentView
     * Mostrar al usuario el tamaño y el contenido del Array
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	paramArray_001
	* @return	none
	* @throws	none
	* @since	0.1
	*/
    public static void ArrayContentView (int [] paramArray_001) {
		System.out.println("El tamaño del Array es de: " + paramArray_001.length);
    	System.out.println("El contenido original del Array es:");																											// Presentation of the contents of the Array
    	for (int i = 0; i < paramArray_001.length; i++) { System.out.println(paramArray_001[i]); }	
    }																																										// Closing the ArrayContentView Method
    
	/**
	* Metodo main
	* Es el metodo que lanza la ejecucion del programa.
	* Presentar al usuario el tamaño del Array y su contenido
	* Ademas de presentar el indice de Equilibrio del Array	
	* @author Getomiza
	* @version 1.0
	* @see	none
	* @param	none
	* @return	none
	* @throws	none
	* @since	0.1
	*/
	public static void main(String[] args) {
		IndexEquilibriumArray_001 equi = new IndexEquilibriumArray_001();//
		
		int arr[] = {-7, 1, 5, 2, -4, 3, 0};//

		ArrayContentView (arr);//
		//
		System.out.println("El punto de equilibrio posicional es la posicion: " + equi.equilibrium(arr, arr.length) 
			+ "\nSiendo el contenido del valor del equilibrio: " 
			+ arr[equi.equilibrium(arr, arr.length)]);
	}																																										// Closing the Method main
}																																											// Closing of the Class IndexEquilibriumArray_001
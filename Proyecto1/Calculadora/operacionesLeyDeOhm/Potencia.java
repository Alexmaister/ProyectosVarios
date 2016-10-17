package OperacionesLeyDeOhm;

public class Potencia 
{
	/* 
	 * Interfaz 
	 * Cabecera: public static double calcularPotencia( double voltaje, double intensidad )
	 * Proceso: Método que calcula la resistencia de un circuito aplicando la ley de ohm
	 * Precondiciones:
	 *     * voltaje no puede ser negativo
	 *     * intensidad no puede ser negativa    
	 * Entrada
	 *     * voltaje
	 *     * intensidad
	 * Salida: 
	 *     * potencia
	 * Entrada/Salida: Ninguna
	 * Postcondiciones: 
	 *     * potencia calculada no puede ser negativa
	 */
	 public static double calcularPotencia( double intensidad, double voltaje )
	 {	
		//variable para almacenar el resultado de la operacion
		double potencia = 0;
		
		//calculamos el valor de la potencia aplicando la formula P = V * I
		potencia = intensidad * voltaje;
		
		//Devolvemos el valor calculado
		return(potencia);
	}	
}

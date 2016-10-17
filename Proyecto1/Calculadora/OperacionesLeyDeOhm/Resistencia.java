package OperacionesLeyDeOhm;

public class Resistencia 
{
	/* 
	 * Interfaz 
	 * Cabecera: public static double calcularResistencia( double voltaje, double intensidad )
	 * Proceso: Método que calcula la resistencia de un circuito aplicando la ley de ohm
	 * Precondiciones:
	 *     * voltaje no puede ser negativo
	 *     * intensidad no puede ser negativo
	 * Entrada:
	 *     * voltaje
	 *     * intensidad
	 * Salida: 
	 *     * resistencia
	 * Entrada/Salida: Ninguna
	 * Postcondiciones: 
	 *     * intensidad calculada no puede ser negativa
	 */
	 public static double calcularResistencia( double voltaje, double intensidad )
	 {	
		//variable para almacenar el resultado de la operacion
		double resistencia = 0;
		
		//calculamos el valor de la intensidad aplicando la formula R = V / I
		resistencia = voltaje / intensidad;
		
		//Si la  resistencia es negativa
		if ( resistencia < 0 )
		{
			System.out.println("Error: La resistencia calculada no puede ser negativa, debes aplicar un voltaje mayor");
		}
		
		//Devolvemos el valor calculado
		return(intensidad);
	}	
}

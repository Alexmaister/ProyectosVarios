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
	 *     * potencia calculada no puede ser negativo
	 */
	 public static double calcularVoltaje( double intensidad, double resistencia )
	 {	
		//variable para almacenar el resultado de la operacion
		double voltaje = 0;
		
		//calculamos el valor de la potencia aplicando la formula P = V * I
		voltaje = intensidad * resistencia;
		
		//Si el voltaje es negativo
		if ( voltaje < 0 )
		{
			System.out.println("Error: La resistencia calculada no puede ser negativa, debes aplicar un voltaje mayor");
		}
		
		//Devolvemos el valor calculado
		return(voltaje);
	}	
}

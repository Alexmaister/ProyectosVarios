package OperacionesLeyDeOhm;

public class Voltaje
{
	/* 
	 * Interfaz 
	 * Cabecera: public static double calcularVoltaje( double intensidad, double resistencia )
	 * Proceso: Método que calcula la resistencia de un circuito aplicando la ley de ohm
	 * Precondiciones:
	 *     * intensidad no puede ser negativo
	 *     * resistencia no puede ser negativa
	 * Entrada
	 *     * intensidad
	 *     * resistencia
	 * Salida: 
	 *     * voltaje
	 * Entrada/Salida: Ninguna
	 * Postcondiciones: 
	 *     * voltaje calculado no puede ser negativo
	 */
	 public static double calcularVoltaje( double intensidad, double resistencia )
	 {	
		//variable para almacenar el resultado de la operacion
		double voltaje = 0;
		
		//calculamos el valor del voltaje aplicando la formula V = I * R
		voltaje = intensidad * resistencia;
		
		//Si el voltaje es negativo
		if ( voltaje < 0 )
		{
			System.out.println("Error: El voltaje calculado no puede ser negativo");
		}
		
		//Devolvemos el valor calculado
		return(voltaje);
	}	
}

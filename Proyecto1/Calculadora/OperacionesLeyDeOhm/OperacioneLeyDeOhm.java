package OperacionesLeyDeOhm;

public class OperacioneLeyDeOhm 
{
    /* 
    * Interfaz 
    * Cabecera: public static double calcularIntensidad( double voltaje, double resistencia )
    * Proceso: Método que calcula la intensidad de un circuito aplicando la ley de ohm
    * Precondiciones:
    *     * voltaje no puede ser negativo
    *     * resistencia no puede ser negativo
    * Entrada:
    *     * voltaje
    *     * resistencia
    * Salida: 
    *     * intensidad
    * Entrada/Salida: Ninguna
    * Postcondiciones: 
    *     * intensidad calculada no puede ser negativa
    */
	public static double calcularIntensidad( double voltaje, double resistencia )
	{
		//variable para almacenar el resultado de la operacion
		double intensidad = 0;
		
		//calculamos el valor de la intensidad aplicando la formula I = V / R
		intensidad = voltaje / resistencia;
		
		//Devolvemos el valor calculado
		return(intensidad);
	}
	
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
			
			//Devolvemos el valor calculado
			return(resistencia);
		}	
		 
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
				
				//Devolvemos el valor calculado
				return(voltaje);
			}	
}

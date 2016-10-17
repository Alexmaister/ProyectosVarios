package OperacionesLeyDeOhm;

public class Intensidad 
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
		
		//Si la  resistencia es negativa
		if ( intensidad < 0 )
		{
			System.out.println("Error: La intensidad calculada no puede ser negativa, debes aplicar un voltaje mayor");
		}
			
		//Devolvemos el valor calculado
		return(intensidad);
	}
}

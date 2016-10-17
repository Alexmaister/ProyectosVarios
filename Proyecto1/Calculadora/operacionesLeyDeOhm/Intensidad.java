package operacionesLeyDeOhm;

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
    *     * intensidad no puede ser negativa
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
}

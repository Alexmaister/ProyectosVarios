package OperacionesLeyDeOhm;

public class OperacioneLeyDeOhm 
{
    /*
	CABECERA: calcularIntensidad( double voltaje, double resistencia )
	FUNCIONAMIENTO: devolvera el resultado de calcular la intensidad en amperios
	ENTRADAS: voltaje y resistencia (real) (real)
	PRECONDICIONES: voltaje y resistencia deben ser mayor que 0
	SALIDAS: intensidad en amperios
	POSTCONDICIONES: se devolvera un numero comprendido en el rango de reales
					 si voltaje o resistencia son 0 se devuelve 0
					 se devuelve asociado al nombre
	ENTRADA/SALIDA:
    */
	public static double calcularIntensidad( double voltaje, double resistencia )
	{
		//variable para almacenar el resultado de la operacion
		double intensidad = 0;
		
		if ( voltaje != 0 || resistencia != 0 )
		{
			//calculamos el valor de la intensidad aplicando la formula I = V / R
			intensidad = voltaje / resistencia;
		}
		
		//Devolvemos el valor calculado
		return(intensidad);
	}
	
	/*
	CABECERA: public static double calcularResistencia( double voltaje, double intensidad )
	FUNCIONAMIENTO: devolvera el resultado de calcular la resistencia en ohmios
	ENTRADAS: voltaje y intensidad (real) (real)
	PRECONDICIONES: voltaje y intensidad deben ser mayor que 0
	SALIDAS: resistencia en ohmios (real)
	POSTCONDICIONES: se devolvera un numero comprendido en el rango de reales
					 si voltaje o intensidad son 0 se devuelve 0
					 se devuelve asociado al nombre
	ENTRADA/SALIDA:
	*/
	 public static double calcularResistencia( double voltaje, double intensidad )
	 {	
		//variable para almacenar el resultado de la operacion
		double resistencia = 0;
		
		if ( voltaje != 0 || intensidad != 0 )
		{
			//calculamos el valor de la intensidad aplicando la formula R = V / I
			resistencia = voltaje / intensidad;
		}
		//Devolvemos el valor calculado
		return(resistencia);
	}	
	 
	/*
	CABECERA: public static double calcularVoltaje( double intensidad, double resistencia )
	FUNCIONAMIENTO: devolvera el resultado de calcular la el voltaje en voltios
	ENTRADAS: intensidad y resistencia (real) (real)
	PRECONDICIONES: intensidad y resistencia deben ser mayor que 0
	SALIDAS: voltaje en voltios (real)
	POSTCONDICIONES: se devolvera un numero comprendido en el rango de reales
					 si intensidad o resistencia son 0 se devuelve 0
					 se devuelve asociado al nombre
	ENTRADA/SALIDA:
	*/
	 public static double calcularVoltaje( double intensidad, double resistencia )
	 {	
		//variable para almacenar el resultado de la operacion
		double voltaje = 0;
		
		if ( intensidad != 0 || resistencia != 0 )
		{
			//calculamos el valor del voltaje aplicando la formula V = I * R
			voltaje = intensidad * resistencia;
		}
		
		//Devolvemos el valor calculado
		return(voltaje);
	}	
	
    /*
	CABECERA: public static double calcularPotencia( double intensidad, double voltaje )
	FUNCIONAMIENTO: devolvera el resultado de calcular la potencia en vatios
	ENTRADAS: intensidad y voltaje (real) (real)
	PRECONDICIONES: intensidad y voltaje deben ser mayor que 0
	SALIDAS: potencia en vatios
	POSTCONDICIONES: se devolvera un numero comprendido en el rango de reales
					 si intensidad o voltaje son 0 se devuelve 0
					 se devuelve asociado al nombre
	ENTRADA/SALIDA:
    */
	 public static double calcularPotencia( double intensidad, double voltaje )
	 {	
		//variable para almacenar el resultado de la operacion
		double potencia = 0;
		
		if ( intensidad != 0 || voltaje != 0 )
		{
			//calculamos el valor de la potencia aplicando la formula P = V * I
			potencia = intensidad * voltaje;
		}
		
		//Devolvemos el valor calculado
		return(potencia);
	}
	 

}

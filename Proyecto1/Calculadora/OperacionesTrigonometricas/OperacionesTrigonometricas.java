package OperacionesTrigonometricas;
import java.math.*;

public class OperacionesTrigonometricas 
{
	
	double PI =3.1416;
	/*CABECERA: double coseno(double numero)
	 * DESCRIPCION:
	 * ENTRADAS:
	 * PRECONDICIONES:
	 * SALIDAS:
	 * POSTCONDICIONES:
	 */
	public static double coseno(double numero){
		double resultado=0;
		numero=convertirRadianes(numero);
		resultado=Math.cos(numero);
		
		return resultado;
		
	}
	
	
	/*CABECERA: double seno(double numero)
	 * DESCRIPCION:
	 * ENTRADAS:
	 * PRECONDICIONES:
	 * SALIDAS:
	 * POSTCONDICIONES:
	 */
	
	public static double seno(double numero){
		
		double resultado=0;
		numero=convertirRadianes(numero);
		resultado=Math.sin(numero);
		return resultado;
	} 
	
	/*CABECERA: double tangente(double numero)
	 * DESCRIPCION:
	 * ENTRADAS:
	 * PRECONDICIONES:
	 * SALIDAS:
	 * POSTCONDICIONES:
	 */
	
	public static double tangente(double numero){
		//
		double resultado=0;
		numero=convertirRadianes(numero);
		resultado=Math.tan(numero);
		
		return resultado;
	}
	
	/*CABECERA: double cosecante(double numero)
	 * DESCRIPCION:
	 * ENTRADAS:
	 * PRECONDICIONES:
	 * SALIDAS:
	 * POSTCONDICIONES:
	 */
	
	public static double cosecante(double numero){
		
		double resultado=0;
		numero=convertirRadianes(numero);
		resultado=Math.acos(numero);
		
		return resultado;
	} 
	
	/*CABECERA: double secante(double numero)
	 * DESCRIPCION:
	 * ENTRADAS:
	 * PRECONDICIONES:
	 * SALIDAS:
	 * POSTCONDICIONES:
	 */
	
	public static double secante (double numero){
		
		double resultado=0;
		numero=convertirRadianes(numero);
		resultado=Math.asin(numero);
		
		return resultado;
	}
	
	/*CABECERA: double cotangente(double numero)
	 * DESCRIPCION:
	 * ENTRADAS:
	 * PRECONDICIONES:
	 * SALIDAS:
	 * POSTCONDICIONES:
	 */
	
	public static double cotangente (double numero){
		
		double resultado=0;
		numero=convertirRadianes(numero);
		resultado=Math.atan(numero);
		
		return resultado;
	}
	
	/*CABECERA: double convertirRadianes(double numero)
	 * DESCRIPCION:Funcion que cogera un numero entre 0 y 360 de entrada y lo convertira en radianes
	 * ENTRADAS:Numero real
	 * PRECONDICIONES:Ninguna
	 * SALIDAS:Numero en radianes
	 * POSTCONDICIONES:El resultado sera un numero en radianes,
	 * 					devolvera -1 en caso de que el numero de entrada no este en el rango permitido,
	 *  				se devolvera asociado al nombre
	 */
	
	public static double convertirRadianes(double numero){
		
		final double PI =3.1416;
		double resultado=0;
		
		if(numero>=0 && numero<=360){
			
			resultado=(numero*PI)/180;
		}
		return resultado;
	}
	
}

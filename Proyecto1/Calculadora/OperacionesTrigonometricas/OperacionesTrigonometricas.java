package OperacionesTrigonometricas;
import java.math.*;

public class OperacionesTrigonometricas 
{
	
	double PI =3.1416;
	/*CABECERA: double coseno(double numero)
	 * DESCRIPCION:Funcion que calcula el coseno de un angulo
	 * ENTRADAS:Un numero real
	 * PRECONDICIONES:Ninguna
	 * SALIDAS:numero real
	 * POSTCONDICIONES:El resultado estara entre 0 o 1, 0 si no se pudo calcular, se devolvera asociado al nombre
	 */
	public static double coseno(double numero){
		double resultado=0;
		numero=convertirRadianes(numero);
		if(numero!=-1)
			resultado=Math.cos(numero);
		else
			resultado=0;
		if(resultado<0 || resultado>1)
			resultado=0;
		return resultado;
		
	}
	
	
	/*CABECERA: double seno(double numero)
	* DESCRIPCION:Funcion que calcula el seno de un angulo
	 * ENTRADAS:Un numero real
	 * PRECONDICIONES:Ninguna
	 * SALIDAS:numero real
	 * POSTCONDICIONES:El resultado estara entre 0 o 1, 0 si no se pudo calcular, se devolvera asociado al nombre
	 */
	
	public static double seno(double numero){
		
		double resultado=0;
		numero=convertirRadianes(numero);
		if(numero!=-1)
			resultado=Math.sin(numero);
		else
			resultado=0;
		
		return resultado;
	} 
	
	/*CABECERA: double tangente(double numero)
	* DESCRIPCION:Funcion que calcula la tangente de un angulo
	 * ENTRADAS:Un numero real
	 * PRECONDICIONES:Ninguna
	 * SALIDAS:numero real
	 * POSTCONDICIONES:El resultado estara entre 0 o 1, -1 si no se pudo calcular,y -2 si el angulo es de 90 grados se devolvera asociado al nombre
	 */
	
	public static double tangente(double numero){
		
		double resultado=0;
		if(numero!=90){
		numero=convertirRadianes(numero);
		if(numero!=-1)
			resultado=Math.tan(numero);
		else
			resultado=-1;
		}else
			resultado=-2;
		return resultado;
	}
	
	/*CABECERA: double cosecante(double numero)
	 * DESCRIPCION:Funcion que calcula la cosecante de un angulo
	 * ENTRADAS:Un numero real
	 * PRECONDICIONES:Ninguna
	 * SALIDAS:numero real o string
	 * POSTCONDICIONES:El resultado estara entre 0 o 1, -1 si no se pudo calcular y -2 si el valor es infinito se devolvera asociado al nombre
	 */
	
	public static double cosecante(double numero){
		
		double resultado=0;
		if(numero!=90){
		numero=convertirRadianes(numero);
		
		if(numero!=-1)
			
			resultado=(double)1/seno(numero);
		else 
			resultado=-1;
		if(resultado>1)
			resultado=-2;
		}else
			resultado=1;
		return resultado;
	} 
	
	/*CABECERA: double secante(double numero)
	* DESCRIPCION:Funcion que calcula la secante de un angulo
	 * ENTRADAS:Un numero real
	 * PRECONDICIONES:Ninguna
	 * SALIDAS:numero real
	 * POSTCONDICIONES:El resultado estara entre 0 o 1, -1 si no se pudo calcular y-2 si el valor es infinito ,se devolvera asociado al nombre
	 */
	
	public static double secante (double numero){
		
		double resultado=0;
		numero=convertirRadianes(numero);
		if(numero!=-1)
			resultado=1/coseno(numero);
		else
			resultado=-1;
		if(resultado>1)
			resultado=-2;
		return resultado;
	}
	
	/*CABECERA: double cotangente(double numero)
	 * DESCRIPCION:Funcion que calcula la cotangete de un angulo
	 * ENTRADAS:Un numero real
	 * PRECONDICIONES:Ninguna
	 * SALIDAS:numero real
	 * POSTCONDICIONES:El resultado estara entre 0 o 1, -1 si no se pudo calcular, se devolvera asociado al nombre
	 */
	
	public static double cotangente (double numero){
		
		double resultado=0;
		if(numero!=90 && numero!=360){
		numero=convertirRadianes(numero);
		if(numero!=-1)
			resultado=1/tangente(numero);
		else
			resultado=0;
		}else
			resultado=0;
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
			
			resultado=(numero*PI)/180.0;
		}else
			resultado=-1;
		return resultado;
	}
	
}

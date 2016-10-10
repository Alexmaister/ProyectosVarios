package OperacionesAritmeticas;

/*
CABECERA: public static double potencia (double base, double exponente)

COMENTARIO: El programa calculará la potencia con la base y el exponente dados 
PRECONDICIONES: -
ENTRADAS: la base y el exponente
SALIDAS: el resultado de la potencia
ENTRADA/SALIDA: -
POSTCONDICIONES: El resultado de calcular la potencia de dos numeros
*/

public class Potencia {

	public static double potencia (double base, int exponente){
		double resultado=1.0;
		
	//	resultado=Math.pow(base, exponente);
		
		int i;
		for(i=0;i<exponente;i++){
			resultado*= base;
		}
		
		return resultado;
	}
	
}

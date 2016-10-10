package OperacionesAritmeticas;
/*
  
 CABECERA: public int multiplicar (int numeroOperandos, int operando1, int operando2)
 
 COMENTARIO: El programa multiplicará los operandos recibidos.
 PRECONDICIONES: 
 ENTRADAS: numero de operandos con los que va a operar
 SALIDAS: el resultado de la operacion
 ENTRADA/SALIDA:
 POSTCONDICIONES: el resultado se envia al main, donde un subprograma que lo imprimirá en pantalla

 */

public class Multiplicar {

	public static double multiplicacion (double numero1, double numero2){
		
		double resultado = 0;
		
		resultado = numero1*numero2;
			
		return resultado;
		
	}
	
}

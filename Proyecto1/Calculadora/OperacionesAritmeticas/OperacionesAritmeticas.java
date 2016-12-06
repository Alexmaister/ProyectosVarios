package OperacionesAritmeticas;

public class OperacionesAritmeticas 
{
	/*
	 	PRECONDICIONES: 
	 	ENTRADAS:
	 	SALIDAS:
	 	POSTCONDICIONES:
	 	ENTRADA/SALIDA:
	*/
	public static double division (double dividendo,double divisor) {
		
		double resultado = 0.0;
		
		//Realizamos el calculo
		resultado = dividendo / divisor;
		
		return resultado;
	}


/*
CABECERA: public int multiplicar (int numeroOperandos, int operando1, int operando2)

COMENTARIO: El programa multiplicará los operandos recibidos.
PRECONDICIONES: 
ENTRADAS: numero de operandos con los que va a operar
SALIDAS: el resultado de la operacion
ENTRADA/SALIDA:
POSTCONDICIONES: el resultado se envia al main, donde un subprograma que lo imprimirá en pantalla

*/

	public static double multiplicacion (double numero1, double numero2){
		
		double resultado = 0;
		
		resultado = numero1*numero2;
			
		return resultado;
		
	}
	
	public static double potencia (double base, int exponente){
		double resultado=1.0;
		
	//	resultado=Math.pow(base, exponente);
		
		int i;
		for(i=0;i<exponente;i++){
			resultado*= base;
		}
		
		return resultado;
	}
	
	public static double raizCuadrada(double radicando){
		double resultado=0.0;
		
		System.out.println("El radicando es"+radicando);
		
		return resultado;
	}
	
public static int resta (int numeroOperandos){
		
		int resultado = 0;
		System.out.println("Has entrado en la resta");
		System.out.println("Vas a usar "+numeroOperandos+" operandos");
			
		return resultado;
		
	}

public static double suma (double sumando1, double sumando2){
	
	double resultado = 0.0;
	
	resultado = sumando1 + sumando2;
	
	return resultado;
}

public static int sumatorio (int numeroSumatorio){
	int resultado=0;
	
	System.out.println("El numero al que va a calcularle el sumatorio es: "+numeroSumatorio);
	
	return resultado;		
}

}

package OperacionesAritmeticas;

public class OperacionesAritmeticas 
{
    /*
	CABECERA: public static double dividir (double dividendo, double divisor)
	FUNCIONAMIENTO: devolvera el resultado de la division de los operandos
	ENTRADAS: divisor y dividendo
	PRECONDICIONES: 
	SALIDAS: resultado de la division (real)
	POSTCONDICIONES: 
	ENTRADA/SALIDA:
    */
	public static double dividir (double dividendo,double divisor) {
		
		double resultado = 0.0;
		
		resultado = dividendo / divisor;
		
		return resultado;
	}

    /*
	CABECERA: public static double multiplicar (double numero1, double numero2) 
	FUNCIONAMIENTO: devolvera el resultado de la multiplicacion de los operandos
	ENTRADAS: numero de operandos con los que va a operar
	PRECONDICIONES: 
	SALIDAS: resultado de la multiplicacion (real)
	POSTCONDICIONES: 
	ENTRADA/SALIDA:
    */
	public static double multiplicar (double numero1, double numero2) {
		
		double resultado = 0.0;
		
		resultado = numero1 * numero2;
			
		return resultado;
	}
	
    /*
	CABECERA: public static double potencia (double base, int exponente)
	FUNCIONAMIENTO: devolvera el resultado de elevar el exponente a la base
	ENTRADAS: base y exponente (real) (entero)
	PRECONDICIONES: 
	SALIDAS: resultado de la elevacion (real)
	POSTCONDICIONES: 
	ENTRADA/SALIDA:
    */
	public static double potencia (double base, int exponente) {
		
		double resultado=1.0;
		
		int i;
		for(i=0; i<exponente; i++) {
			resultado *= base;
		}
		
		return resultado;
	}
	
    /*
	CABECERA: public static double raizCuadrada(double radicando)
	FUNCIONAMIENTO: devolvera el resultado de calcular la raiz cuadrada de un radicando
	ENTRADAS: radicando (real)
	PRECONDICIONES: 
	SALIDAS: resultado de la elevacion (real)
	POSTCONDICIONES: 
	ENTRADA/SALIDA:
    */
	public static double raizCuadrada(double radicando) {
		
		double resultado=0.0;
		
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

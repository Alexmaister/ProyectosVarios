package OperacionesAritmeticas;

public class OperacionesAritmeticas 
{
    /*
	CABECERA: public static double suma (double numero1, double numero2)
	FUNCIONAMIENTO: devolvera el resultado de la suma de los numeros
	ENTRADAS: numero1 y numero2 (real) (real)
	PRECONDICIONES: 
	SALIDAS: resultado de la suma (real)
	POSTCONDICIONES: se devolvera un numero comprendido en el rango de numeros reales
	 				 se devuelve asociado al nombre
	ENTRADA/SALIDA:
    */
	public static double suma (double numero1, double numero2) {
		
		double resultado = 0.0;
		
		resultado = numero1 + numero2;
		
		return resultado;
	}

    /*
	CABECERA: public static int resta (double numero1, double numero2)
	FUNCIONAMIENTO: devolvera el resultado de la resta de los numeros
	ENTRADAS: numero1 y numero2 (real) (real)
	PRECONDICIONES: 
	SALIDAS: resultado de la elevacion (real)
	POSTCONDICIONES: numero comprendido en el rango de numeros reales
	 			     se devuelve asociado al nombre
	ENTRADA/SALIDA:
    */
	public static int resta (double numero1, double numero2) {
		
		int resultado = 0;
			
		return resultado;
		
	}
	
    /*
	CABECERA: public static double dividir (double dividendo, double divisor)
	FUNCIONAMIENTO: devolvera el resultado de la division de los operandos, 
	                se devolvera 0 en caso de que el dividendo o divisor sean 0
	ENTRADAS: divisor y dividendo
	PRECONDICIONES: 
	SALIDAS: resultado de la division (real)
	POSTCONDICIONES: se devolvera un numero comprendido en el rango de reales, o 0 en caso
					 de que el dividendo o divisor sean igual a 0
					 se devuelve asociado al nombre
	ENTRADA/SALIDA:
    */
	public static double dividir (double dividendo,double divisor) {
		
		double resultado = 0.0;
		
		if ( (dividendo != 0 && divisor != 0) || (dividendo != 0 || divisor != 0) )
		{
			resultado = dividendo / divisor;
		}
		
		return resultado;
	}

    /*
	CABECERA: public static double multiplicar (double numero1, double numero2) 
	FUNCIONAMIENTO: devolvera el resultado de la multiplicacion de los operandos
	ENTRADAS: numero de operandos con los que va a operar
	PRECONDICIONES: 
	SALIDAS: resultado de la multiplicacion (real)
	POSTCONDICIONES: se devolvera un numero comprendido en el rango de reales
					 se devuelve asociado al nombre
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
	POSTCONDICIONES: se devolvera un numero comprendido en el rango de reales,
					 cuando la base sea 0 el resultado sera 0
					 cuando el exponente sea 0 el resultado es 1
					 se devuelve asociado al nombre
	ENTRADA/SALIDA:
    */
	public static double potencia (double base, int exponente) {
		
		double resultado=0.0;
		
		int i;
		if ( (exponente != 0 && base != 0) || (base != 0 || exponente != 0) )
		{
			for(i = 0; i < exponente; i++) {
				resultado *= base;
			}
		}
		else if ( base == 0)
		{
			resultado = 0;
		}
		else
		{
			resultado = 1;
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
	
    /*
	CABECERA: public static double raizCuadrada(double radicando)
	FUNCIONAMIENTO: devolvera el resultado de calcular la raiz cuadrada de un radicando
	ENTRADAS: radicando (real)
	PRECONDICIONES: 
	SALIDAS: resultado de la elevacion (real)
	POSTCONDICIONES: 
	ENTRADA/SALIDA:
    */
public static int sumatorio (int numeroSumatorio){
	int resultado=0;
	
	System.out.println("El numero al que va a calcularle el sumatorio es: "+numeroSumatorio);
	
	return resultado;		
}

}

package Test;
import OperacionesTrigonometricas.*;
public class PruebaTrigonometrica {
	
	public static void main(String[]args){
		
		double numero=90;
		double resultado=0;
		
		//resultado=OperacionesTrigonometricas.coseno(numero);
		resultado=OperacionesTrigonometricas.seno(numero);
		//resultado=OperacionesTrigonometricas.tangente(numero);
		//resultado=OperacionesTrigonometricas.cosecante(numero);
		//resultado=OperacionesTrigonometricas.secante(numero);
		//resultado=OperacionesTrigonometricas.cotangente(numero);
		//numero=OperacionesTrigonometricas.convertirRadianes(numero);
				
		System.out.println(resultado);
	}

}

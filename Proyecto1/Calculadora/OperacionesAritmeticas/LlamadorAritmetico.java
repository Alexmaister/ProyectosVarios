package OperacionesAritmeticas;

import java.util.Scanner;

import MenusYValidaciones.MostraryValidarMenuAritmetica;

/* 
 
 */
/*  
  DESCRIPCION: el subprograma pedirá la operacion que se quiere realizar del menu
  				 y cuantos operandos vamos a usar. 
   				 
  PRECONDICIONES: La opcion del submenu debe estar entre 0 y 7
  ENTRADAS: Opcion de menu y los operandos
  SALIDAS: -
  POSTCONDICIONES: 
  ENTRADA/SALIDA: 
 */

public class LlamadorAritmetico {
	
	public static void llamadorAritmetico(){
		
		int opcion = 1;
		int resultado = 0;
		Scanner teclado=new Scanner(System.in);
		int numeroOperandos = 0;
		
		do{
			
		opcion = MostraryValidarMenuAritmetica.mostraryValidarMenuAritmetica();
		
		if(opcion!=0){
			
			switch(opcion){
				case 3: 
					System.out.println("¿Cuantos operandos desea utilizar para la multiplicacion?");	
					numeroOperandos=teclado.nextInt();
					resultado = Multiplicar.multiplicacion(numeroOperandos);
				break;
			}
		}
	
		
		}while(opcion!=0);
	}

}

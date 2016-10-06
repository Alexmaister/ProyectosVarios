package OperacionesAritmeticas;

import MenusYValidaciones.MostraryValidarMenuAritmetica;
/* 
SI	OPCION ES DISTINTO A SALIR  					
	SEGUN OPCION		
		CASO 0: SALIR
		CASO 1: SUMAR
		CASO 2: RESTAR
		CASO 3: MULTIPLICAR					
		CASO 4: DIVIDIR
		CASO 5: RAIZ
		CASO 6: POTENCIA
		CASO 7: SUMATORIO  							
	FIN SEGUN
FIN SI  
 */
/*  
  DESCRIPCION: el subprograma pedirá la operacion que se quiere realizar del menu
  				 cuantos operandos vamos a usar,
   				 y los operandos con los que se quiere operar 
   				 
  PRECONDICIONES: La opcion del submenu debe estar entre 0 y 7
  ENTRADAS: Opcion de menu y los operandos
  SALIDAS: -
  POSTCONDICIONES: 
  ENTRADA/SALIDA: 
 */

public class LlamadorAritmetico {
	
	public static void llamadorAritmetico(){
		
		int opcion = 1;
		do{
			
		opcion = MostraryValidarMenuAritmetica.mostraryValidarMenuAritmetica();
		
		}while(opcion!=0);
	}

}

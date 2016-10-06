package OperacionesTrigonometricas;

import MenusYValidaciones.MostraryValidarMenuTrigonometria;
/*
SI	OPCION ES DISTINTO A SALIR
	
	SEGUN OPCION
		
		CASO 0: SALIR
		CASO 1: SENO
		CASO 2: COSENO
		CASO 3: TANGENTE					
		CASO 4: SECANTE
		CASO 5: COSECANTE
		CASO 6: COTANGENTE
		
FIN SEGUN

FIN SI
*/
/*

 DESCRIPCION: el subprograma pedirá la operacion que se quiere realizar del menu
  				 cuantos operandos vamos a usar,
   				 y los operandos con los que se quiere operar 
   				 
  PRECONDICIONES: La opcion del submenu debe estar entre 0 y 6
  ENTRADAS: Opcion de menu y los operandos
  SALIDAS: -
  POSTCONDICIONES: 
  ENTRADA/SALIDA:

*/
public class LlamadorTrigonometrico {
	
	public static void llamadorTrigonometrico(){
	
	int opcion = 1;
	do{
	opcion = MostraryValidarMenuTrigonometria.mostraryValidarMenuTrigonometria();
	}while(opcion!=0);
	
	}

}

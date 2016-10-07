package OperacionesTrigonometricas;

import MenusYValidaciones.MostraryValidarMenuTrigonometria;
/*

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

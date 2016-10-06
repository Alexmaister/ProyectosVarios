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
public class LlamadorTrigonometrico {
	
	public static void llamadorTrigonometrico(){
	
	int opcion = 1;
	
	opcion = MostraryValidarMenuTrigonometria.mostraryValidarMenuTrigonometria();
	}

}

package Main;
import MenusYValidaciones.*;


/*ASIGNACION DE MODULOS
 * 
 * ALE: SUMAR, DIVIDIR, SUMATORIO, TANGENTE, COTANGENTE
 * PAULO: RESTAR, RAIZ, SENO, SECANTE
 * LUIS: MULTIPLICAR, POTENCIA, COSENO, COSECANTE
 * *****Si quereis cambiar un modulo por otro comentarlo aqui debajo***
 * 
 * CAMBIOS:....
 * */

/*
 * ANALISIS:
 *     * Programa que simulara una calculadora con operaciones tanto aritmeticas como trigonometricas
 * 
 * Requisitos:
 *     * Calcular suma
 *     * Calcular resta
 *     * Calcular multiplicacion
 *     * Calcular division
 * 
 * Entradas:
 *     * Opciones de  interacciOn con el menu
 *     * Numeros con los que se realizaran las operaciones
 * 
 * Salidas:
 *     * Se mostraran por pantalla el resultado de las operaciones que se realizen
 *   
 * Restrincciones: 
 *     * Ninguna
 *     
 * Suposiciones: 
 *     * Ninguna
 * 
 * 
 * PSEUDOCODIGO GENERALIZADO:
 * 
 * INICIO
 * 
 * 	REPETIR
 * 
 * 		MOSTRAR Y VALIDAR MENU PRINCIPAL
 * 
 * 		SI	OPCION ES DISTINTO A SALIR
 * 
 * 			SEGUN OPCION
 * 
 * 				CASO 1:
 * 
 * 					OPERACIONES ARITMETICAS
 * 
 * 				CASO 2:
 * 
 * 					OPRACIONES TRIGONOMETRICAS
 * 
 * 			FIN SEGUN
 * 
 * 		FIN SI
 * 
 * 	MIENTRAS OPCION NO SEA SALIR
 * 
 * FIN
 * */
public class Main {

	public static void main(String[]args){
		
		/*MostraryValidarMenuPrincipal MostrarMenuPrincipal = new MenusYValidaciones.MostraryValidarMenuPrincipal();
		MostraryValidarMenuAritmetica MostrarMenuAritmetica = new MenusYValidaciones.MostraryValidarMenuAritmetica();
		MostraryValidarMenuTrigonometria MostrarMenuTrigonometria = new MenusYValidaciones.MostraryValidarMenuTrigonometria();*/
		int opcion = 0;
		@SuppressWarnings("unused")
		int opcionSubmenu = 0;      
				
		do{
			opcion = MostraryValidarMenuPrincipal.mostraryValidarMenuPrincipal();
			
			if(opcion != 0){
				switch(opcion){
				case 1:
					opcionSubmenu = MostraryValidarMenuAritmetica.mostraryValidarMenuAritmetica();
					break;
				case 2: 
					opcionSubmenu = MostraryValidarMenuTrigonometria.mostraryValidarMenuTrigonometria();
					break;
				}
			}
			
		}while(opcion!=0);
		
		
	}

}

package Main;
import java.util.Scanner;

import MenusYValidaciones.*;
import OperacionesAritmeticas.*;
import OperacionesTrigonometricas.*;


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
  ANALISIS:
     * Programa que simulara una calculadora con operaciones tanto aritmeticas como trigonometricas
  
  Requisitos:
      * Calcular suma
      * Calcular resta
      * Calcular multiplicacion
      * Calcular division
  
  Entradas:
      * Opciones de  interacciOn con el menu
      * Numeros con los que se realizaran las operaciones
  
  Salidas:
      * Se mostraran por pantalla el resultado de las operaciones que se realizen
    
  Restrincciones: 
      * Ninguna
      
  Suposiciones: 
      * Ninguna
  
  
 PSEUDOCODIGO GENERALIZADO:
  
  INICIO
  
  	REPETIR
  
  		MOSTRAR Y VALIDAR MENU PRINCIPAL
  
  		SI	OPCION ES DISTINTO A SALIR
  
 			SEGUN OPCION
  
  				CASO 1:	OPERACIONES ARITMETICAS	
  					
  				CASO 2: OPERACIONES TRIGONOMETRICAS
  
  			FIN SEGUN
  
  		FIN SI
  
  	MIENTRAS OPCION NO SEA SALIR
  
  FIN
  
  ----------NIVEL DOS: OPERACIONES ARITMETICAS------------
 CASO 1: 
 	SI OPCION ES DISTINTO A SALIR  					
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
  
   ----------NIVEL DOS: OPERACIONES TRIGONOMETRICAS------------
 CASO 2: 
	SI OPCION ES DISTINTO A SALIR	
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
  
  
  
 * */
public class Main {

	public static void main(String[]args){
		
		/*MostraryValidarMenuPrincipal MostrarMenuPrincipal = new MenusYValidaciones.MostraryValidarMenuPrincipal();
		MostraryValidarMenuAritmetica MostrarMenuAritmetica = new MenusYValidaciones.MostraryValidarMenuAritmetica();
		MostraryValidarMenuTrigonometria MostrarMenuTrigonometria = new MenusYValidaciones.MostraryValidarMenuTrigonometria();*/
		int opcion = 0;
		@SuppressWarnings("unused")
		int opcionSubmenu = 0;  
		Scanner teclado=new Scanner(System.in);
		int numeroOperandos = 0;
		int resultado = 0;
		
		
		do{
			//Mostrar y validar menu.
			opcion = MostraryValidarMenuPrincipal.mostraryValidarMenuPrincipal();
			
			//SI OPCION ES DISTINTO A SALIR
			if(opcion != 0){
				//SEGUN OPCION
				switch(opcion){
				//CASO 1:	OPERACIONES ARITMETICAS
				case 1:
					//SI OPCION ES DISTINTO A SALIR  
					opcionSubmenu = MostraryValidarMenuAritmetica.mostraryValidarMenuAritmetica();
					if(opcionSubmenu!=0){
						//SEGUN OPCION	
						switch(opcionSubmenu){
							//CASO 0: SALIR
							//CASO 1: SUMAR
							case 1:
								break;
							//CASO 2: RESTAR
							case 2:
								break;
							//CASO 3: MULTIPLICAR
							case 3:
								System.out.println("¿Cuantos operandos desea utilizar para la multiplicacion?");	
								numeroOperandos=teclado.nextInt();
								resultado = Multiplicar.multiplicacion(numeroOperandos);
								break;
							//CASO 4: DIVIDIR
							case 4:
								break;
							//CASO 5: RAIZ
							case 5:
								break;
							//CASO 6: POTENCIA
							case 6:
								break;
							//CASO 7: SUMATORIO
							case 7:
								break;
						}//FIN SEGUN
					}//FIN SI 
					opcionSubmenu = MostraryValidarMenuAritmetica.mostraryValidarMenuAritmetica();
					//LlamadorAritmetico.llamadorAritmetico();
					break;
				//CASO 2: OPERACIONES TRIGONOMETRICAS
				case 2: 
					opcionSubmenu = MostraryValidarMenuTrigonometria.mostraryValidarMenuTrigonometria();
					//LlamadorTrigonometrico.llamadorTrigonometrico();
					break;
				}
			}
			
		}while(opcion!=0); 
		
		
	}

}
